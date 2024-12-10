package com.itheima.demo4;

import java.util.*;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer,Integer> employee = new HashMap<>();
        mani1(200,arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        fun1(employee);
        System.out.println(employee);
        fun2(arrayList,employee);
        fun3(employee);
    }
    public static void mani1(int n,ArrayList<Integer> arrayList){
        Random r = new Random();
        int money;
        for (int i = 1; i <= n; i++) {
            if(i <= n * 0.8){
                money = r.nextInt(29) + 1;
                arrayList.add(money);
            }
            else{
                money = r.nextInt(70) + 31;
                arrayList.add(money);
            }
        }
    }
    public static void fun1(HashMap<Integer,Integer> employee){
        for (int i = 0; i < 100; i++) {
            employee.put(i+1,0);
        }
    }
    public static void fun2(ArrayList<Integer> arrayList, HashMap<Integer,Integer> hashMap){
        Random r = new Random();
        while(arrayList.size() != 0){
            int index = r.nextInt(arrayList.size());
            int flag = r.nextInt(100) + 1;
            int money = arrayList.remove(index);
            hashMap.put(flag,hashMap.get(flag) + money);
            System.out.println(flag + "号员工抢到了" + money + "元的红包~");
        }
        System.out.println("活动结束~");

    }
    public static void fun3(HashMap<Integer,Integer> hashMap){
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + "号员工抢到红包总计：" + entry.getValue() + "元"));

    }
}
