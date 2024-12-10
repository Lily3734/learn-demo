package com.itheima.d1_create_thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        //描述线程的的执行任务的
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程MyThread输出："+i);
            System.out.println("子线程MyThread输出："+i);
        }
    }
}
