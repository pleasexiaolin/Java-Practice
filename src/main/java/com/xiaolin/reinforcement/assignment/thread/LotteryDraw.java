package com.xiaolin.reinforcement.assignment.thread;

import java.util.*;

/**
 * @author lzh
 * @description: 抽奖
 * @date 2025/11/6 16:55
 */
public class LotteryDraw {

    public static Integer[] lottery = {10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700};

    public static List<Integer> box1 = new ArrayList<>();

    public static List<Integer> box2 = new ArrayList<>();

    public static Random r = new Random();

    public static final Object lock = new Object();

    public static Map<String,Integer> map = new HashMap<>();
}
