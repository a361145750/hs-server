package com.hs.server.controller;

import com.hs.server.domain.Person;
import com.hs.server.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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
public class TestController {

    Logger log = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index(Model model) {
        Person single = new Person("aa", 11);
        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("zhangsan", 11);
        Person p2 = new Person("lisi", 22);
        Person p3 = new Person("wangwu", 33);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }

    @RequestMapping("/user")
    public String userInit(Model model) {

        return "user";
    }

    @RequestMapping("/upload")
    public String test1(Model model) {

        return "upload";
    }

    @RequestMapping("/main")
    public String main(Model model) {

        return "main";
    }
}
