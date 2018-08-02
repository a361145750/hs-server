package com.hs.server.service.impl;

import com.hs.server.dao.impl.CustomMapper;
import com.hs.server.domain.Custom;
import com.hs.server.domain.CustomExample;
import com.hs.server.dto.param.CustomParam;
import com.hs.server.service.CustomService;
import com.hs.server.util.NumberSequenceUtil;
import com.hs.server.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Date:     2018/7/24 11:27<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
@Service
@Transactional
public class CustomServiceImpl implements CustomService {

    @Autowired
    private CustomMapper customMapper;

    @Autowired
    private SessionUtil sessionUtil;

    @Override
    public List<Custom> getCustoms(CustomParam custom) {
        CustomExample example = new CustomExample();
        example.setOrderByClause("create_date desc");
        CustomExample.Criteria criteria = example.createCriteria();
        if(!StringUtils.isEmpty(custom.getCardId())){
            criteria.andCardIdEqualTo(custom.getCardId());
        }
        if(!StringUtils.isEmpty(custom.getUserName())){
            criteria.andUserNameLike("%"+ custom.getUserName()+"%");
        }
        if(!StringUtils.isEmpty(custom.getPhone())){
            criteria.andPhoneLike("%"+ custom.getPhone()+"%");
        }
        if(!StringUtils.isEmpty(custom.getWeixin())){
            criteria.andWeixinLike("%"+ custom.getWeixin()+"%");
        }
        if(!StringUtils.isEmpty(custom.getBirthFrom())){
            criteria.andBirthdayGreaterThanOrEqualTo(custom.getBirthFrom());
        }
        if(!StringUtils.isEmpty(custom.getBirthTo())){
            criteria.andBirthdayLessThanOrEqualTo(custom.getBirthTo());
        }
        if(!StringUtils.isEmpty(custom.getFrom())){
            Date from = custom.getFrom();
            from.setHours(0);
            from.setMinutes(0);
            from.setSeconds(0);
            criteria.andCreateDateGreaterThanOrEqualTo(from);
        }
        if(!StringUtils.isEmpty(custom.getTo())){
            Date to = custom.getTo();
            to.setHours(23);
            to.setMinutes(59);
            to.setSeconds(59);
            criteria.andCreateDateLessThanOrEqualTo(to);
        }
        return customMapper.selectByExample(example);
    }

    @Override
    public void addCustom(Custom custom) {
        if(StringUtils.isEmpty(custom.getCustomId())){
            custom.setCustomId(NumberSequenceUtil.getCustomNum());
        }
        sessionUtil.setCurrentUserInfo(custom, 0);
        customMapper.insert(custom);
    }

    @Override
    public void updateCustom(Custom custom) {
        sessionUtil.setCurrentUserInfo(custom, 1);
        customMapper.updateByPrimaryKeySelective(custom);
    }

    @Override
    public void delCustom(String customId) {
        customMapper.deleteByPrimaryKey(customId);
    }

    @Override
    public Custom queryCustomDetail(CustomParam custom) {
        return customMapper.selectByPrimaryKey(custom.getCustomId());
    }
}
