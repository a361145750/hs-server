package com.hs.server.service.impl;

import com.hs.server.dao.impl.RecordAttchMapper;
import com.hs.server.domain.RecordAttch;
import com.hs.server.domain.RecordAttchExample;
import com.hs.server.dto.param.RecordParam;
import com.hs.server.service.FileService;
import com.hs.server.service.RecordAttchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Date:     2018/7/27 10:49<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
@Service
@Transactional
public class RecordAttchServiceImpl implements RecordAttchService {
    @Autowired
    RecordAttchMapper recordAttchMapper;

    @Autowired
    FileService fileService;

    @Override
    public List<RecordAttch> queryRecordAttchs(RecordParam record) {
        RecordAttchExample example = new RecordAttchExample();
        example.setOrderByClause("create_date desc");
        RecordAttchExample.Criteria criteria = example.createCriteria();
        if(!StringUtils.isEmpty(record.getRecordId())){
            criteria.andRecordIdEqualTo(record.getRecordId());
        }

        return recordAttchMapper.selectByExample(example);
    }

    @Override
    public void getFileByAttch(String attchFileId, HttpServletRequest request, HttpServletResponse response) throws Exception {
        RecordAttch recordAttch = recordAttchMapper.selectByPrimaryKey(attchFileId);
        if(recordAttch != null){
            fileService.getFile(recordAttch.getFileId(), request, response);
        }
    }
}
