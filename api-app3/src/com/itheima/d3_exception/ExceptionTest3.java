package com.itheima.d3_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionTest3 {
    public static void main(String[] args) {
        try {
            test1();
        } catch (FileNotFoundException e) {
            System.out.println("您要找的文件不存在");
            e.printStackTrace();//打印出这个异常对象的信息，记录下来
        } catch (ParseException e) {
            System.out.println("您要解析的时间无法解析");
            e.printStackTrace();//打印出这个异常对象的信息，记录下来
        }
    }
    public static void test1() throws FileNotFoundException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2020-07-15 00:00");
        System.out.println(d);
        test2();
    }
    public static void test2() throws FileNotFoundException {
        //读取文件
        InputStream is = new FileInputStream("C:\\Users\\lenovo\\Desktop\\a.txt");
    }
}
