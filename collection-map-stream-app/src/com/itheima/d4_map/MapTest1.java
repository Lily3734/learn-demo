package com.itheima.d4_map;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("手表",100);
        map.put("手表",200);
        map.put("手机",3);
        System.out.println(map);
    }
}
