package com.itheima.d4_byte_stream;

import java.io.*;

public class CopyTest5 {
    public static void main(String[] args){
        try (InputStream is = new FileInputStream("C:\\Users\\lenovo\\Pictures\\Saved Pictures\\65fcf9ed8a136327960aaa80868fa0ec09fac747.jpg");
             OutputStream os = new FileOutputStream("D:\\data\\零.jpg");
             //这里只能放置资源对象
             ){

            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer,0,len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
