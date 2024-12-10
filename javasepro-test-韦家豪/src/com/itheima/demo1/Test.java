package com.itheima.demo1;

public class Test {
    public static void main(String[] args) {
        try {
            String path = "/orders.xml"; // 使用绝对路径
            System.out.println("XML 文件路径: " + path);
            Function function = new Function(path);
            function.fun1();
            System.out.println("-----------------------");
            function.fun2(); // 打印价格最高的订单
            System.out.println("-----------------------");
            function.fun3(); // 打印按价格升降序排列的所有订单
        } catch (Exception e) {
            e.printStackTrace(); // 打印异常信息
        }
    }

}
