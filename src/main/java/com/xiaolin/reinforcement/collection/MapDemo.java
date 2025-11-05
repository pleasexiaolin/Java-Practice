package com.xiaolin.reinforcement.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author lzh
 * @description: 双列集合
 * @date 2025/11/3 9:43
 */
public class MapDemo {
    public static void main(String[] args) {
        // 创建一个HashMap对象
        Map<String, Integer> map = new HashMap<>();
        //// 添加元素
        //map.put("A", 0);
        //map.put("B", 0);
        //map.put("C", 0);
        //map.put("D", 0);
        //
        //String[] str = {"A", "B", "C", "D"};
        //
        //for (int i = 0; i < 80; i++) {
        //    int next = (int) (Math.random() * 4);
        //    String key = str[next];
        //    if (map.containsKey(key)) {
        //        Integer value = map.get(key);
        //        value++;
        //        map.put(key, value);
        //    }
        //}
        //
        //System.out.println(map);
        //
        //Map<Integer, String> treeMap = new TreeMap<>((o1, o2) -> o1 - o2);
        //
        //treeMap.put(1, "手机");
        //treeMap.put(2, "电脑");
        //treeMap.put(5, "书包");
        //treeMap.put(4, "键盘");
        //treeMap.put(3, "鼠标");
        //
        //System.out.println(treeMap);

        TreeMap<String, Integer> tm = new TreeMap<>();

        String str2 = "sadsawqdwqsdwsaghlkkasionvnaowqrnq";

        for (int i = 0; i <str2.length() ; i++) {

            char s = str2.charAt(i);
            if (tm.containsKey(String.valueOf(s))) {
                Integer value = tm.get(String.valueOf(s));
                tm.put(String.valueOf(s), ++value);
            } else {
                tm.put(String.valueOf(s), 1);
            }

        }


        System.out.println(tm);

    }
}
