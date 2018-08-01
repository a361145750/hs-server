package com.hs.server.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hs.server.domain.User;
import com.hs.server.dto.base.PageDTO;
import com.hs.server.dto.base.ResponseDTO;
import com.hs.server.dto.param.UserParam;
import com.hs.server.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * description:${todo} <br/>
 * Date:     2017/7/4 17:17<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/api/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/queryUsers", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<PageDTO<User>> queryUsers(@RequestBody UserParam user) {
        try {
            PageHelper.startPage(user.getPageNum(),user.getPageSize(),true);
            List<User> users = userService.getUsers(user);
            users.stream().forEach(user1 -> {
                user1.setPassWord(null);
            });
            PageInfo<User> userPageInfo = new PageInfo<>(users);
            return new ResponseDTO("200", "成功", new PageDTO(userPageInfo));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<User> addUser(@RequestBody User user) {
        try {
            userService.addUser(user);
            return new ResponseDTO("200", "成功", user);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<User> updateUser(@RequestBody User user) {
        try {
            if(StringUtils.isEmpty(user.getUserId())){
                return new ResponseDTO("202", "未填写用户ID", null);
            }
            userService.updateUser(user);
            return new ResponseDTO("200", "成功", user);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/changePass", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<User> changePass(@RequestBody User user) {
        try {
            if(StringUtils.isEmpty(user.getUserId())){
                return new ResponseDTO("202", "未填写用户ID", null);
            }
            userService.changePass(user);
            return new ResponseDTO("200", "成功", user);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/delUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<String> delUser(@RequestBody User user) {
        try {
            if (StringUtils.isEmpty(user.getUserId())) {
                return new ResponseDTO("202", "未填写用户ID", null);
            }
            userService.delUser(user.getUserId());
            return new ResponseDTO("200", "成功", null);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

}
