package com.itheima.d1_create_thread;

public class ThreadTest2 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        //创建任务对象
        Thread t = new Thread(target);
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出==》");
        }
    }
}
