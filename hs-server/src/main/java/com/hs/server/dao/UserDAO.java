package com.hs.server.dao;

import com.hs.server.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * description:${todo} <br/>
 * Date:     2017/7/9 23:55<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
@Mapper
public interface UserDAO {
    public List<User> getUsers(User user);
    public void insert(User user);
    public void update(User user);
    public void delete(Long userId);
}
