package com.itheima.d4_abstract;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        //认识抽象类特点
        ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(null);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
//        System.out.println(arrayList.get(2));
        int arr[] = new int[7];
        System.out.println(arr.length);
        int arr3[] = new int[0];
        arrayList.add(null);
        arrayList.add(null);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList);
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        Collection<String> collection = new ArrayList<>();
        System.out.println(arrayList1.toString());
    }
}
