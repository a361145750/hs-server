package com.hs.server.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hs.server.domain.Custom;
import com.hs.server.dto.base.PageDTO;
import com.hs.server.dto.base.ResponseDTO;
import com.hs.server.dto.param.CustomParam;
import com.hs.server.service.CustomService;
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
@RequestMapping("/api/cus")
@Slf4j
public class CustomController {

    @Autowired
    private CustomService customService;

    @RequestMapping(value = "/queryCustoms", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<PageDTO<Custom>> queryCustoms(@RequestBody CustomParam custom) {
        try {
            PageHelper.startPage(custom.getPageNum(),custom.getPageSize(),true);
            List<Custom> customs = customService.getCustoms(custom);
            PageInfo<Custom> CustomPageInfo = new PageInfo<>(customs);
            return new ResponseDTO("200", "成功", new PageDTO(CustomPageInfo));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/queryCustomDetail", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<Custom> queryCustomDetail(@RequestBody CustomParam custom) {
        try {
            if(StringUtils.isEmpty(custom.getCustomId())){
                return new ResponseDTO("202", "未填写客户ID", null);
            }
            Custom customDTO = customService.queryCustomDetail(custom);
            return new ResponseDTO("200", "成功", customDTO);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/addCustom", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<Custom> addCustom(@RequestBody Custom custom) {
        try {
            customService.addCustom(custom);
            return new ResponseDTO("200", "成功", custom);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/updateCustom", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<Custom> updateCustom(@RequestBody Custom custom) {
        try {
            if(StringUtils.isEmpty(custom.getCustomId())){
                return new ResponseDTO("202", "未填写客户ID", null);
            }
            customService.updateCustom(custom);
            return new ResponseDTO("200", "成功", custom);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/delCustom", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<String> delCustom(@RequestBody CustomParam custom) {
        try {
            if (StringUtils.isEmpty(custom.getCustomId())) {
                return new ResponseDTO("202", "未填写客户ID", null);
            }
            customService.delCustom(custom.getCustomId());
            return new ResponseDTO("200", "成功", null);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

}
