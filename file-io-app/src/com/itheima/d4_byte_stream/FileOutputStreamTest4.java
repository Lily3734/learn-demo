package com.itheima.d4_byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamTest4 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("file-io-app/src/itheima04our.txt");
        os.write('f');
        os.write(97);
        os.close();
    }
}
