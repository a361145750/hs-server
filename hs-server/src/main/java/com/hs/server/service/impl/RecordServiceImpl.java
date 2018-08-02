package com.hs.server.service.impl;

import com.hs.server.dao.impl.RecordAttchExMapper;
import com.hs.server.dao.impl.RecordAttchMapper;
import com.hs.server.dao.impl.RecordMapper;
import com.hs.server.domain.Record;
import com.hs.server.domain.RecordAttch;
import com.hs.server.domain.RecordAttchExample;
import com.hs.server.domain.RecordExample;
import com.hs.server.dto.param.RecordParam;
import com.hs.server.service.RecordService;
import com.hs.server.util.NumberSequenceUtil;
import com.hs.server.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Date:     2018/7/25 15:52<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
@Service
@Transactional
public class RecordServiceImpl implements RecordService {

    @Autowired
    private RecordMapper recordMapper;

    @Autowired
    private RecordAttchMapper recordAttchMapper;

    @Autowired
    private RecordAttchExMapper recordAttchExMapper;

    @Autowired
    private SessionUtil sessionUtil;

    @Override
    public List<Record> getRecords(RecordParam record) {
        RecordExample example = new RecordExample();
        example.setOrderByClause("create_date desc");
        RecordExample.Criteria criteria = example.createCriteria();
        if(!StringUtils.isEmpty(record.getCustomId())){
            criteria.andCustomIdEqualTo(record.getCustomId());
        }
        if(!StringUtils.isEmpty(record.getDisinerId())){
            criteria.andDisinerIdEqualTo(record.getDisinerId());
        }
        if(!StringUtils.isEmpty(record.getDisinType())){
            criteria.andDisinTypeLike("%"+ record.getDisinType()+"%");
        }
        if(!StringUtils.isEmpty(record.getFrom())){
            Date from = record.getFrom();
            from.setHours(0);
            from.setMinutes(0);
            from.setSeconds(0);
            criteria.andCreateDateGreaterThanOrEqualTo(from);
        }
        if(!StringUtils.isEmpty(record.getTo())){
            Date to = record.getTo();
            to.setHours(23);
            to.setMinutes(59);
            to.setSeconds(59);
            criteria.andCreateDateLessThanOrEqualTo(to);
        }
        return recordMapper.selectByExample(example);
    }

    @Override
    public void addRecord(Record record) {
        if(StringUtils.isEmpty(record.getRecordId())){
            record.setRecordId(NumberSequenceUtil.getRecordNum());
        }
        sessionUtil.setCurrentUserInfo(record, 0);
        recordMapper.insert(record);

        List<Long> cusRecordFileIds = record.getCusRecordFileIds();
        List<Long> desRecordFileIds = record.getDesRecordFileIds();
        if(!CollectionUtils.isEmpty(cusRecordFileIds)){
            for (int i = 0; i < cusRecordFileIds.size(); i++) {
                RecordAttch attch = new RecordAttch();
                attch.setRecordAttchId(NumberSequenceUtil.getAttchNum());
                attch.setCustomId(record.getCustomId());
                attch.setRecordId(record.getRecordId());
                attch.setFileId(cusRecordFileIds.get(i));
                attch.setRecordAttchType("0");
                recordAttchMapper.insert(attch);
            }
        }
        if(!CollectionUtils.isEmpty(desRecordFileIds)){
            for (int i = 0; i < desRecordFileIds.size(); i++) {
                RecordAttch attch = new RecordAttch();
                attch.setRecordAttchId(NumberSequenceUtil.getAttchNum());
                attch.setCustomId(record.getCustomId());
                attch.setRecordId(record.getRecordId());
                attch.setFileId(desRecordFileIds.get(i));
                attch.setRecordAttchType("1");
                recordAttchMapper.insert(attch);
            }
        }
    }

    @Override
    public void updateRecord(Record record) {
        sessionUtil.setCurrentUserInfo(record, 1);
        recordMapper.updateByPrimaryKeySelective(record);

        List<Long> cusRecordFileIds = record.getCusRecordFileIds();
        List<Long> desRecordFileIds = record.getDesRecordFileIds();
        if(!CollectionUtils.isEmpty(cusRecordFileIds) || !CollectionUtils.isEmpty(desRecordFileIds)){
            recordAttchExMapper.deleteByCustomAndRecord(record);
        }

        if(!CollectionUtils.isEmpty(cusRecordFileIds)){
            for (int i = 0; i < cusRecordFileIds.size(); i++) {
                RecordAttch attch = new RecordAttch();
                attch.setRecordAttchId(NumberSequenceUtil.getAttchNum());
                attch.setCustomId(record.getCustomId());
                attch.setRecordId(record.getRecordId());
                attch.setFileId(cusRecordFileIds.get(i));
                attch.setRecordAttchType("0");
                recordAttchMapper.insert(attch);
            }
        }
        if(!CollectionUtils.isEmpty(desRecordFileIds)){
            for (int i = 0; i < desRecordFileIds.size(); i++) {
                RecordAttch attch = new RecordAttch();
                attch.setRecordAttchId(NumberSequenceUtil.getAttchNum());
                attch.setCustomId(record.getCustomId());
                attch.setRecordId(record.getRecordId());
                attch.setFileId(desRecordFileIds.get(i));
                attch.setRecordAttchType("1");
                recordAttchMapper.insert(attch);
            }
        }

    }

    @Override
    public void delRecord(String recordId) {
        Record record = recordMapper.selectByPrimaryKey(recordId);
        recordMapper.deleteByPrimaryKey(recordId);
        recordAttchExMapper.deleteByCustomAndRecord(record);
    }

    @Override
    public Record queryRecordDetail(RecordParam record) {
        Record recordDto = recordMapper.selectByPrimaryKey(record.getRecordId());
        RecordAttchExample example = new RecordAttchExample();
        RecordAttchExample.Criteria criteria = example.createCriteria();
        criteria.andRecordIdEqualTo(record.getRecordId());
        List<RecordAttch> recordAttches = recordAttchMapper.selectByExample(example);
        List<Long> cusRecordFileIds = new ArrayList<>();
        List<Long> desRecordFileIds = new ArrayList<>();
        if(!CollectionUtils.isEmpty(recordAttches)){
            for (int i = 0; i < recordAttches.size(); i++) {
                RecordAttch attch = recordAttches.get(i);
                if("0".equals(attch.getRecordAttchType())) {
                    cusRecordFileIds.add(attch.getFileId());
                } else if ("1".equals(attch.getRecordAttchType())){
                    desRecordFileIds.add(attch.getFileId());
                }
            }
            recordDto.setCusRecordFileIds(cusRecordFileIds);
            recordDto.setDesRecordFileIds(desRecordFileIds);
        }
        return recordDto;
    }
}
