package com.itheima.d5_Test;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        sole(list);
        List<Integer> temp = new LinkedList<>();
        temp.addAll(list);
        System.out.println(temp);
        System.out.println(list);
        while (list.size() != 1) {
            for (int i = list.size() - 1; i >= 0 ; i--) {
                if(i % 2 == 0) list.remove(i);
            }
        }
        int s = list.get(0);
        System.out.println("幸存者："+s);
        int index = -1;
        for (int i = 0; i < temp.size(); i++) {
            if(s == temp.get(i)){
                index = i;
                break;
            }
        }
        System.out.println(s+"第一次的位置："+index);

    }
    public static void sole(List<Integer> list){
        Random r = new Random();
        while(list.size() != 100){
            boolean flag = true;
            int num = r.nextInt(200) + 1;
            for (int i = 0; i < list.size(); i++) {
                if(num == list.get(i)) {
                    flag = false;
                    break;
                }
            }
            if(flag) list.add(num);
        }
    }
}
