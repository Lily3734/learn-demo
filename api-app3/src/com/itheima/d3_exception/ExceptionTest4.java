package com.itheima.d3_exception;

import java.util.Scanner;

public class ExceptionTest4 {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println(getMoney());
                break;
            } catch (Exception e) {
                System.out.println("请您输入合法的数字");
            }
        }

    }
    public static double getMoney(){
        Scanner sc = new Scanner(System.in);
        double money = 0;
        while (true) {
            System.out.println("请您输入金额：");
            money = sc.nextDouble();
            if(money < 0) System.out.println("您输入的价格有问题");
            else break;
        }
        return money;
    }
    public static void test(){
        System.out.println("打印成功");
    }
}
