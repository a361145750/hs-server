package com.hs.server.controller;

import com.hs.server.domain.File;
import com.hs.server.dto.base.ResponseDTO;
import com.hs.server.service.FileService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * description:${todo} <br/>
 * Date:     2017/7/4 17:17<br/>
 *
 * @author work_tl
 * @see
 * @since JDK 1.8
 */
@Controller
@RequestMapping("/api/file")
@Slf4j
public class FileController {

    @Autowired
    private FileService fileService;


    @RequestMapping(value = "/getFile")
    @ResponseBody
    public void getFile(@RequestParam Long fileId, HttpServletRequest request, HttpServletResponse response) {
        try {
            if (StringUtils.isEmpty(fileId)) {
                response.getOutputStream().print("无文件："+fileId);
            }
            fileService.getFile(fileId, request, response);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }


    @RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<List<Long>> uploadFile(HttpServletRequest request) {
        try {
            List<Long> fileIds = fileService.uploadFile(request);
            return new ResponseDTO("200", "成功", fileIds);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }


    @RequestMapping(value = "/delFile", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<String> delFile(@RequestBody File file) {
        try {
            if (StringUtils.isEmpty(file.getFileId())) {
                return new ResponseDTO("202", "文件ID为空", null);
            }
            fileService.delFile(file.getFileId());
            return new ResponseDTO("200", "成功", null);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

}
