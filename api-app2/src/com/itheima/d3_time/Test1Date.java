package com.itheima.d3_time;

import java.util.Date;

public class Test1Date {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        time += 1000*2;
        Date d2 = new Date(time);
        System.out.println(d2);

        Date d3 = new Date();
        d3.setTime(time);
    }
}
