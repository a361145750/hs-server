package com.hs.server.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hs.server.domain.Record;
import com.hs.server.domain.RecordAttch;
import com.hs.server.dto.base.PageDTO;
import com.hs.server.dto.base.ResponseDTO;
import com.hs.server.dto.param.RecordParam;
import com.hs.server.service.RecordAttchService;
import com.hs.server.service.RecordService;
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
@RequestMapping("/api/record")
@Slf4j
public class RecordController {

    @Autowired
    private RecordService recordService;

    @Autowired
    private RecordAttchService recordAttchService;

    @RequestMapping(value = "/queryRecords", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<PageDTO<Record>> queryRecords(@RequestBody RecordParam record) {
        try {
            PageHelper.startPage(record.getPageNum(),record.getPageSize(),true);
            List<Record> Records = recordService.getRecords(record);
            PageInfo<Record> recordPageInfo = new PageInfo<>(Records);
            return new ResponseDTO("200", "成功", new PageDTO(recordPageInfo));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/queryRecordDetail", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<Record> queryRecordDetail(@RequestBody RecordParam record) {
        try {
            if(StringUtils.isEmpty(record.getRecordId())){
                return new ResponseDTO("202", "未填写记录ID", null);
            }
            Record recordDTO = recordService.queryRecordDetail(record);
            return new ResponseDTO("200", "成功", recordDTO);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/addRecord", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<Record> addRecord(@RequestBody Record record) {
        try {
            recordService.addRecord(record);
            return new ResponseDTO("200", "成功", record);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/updateRecord", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<Record> updateRecord(@RequestBody Record record) {
        try {
            if(StringUtils.isEmpty(record.getRecordId())){
                return new ResponseDTO("202", "未填写记录ID", null);
            }
            recordService.updateRecord(record);
            return new ResponseDTO("200", "成功", record);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }

    @RequestMapping(value = "/delRecord", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<String> delRecord(@RequestBody RecordParam record) {
        try {
            if(StringUtils.isEmpty(record.getRecordId())){
                return new ResponseDTO("202", "未填写记录ID", null);
            }
            recordService.delRecord(record.getRecordId());
            return new ResponseDTO("200", "成功", null);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }


    @RequestMapping(value = "/queryRecordAttchs", method = RequestMethod.POST)
    @ResponseBody
    public ResponseDTO<RecordAttch> queryRecordAttchs(@RequestBody RecordParam record) {
        try {
            if(StringUtils.isEmpty(record.getRecordId())){
                return new ResponseDTO("202", "未填写记录ID", null);
            }
            List<RecordAttch> recordAttches = recordAttchService.queryRecordAttchs(record);
            return new ResponseDTO("200", "成功", recordAttches);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return new ResponseDTO("201", "系统内部错误", null);
        }
    }


    @RequestMapping(value = "/getFileByAttch")
    @ResponseBody
    public void getFileByAttch(@RequestParam String attchFileId, HttpServletRequest request, HttpServletResponse response) {
        try {
            if (StringUtils.isEmpty(attchFileId)) {
                response.getOutputStream().print("无文件："+attchFileId);
            }
            recordAttchService.getFileByAttch(attchFileId, request, response);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }

}
