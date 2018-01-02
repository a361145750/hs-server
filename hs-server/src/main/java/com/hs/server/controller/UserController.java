package com.hs.server.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hs.server.domain.User;
import com.hs.server.dto.base.PageDTO;
import com.hs.server.dto.base.ResponseDTO;
import com.hs.server.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public class UserController {

    Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/main")
    public String userInit(Model model) {
        List<User> users = userService.getUsers(new User());
        model.addAttribute("users", users);
        return "user";
    }

    @RequestMapping(value = "/queryUsers", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<PageDTO<User>> queryUsers(@RequestBody User user) {
        try {
            PageHelper.offsetPage(user.getOffset(),user.getPageSize());
            List<User> users = userService.getUsers(user);
            PageInfo<User> userPageInfo = new PageInfo<>(users);
            return new ResponseDTO<>("200", "成功", new PageDTO(userPageInfo));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO<>("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<User> addUser(@RequestBody User user) {
        try {
            userService.addUser(user);
            return new ResponseDTO<>("200", "成功", user);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO<>("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<User> updateUser(@RequestBody User user) {
        try {
            userService.updateUser(user);
            return new ResponseDTO<>("200", "成功", user);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO<>("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/delUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<String> delUser(@RequestBody User user) {
        try {
            if (StringUtils.isEmpty(user.getUserId())) {
                return new ResponseDTO<>("202", "用户ID为空", null);
            }
            userService.delUser(user.getUserId());
            return new ResponseDTO<>("200", "成功", null);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO<>("201", "系统内部错误", null);
        }
    }

}
