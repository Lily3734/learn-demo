package com.itheima.d3_time;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test4Calendar {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        int year = now.get(Calendar.YEAR);
        System.out.println(year);
    }
}
