package com.itheima.d1_staticdemo;

public class Test {
    public static void main(String[] args) {
        Student.name = "fate";
        System.out.println(Student.name);
        Student stu1 = new Student();
        stu1.age = 16;
        System.out.println(stu1.age);
        Student.name = "Fate UBW";
        System.out.println(Student.name);
    }
}
