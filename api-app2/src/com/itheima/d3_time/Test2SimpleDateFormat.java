package com.itheima.d3_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);

        long d1 = d.getTime();
        System.out.println(d1);

        SimpleDateFormat sfd = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss EEE a");
        System.out.println(sfd.format(d));
        System.out.println(sfd.format(d1));

        String s = "2024年09月17日  13:49:01 周二 下午";
        SimpleDateFormat sfd2 = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss EEE a");

        System.out.println(sfd2.parse(s));

    }
}
