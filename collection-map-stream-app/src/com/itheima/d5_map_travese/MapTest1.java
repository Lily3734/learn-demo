package com.itheima.d5_map_travese;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Fate UBW",2020);
        map.put("罪恶王冠",2020);
        map.put("幻想嘉年华",2020);

        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key : keys){
            Integer value = map.get(key);
            System.out.println(key+"=====>"+value);

        }
        System.out.println("------------------------");

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry : entries){
            String key1 = entry.getKey();
            Integer value1 = entry.getValue();
            System.out.println(key1+"-------->"+value1);
        }
        System.out.println("------------------------");

        map.forEach((k,v) -> {
            System.out.println(k+"------>"+v);
        });
    }
}
