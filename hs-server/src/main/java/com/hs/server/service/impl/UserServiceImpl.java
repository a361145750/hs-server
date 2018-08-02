package com.hs.server.service.impl;

import com.hs.server.dao.impl.UserMapper;
import com.hs.server.domain.User;
import com.hs.server.domain.UserExample;
import com.hs.server.dto.param.UserParam;
import com.hs.server.service.UserService;
import com.hs.server.util.SessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * description:${todo} <br/>
 * Date:     2017/7/9 23:46<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SessionUtil sessionUtil;

    @Override
    public List<User> getUsers(UserParam user) {
        UserExample example = new UserExample();
        example.setOrderByClause("create_date desc");
        UserExample.Criteria criteria = example.createCriteria();
        if(!StringUtils.isEmpty(user.getUserName())){
            criteria.andUserNameLike("%"+ user.getUserName()+"%");
        }
        if(!StringUtils.isEmpty(user.getLoginId())){
            criteria.andLoginIdEqualTo(user.getLoginId());
        }
        if(!StringUtils.isEmpty(user.getRole())){
            criteria.andRoleEqualTo(user.getRole());
        }
        if(!StringUtils.isEmpty(user.getFrom())){
            Date from = user.getFrom();
            from.setHours(0);
            from.setMinutes(0);
            from.setSeconds(0);
            criteria.andCreateDateGreaterThanOrEqualTo(from);
        }
        if(!StringUtils.isEmpty(user.getTo())){
            Date to = user.getTo();
            to.setHours(23);
            to.setMinutes(59);
            to.setSeconds(59);
            criteria.andCreateDateLessThanOrEqualTo(to);
        }
        return userMapper.selectByExample(example);
    }

    @Override
    public void addUser(User user) {
        sessionUtil.setCurrentUserInfo(user, 0);
        userMapper.insert(user);
    }

    @Override
    public void updateUser(User user) {
        user.setPassWord(null);
        user.setLoginId(null);
        sessionUtil.setCurrentUserInfo(user, 1);
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public void delUser(Long userId) {
        userMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public void changePass(User user) {
        User userNew = new User();
        userNew.setUserId(user.getUserId());
        userNew.setPassWord(user.getPassWord());
        sessionUtil.setCurrentUserInfo(user, 1);
        userMapper.updateByPrimaryKeySelective(userNew);
    }
}
