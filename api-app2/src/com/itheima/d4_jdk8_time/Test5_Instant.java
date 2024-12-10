package com.itheima.d4_jdk8_time;

import java.time.Instant;

public class Test5_Instant {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        //获取总秒数
        long second = now.getEpochSecond();
        System.out.println(second);
        int nano = now.getNano();
        System.out.println(nano);
        Instant now1 = Instant.now();
    }
}
