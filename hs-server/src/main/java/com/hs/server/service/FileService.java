package com.hs.server.service;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Date:     2018/7/26 16:17<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
public interface FileService {
    void getFile(Long attchFileId,  HttpServletRequest request, HttpServletResponse response) throws Exception;

    List<Long> uploadFile(HttpServletRequest request) throws Exception;

    void delFile(Long fileId) throws Exception;
}
