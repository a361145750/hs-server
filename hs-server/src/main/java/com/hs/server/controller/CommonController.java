package com.hs.server.controller;

import com.alibaba.fastjson.JSON;
import com.hs.server.domain.User;
import com.hs.server.dto.base.ResponseDTO;
import com.hs.server.dto.param.MenuDTO;
import com.hs.server.util.SessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
@Slf4j
@RequestMapping(value = "/api/com")
public class CommonController {

    @Autowired
    private SessionUtil sessionUtil;

    private String adminMenu = "[{\"menuId\":\"2\",\"menuName\":\"系统管理\",\"menuHref\":\"\",\"menuIcon\":\"\",\"parentMenuId\":\"0\"},{\"menuId\":\"21\",\"menuName\":\"用户管理\",\"menuHref\":\"rout/user\",\"menuIcon\":\"\",\"parentMenuId\":\"2\"},{\"menuId\":\"22\",\"menuName\":\"码表管理\",\"menuHref\":\"rout/codeTable\",\"menuIcon\":\"\",\"parentMenuId\":\"2\"}]";

    private String comMenu = "[{\"menuId\":\"31\",\"menuName\":\"客户管理\",\"menuHref\":\"rout/custom\",\"menuIcon\":\"\",\"parentMenuId\":\"3\"},{\"menuId\":\"11\",\"menuName\":\"首页\",\"menuHref\":\"rout/home\",\"menuIcon\":\"\",\"parentMenuId\":\"1\"},]";

    private String rootMenu = "[{\"menuId\":\"1\",\"menuName\":\"首页\",\"menuHref\":\"\",\"menuIcon\":\"\",\"parentMenuId\":\"0\"},{\"menuId\":\"3\",\"menuName\":\"客户管理\",\"menuHref\":\"\",\"menuIcon\":\"\",\"parentMenuId\":\"0\"}]";

    @RequestMapping(value = "/getMenuList", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<List<MenuDTO>> getMenuList() {
        List<MenuDTO> menuData = new ArrayList<>();

        List<MenuDTO> comMs = JSON.parseArray(comMenu, MenuDTO.class);
        menuData.addAll(comMs);

        List<MenuDTO> rootMs = JSON.parseArray(rootMenu, MenuDTO.class);
        menuData.addAll(rootMs);

        User currentUser = sessionUtil.getCurrentUser();
        if(currentUser != null){
            Long role = currentUser.getRole();
            if(role == 0 ){
                List<MenuDTO> adminMs = JSON.parseArray(adminMenu, MenuDTO.class);
                menuData.addAll(adminMs);
            }
        }

        return new ResponseDTO("200", "操作成功", menuData);
    }

}
