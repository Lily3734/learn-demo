package com.itheima.demo1;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {
    private String name;
    private LocalDateTime time;
    private double price;

    public Order() {
    }

    public Order(String name, LocalDateTime time, double price) {
        this.name = name;
        this.time = time;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", price=" + price +
                '}';
    }
}
