package com.hs.server.service;

import com.hs.server.domain.RecordAttch;
import com.hs.server.dto.param.RecordParam;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Date:     2018/7/26 14:56<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
public interface RecordAttchService {
    List<RecordAttch> queryRecordAttchs(RecordParam record);

    void getFileByAttch(String attchFileId, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
