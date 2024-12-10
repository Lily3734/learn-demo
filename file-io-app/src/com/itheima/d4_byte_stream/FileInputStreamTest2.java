package com.itheima.d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest2 {
    public static void main(String[] args) throws IOException {
        //通道
        InputStream is = new FileInputStream("D:\\code\\javasepromax\\file-io-app\\src\\itheima02.txt");
        byte[] b = new byte[25];
        int len = is.read(b);
        String s = new String(b);
        System.out.println(s);
        System.out.println(len);
        is.close();
    }
}
