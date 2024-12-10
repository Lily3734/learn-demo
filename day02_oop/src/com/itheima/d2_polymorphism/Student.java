package com.itheima.d2_polymorphism;

public class Student extends People {
    public String name ="子类Student的名称";
    @Override
    public void run(){
        System.out.println("跑得快");
    }
    public void test(){
        System.out.println("需要考试");
    }
}
