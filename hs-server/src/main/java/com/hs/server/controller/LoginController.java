package com.hs.server.controller;

import com.hs.server.config.WebSecurityConfig;
import com.hs.server.domain.User;
import com.hs.server.dto.param.UserParam;
import com.hs.server.dto.base.ResponseDTO;
import com.hs.server.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;

/**
 * description:${todo} <br/>
 * Date:     2017/7/4 17:17<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
@Controller
@Slf4j
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<Map<String, Object>> doLogin(String login, String password, HttpSession session) {
        UserParam user = new UserParam();
        user.setLoginId(login);
        List<User> users = userService.getUsers(user);
        if(!CollectionUtils.isEmpty(users)){
            User userDb = users.get(0);
            if(userDb.getPassWord().equals(password)){
                session.setAttribute(WebSecurityConfig.SESSION_KEY, userDb);
                return new ResponseDTO("200", "登录成功", null);
            } else {
                return new ResponseDTO("402", "密码错误", null);
            }
        } else {
            return new ResponseDTO("401", "用户不存在", null);
        }
    }


    @RequestMapping(value = "/doLogout", method = RequestMethod.GET)
    public String doLogout(HttpSession session) {
        // 移除session
        session.removeAttribute(WebSecurityConfig.SESSION_KEY);
        return "redirect:/login";
    }

}
