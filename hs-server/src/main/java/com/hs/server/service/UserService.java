package com.hs.server.service;

import com.hs.server.domain.User;
import com.hs.server.dto.param.UserParam;

import java.util.List;

/**
 * description:${todo} <br/>
 * Date:     2017/7/9 23:46<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
public interface UserService {
    List<User> getUsers(UserParam user);
    void addUser(User user);
    void updateUser(User user);
    void delUser(Long userId);

    void changePass(User user);
}
