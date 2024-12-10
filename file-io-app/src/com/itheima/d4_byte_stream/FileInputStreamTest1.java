package com.itheima.d4_byte_stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamTest1 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("D:\\code\\javasepromax\\file-io-app\\src\\itheim01.txt");
//        int b1 = is.read();
//        System.out.println(b1);
//        System.out.println(is.read());
//        System.out.println(is.read());
        int b;
        while((b = is.read()) != -1) System.out.print((char)b);
        is.close();
    }
}
