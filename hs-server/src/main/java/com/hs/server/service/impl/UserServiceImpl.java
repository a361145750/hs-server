package com.hs.server.service.impl;

import com.hs.server.dao.UserDAO;
import com.hs.server.domain.User;
import com.hs.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<User> getUsers(User user) {
        return userDAO.getUsers(user);
    }

    @Override
    public void addUser(User user) {
        userDAO.insert(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.update(user);
    }

    @Override
    public void delUser(Long userId) {
        userDAO.delete(userId);
    }
}
