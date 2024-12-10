package com.itheima.d1_create_thread;

public class ThreadTest1 {
    //main方法是有一条默认的主线程执行的
    public static void main(String[] args) {
        //创建线程对象
        Thread t = new MyThread();
        //启动线程  （自动执行run方法）
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程main输出"+i);
        }
    }
}
