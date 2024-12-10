package com.itheima.d6_lambda;

import java.util.Scanner;

public class LambdaTest1 {
    public static void main(String[] args) {
        //目标：认识Lambda
        Animal cat = new Animal() {
            @Override
            public void run() {
                System.out.println("猫跑得飞快");
            }
        };
        cat.run();

        //错误使用：Animal dog = () -> {System.out.println("狗跑得飞快");};

        //Lambda只能简化函数式接口的匿名内部类
        Student s = () -> System.out.println("跑得快");
        s.run();
    }
}

abstract class Animal{
    public abstract void run();
}
interface Student{
    void run();
}