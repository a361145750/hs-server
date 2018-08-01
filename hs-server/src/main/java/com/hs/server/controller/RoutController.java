package com.hs.server.controller;

import com.hs.server.domain.User;
import com.hs.server.util.SessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
public class RoutController {

    @Autowired
    private SessionUtil sessionUtil;


    @RequestMapping(value = "/rout/{page}", method = RequestMethod.GET)
    public String routPage(@PathVariable("page") String page) {
        return "view/" + page;
    }


    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public String home(Model model) {
        User currentUser = sessionUtil.getCurrentUser();
        model.addAttribute("user", currentUser);
        return "main";
    }

}
