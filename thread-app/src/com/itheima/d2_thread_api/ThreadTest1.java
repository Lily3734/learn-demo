package com.itheima.d2_thread_api;

public class ThreadTest1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread("一号线程");
        t1.start();
        Thread t2 = new MyThread("二号线程");
        t2.start();
        Thread m = Thread.currentThread();
        m.setName("主线程");
        for (int i = 0; i < 5; i++) {
            System.out.println(m.getName()+"程执行了");
        }
    }
}
