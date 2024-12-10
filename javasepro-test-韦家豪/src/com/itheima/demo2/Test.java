package com.itheima.demo2;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        List<String> list = new ArrayList<>(Arrays.asList("农家乐","轰趴","野外拓展","健身房"));
        List<String> list1 = new ArrayList<>(Arrays.asList("张全蛋儿","李二狗子","翠花","小帅","有容"));
        vote(list,map,list1);
        judgment(map,list1,list);
    }
    public static void vote(List<String> list,Map<String,String> map,List<String> list1){
        Random r = new Random();
        List<String> list2 = new ArrayList<>();
        list2.addAll(list1);
        int index = 0;
        while (list1.size() != 0) {
            index = r.nextInt(list1.size());
            String tempName = list1.remove(index);
            Set<String> set = new HashSet<>();
            StringBuilder vote = new StringBuilder();
            String tempV;
            for (int i = 0; i < r.nextInt(5) + 1; i++) {
                do {
                    tempV = list.get(r.nextInt(list.size()));
                }while (set.contains(tempV));
                vote.append(tempV).append(",");
                set.add(tempV);
            }
            map.put(tempName,vote.toString().trim());
        }
        for (String key : map.keySet()){
            System.out.println(key+"--->"+map.get(key));
        }
    }
    public static Map<String,Integer> count(Map<String,String> map,List<String> list1,List<String> list){
        Map<String,Integer> map1 = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int n = 0;
            String temp = list.get(i);
            for (String key : map.keySet()){
                if(map.get(key).contains(temp)) n++;
            }
            System.out.println(temp + "票数：" + n);
            map1.put(temp,n);
        }
        return map1;
    }
    public static void judgment(Map<String,String> map,List<String> list1,List<String> list) {
        Map<String, Integer> map1 = count(map, list1, list);
        List<Map.Entry<String,String>> listMap =new ArrayList<>(map.entrySet());
        List<Map.Entry<String, Integer>> list2 = new ArrayList<>(map1.entrySet());
        int max = list2.get(0).getValue();
        for (Map.Entry<String, Integer> m : list2) {
            if (max < m.getValue()) max = m.getValue();
        }
        for (Map.Entry<String, Integer> m : list2) {
            if (m.getValue() == max) {
                String attractions = m.getKey();
                System.out.println("票数最多的景点是：" + attractions);
            }
        }
        for (Map.Entry<String, Integer> m : list2) {
            String s = new String();
            StringBuilder stringBuilder = new StringBuilder();
            if (m.getValue() == max) s = m.getKey();
            for (Map.Entry<String, String> m2 : listMap){
                if(!(m2.getValue().contains(s))) System.out.println(m2.getKey() + "没有选择：" + s);
            }
        }
    }
}
