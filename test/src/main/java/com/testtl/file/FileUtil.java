package main.java.com.testtl.file;



import org.apache.commons.lang.StringUtils;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by work_tl on 2016/4/23.
 */
public class FileUtil {

    public static String readFile(String fileName){
        if(StringUtils.isNotEmpty(fileName)){
            File file = new File(fileName);
            if(file.exists()){
                try (FileInputStream fi = new FileInputStream(file);
                    InputStreamReader in = new InputStreamReader(fi,"UTF-8");
                    BufferedReader  reader = new BufferedReader(in) ){
                    StringBuilder sb = new StringBuilder();
                    String temp = reader.readLine();
                    while (temp!=null){
                        sb.append(temp).append("\r\n");
                        temp = reader.readLine();
                    }
                    return sb.toString();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return "";
    }

    public static void writeFile(String fileName, byte[] content){
        if(StringUtils.isNotEmpty(fileName) && content!=null){
            File file = new File(fileName,"UTF-8");
            if(!file.getParentFile().exists()){
                file.getParentFile().mkdirs();
            }
            try (FileOutputStream out = new FileOutputStream(file)){
                out.write(content);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void copyFile(String src,String dest){
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

    public static void main(String[] args) throws IOException {
//        copyFile("c:/i1.jpg","c:/i2.jpg");
//        System.out.println(readFile("c:/test.py"));

        FileInputStream in = new FileInputStream("c:/test.py");
        FileChannel channel = in.getChannel();
        ByteBuffer by = ByteBuffer.allocate(1024);
        while(true){
            by.clear();
            int i = channel.read(by);
            if(i==-1){
                break;
            }
            by.flip();
            System.out.print(new String(by.array()));
        }
    }

}
