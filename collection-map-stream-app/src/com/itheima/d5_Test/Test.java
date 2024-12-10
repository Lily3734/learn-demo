package com.itheima.d5_Test;

import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        System.out.println(myArrayList.size());
        myArrayList.add(1);
        myArrayList.add(7);
        myArrayList.add(0);
        myArrayList.add(4);
        myArrayList.add(4);
        myArrayList.add(9);
        myArrayList.add(15);
        myArrayList.add(12);
        myArrayList.add(20);
        myArrayList.add(27);
        System.out.println(myArrayList);
        System.out.println(myArrayList.get(1));
        myArrayList.remove(3);
        myArrayList.add(11);
        myArrayList.add(11);
        System.out.println(myArrayList);
        myArrayList.forEachForgery(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}
