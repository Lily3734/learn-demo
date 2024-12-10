package com.itheima.d5_map_travese;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MapDemo4 {
    public static void main(String[] args) {
        //利用随机模拟投票
        String attractions = "ABCD";
        ArrayList<String> arrayList = new ArrayList<>();
        Random r = new Random();
        int num;
        for (int i = 0; i < 80; i++) {
            num = r.nextInt(attractions.length());
            arrayList.add(attractions.charAt(num)+"");
        }
        System.out.println(arrayList);

        //统计票数
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(i);
            if(map.containsKey(s)) map.put(s,map.get(s)+1);
            else map.put(s,1);
        }
        map.forEach((k,v) -> {
            System.out.println(k+"-------->"+v);
        });

    }
}
