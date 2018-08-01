package com.hs.server.util;

import com.github.pagehelper.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Date:     2018/7/26 15:15<br/>
 *
 * @author Administrator
 * @see
 * @since JDK 1.8
 */
@Component
@Slf4j
public class FileUtil {

    @Value("${file.fileUploadBasePath}")
    public String fileUploadBasePath;

    @Value("${file.fileUploadPath}")
    public String fileUploadPath;

    public byte[] readFile(String fileName){
        if(StringUtil.isNotEmpty(fileName)){
            File file = new File(fileName);
            if(file.exists()){
                try (FileInputStream fi = new FileInputStream(file);
                     BufferedInputStream in = new BufferedInputStream(fi);
                     ByteArrayOutputStream out = new ByteArrayOutputStream()) {
                    byte[] buffer = new byte[1024];
                    int i = in.read(buffer);
                    List<Byte[]> returnBytes = new ArrayList<>();
                    while (i != -1) {
                        out.write(buffer, 0, i);
                        i = in.read(buffer);
                    }
                    return out.toByteArray();
                } catch (Exception e) {
                    log.error(e.getMessage(), e);
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public void writeFile(String fileName, byte[] content){
        if(StringUtil.isNotEmpty(fileName) && content!=null){
            File file = new File(fileName);
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            try (FileOutputStream out = new FileOutputStream(file)){
                out.write(content);
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                e.printStackTrace();
            }
        }
    }

    public void copyFile(String src,String dest){
        FileInputStream in=null;
        FileOutputStream out=null;
        try {
            in=new FileInputStream(src);
            File file=new File(dest);
            if(!file.getParentFile().exists())
                file.getParentFile().mkdirs();
            if(!file.exists())
                file.createNewFile();
            out=new FileOutputStream(file);
            int c;
            byte buffer[]=new byte[1024];
            while((c=in.read(buffer))!=-1){
                for(int i=0;i<c;i++)
                    out.write(buffer[i]);
            }
        } catch (Exception e){
            log.error(e.getMessage(), e);
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String creatAttchFileName(String fileName){
        String ext = getFileExt(fileName);
        return new StringBuilder(NumberSequenceUtil.getTimeString()+NumberSequenceUtil.getRadomNum()+ext).toString();

    }

    public String creatAttchFilePath(String fileName){
        return new StringBuilder(fileUploadBasePath).append(fileUploadPath).append("/").append(NumberSequenceUtil.getDateString()).append("/").append(fileName).toString();

    }

    public void delAttchFilePath(String filePath){
        File file=new File(filePath);
        if(file.exists()){
            file.delete();
        }
    }

    public String getFileExt(String fileName){
        return fileName.substring(fileName.lastIndexOf("."));
    }

}
