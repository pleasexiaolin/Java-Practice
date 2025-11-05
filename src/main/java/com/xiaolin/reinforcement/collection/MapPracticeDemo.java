package com.xiaolin.reinforcement.collection;

import java.util.*;

/**
 * @author lzh
 * @description: TODO
 * @date 2025/11/4 16:20
 */

public class MapPracticeDemo {

    public static void main(String[] args) {
        test1();
    }


    private static void test1() {

        Map<String, List<String>> map = new HashMap<>();

        List<String> city1 = new ArrayList<>();
        List<String> city2 = new ArrayList<>();

        Collections.addAll(city1, "信阳", "漯河", "开封", "南阳", "潢川");
        Collections.addAll(city2, "阜阳", "安阳", "芜湖", "合肥", "淮南");

        map.put("河南省", city1);
        map.put("安徽省", city2);

        Set<String> keySet = map.keySet();

        keySet.forEach(
                s -> {
                    List<String> value = map.get(s);
                    System.out.println(s + "=" + value);
                }

        );
    }




}
