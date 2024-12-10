package com.itheima.d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Test1_LocalDate {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        int month = ld.getMonthValue();
        int year = ld.getYear();
        int day = ld.getDayOfMonth();

        LocalDate ld2 = ld.withYear(2020);
        System.out.println(ld2);

        LocalDate ld3 = ld.withMonth(7);
        System.out.println(ld3);
    }
}
