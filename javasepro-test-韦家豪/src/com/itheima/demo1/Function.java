package com.itheima.demo1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Function {
    private ArrayList<Order> orders = new ArrayList<>();

    public Function(String address) throws Exception {
        this.orders = Analysis.analysisFun(address);
    }

    public void fun1(){
        LocalDateTime data = LocalDateTime.now();
        orders.stream().filter(order -> order.getTime().isBefore(data)).forEach(order -> System.out.println(order));
    }
    public void fun2(){
        Order user = orders.stream().max((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())).get();
        System.out.println(user);
    }
    public void fun3(){
        orders.stream().sorted((o1, o2) -> Double.compare(o2.getPrice(), o1.getPrice()))
                .forEach(order -> System.out.println(order));
    }
}
