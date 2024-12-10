package com.itheima.d3_uill;

import java.util.Random;

public class MyUtil {
    //工具类没必有创建对象
    //私有化工具构造器（别人没必要新建工具，也防止别人新建），直接调用就行
    public static String createCode(int n){
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random r = new Random();
        //2.开始定义一个循环随机生成字符
        for (int i = 0; i < n; i++) {
            code += data.charAt(r.nextInt(data.length()));
        }
        return code;
    }
}
