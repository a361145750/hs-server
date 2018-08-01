package com.hs.server.service.impl;

import com.hs.server.dao.impl.FileMapper;
import com.hs.server.domain.File;
import com.hs.server.service.FileService;
import com.hs.server.util.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Date:     2018/7/26 16:17<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
@Service
@Transactional
@Slf4j
public class FileServiceImpl implements FileService {
    private static Map<String, String> EXT_MAP = new HashMap();

    static {
        EXT_MAP.put("jpg", "image/jpeg");
        EXT_MAP.put("png", "image/png");
        EXT_MAP.put("jpe", "image/jpeg");
        EXT_MAP.put("gif", "image/gif");
    }

    @Autowired
    private FileMapper fileMapper;
    @Autowired
    private FileUtil fileUtil;

    @Override
    public void getFile(Long fileId, HttpServletRequest request, HttpServletResponse response) throws Exception{
        File file = fileMapper.selectByPrimaryKey(fileId);
        if(file != null){
            String fileName = file.getFileName();
            String filePath = file.getFilePath();
            String fileExt = fileUtil.getFileExt(fileName);
            byte[] bytes = fileUtil.readFile(filePath);
            if(bytes != null){
                response.setContentType(EXT_MAP.get(fileExt));
                ByteArrayInputStream in = new ByteArrayInputStream(bytes);
                ServletOutputStream out = response.getOutputStream();
                IOUtils.copy(in, out);
                in.close();
                out.close();
                response.flushBuffer();
            }
        }
    }

    @Override
    public List<Long> uploadFile(HttpServletRequest request) throws Exception{
        List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");
        MultipartFile file = null;
        List<Long> fileIds = new ArrayList<>();
        for (int i = 0; i < files.size(); ++i) {
            file = files.get(i);
            String fileName = fileUtil.creatAttchFileName(file.getOriginalFilename());
            String filePath = fileUtil.creatAttchFilePath(fileName);
            long size = file.getSize();
            File fileEntity = new File();
            fileEntity.setFileName(fileName);
            fileEntity.setFilePath(filePath);
            fileEntity.setFileSize(String.valueOf(size));
            fileMapper.insert(fileEntity);
            fileIds.add(fileEntity.getFileId());

            fileUtil.writeFile(filePath, file.getBytes());
        }
        return fileIds;
    }

    @Override
    public void delFile(Long fileId) throws Exception{
        File file = fileMapper.selectByPrimaryKey(fileId);
        fileMapper.deleteByPrimaryKey(fileId);
        fileUtil.delAttchFilePath(file.getFilePath());
    }
}
