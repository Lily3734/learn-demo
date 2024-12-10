package com.itheima.d10_api_object;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("赵敏",18);
        System.out.println(s1.toString());

        Student s2 = new Student("赵敏",18);
        System.out.println(s2.equals(s1));
    }
}
