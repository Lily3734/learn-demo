package com.itheima.d5_Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Business2 {

    public Map<String,Integer> conversion(List<User> users){
        Map<String,Integer> map = new HashMap<>();
        User tempUser = new User();
        for (int i = 0; i < users.size(); i++) {
            tempUser = users.get(i);
            if(map.containsKey(tempUser.getName())) map.put(tempUser.getName(),map.get(tempUser.getName())+1);
            else map.put(tempUser.getName(),1);
        }
        return map;

    }
    public void traverse(Map<String,Integer> map){
        map.forEach((k,v) -> {System.out.println(k+":"+v+"次");
        });
    }
}
