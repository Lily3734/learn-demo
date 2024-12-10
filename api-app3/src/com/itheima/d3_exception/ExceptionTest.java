package com.itheima.d3_exception;

public class ExceptionTest {
    public static void main(String[] args) {
        try {
            Age(190);
            System.out.println("执行成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("底层出现了BUG");
        }
    }
    public static void Age(int age){
        if(age <= 110 && age >= 0){
            System.out.println("年龄合法");
        }
        else{
            //用异常对象封装这个问题
            //throw 抛出去这个异常
          throw new AgeIllegalRuntimeException("/age is illegal, your age is " + age);
        }
    }
}
