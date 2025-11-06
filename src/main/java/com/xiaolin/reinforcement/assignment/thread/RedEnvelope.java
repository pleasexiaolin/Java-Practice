package com.xiaolin.reinforcement.assignment.thread;

import java.util.Random;

/**
 * @author lzh
 * @description: 抢红包
 * @date 2025/11/6 16:13
 */
public class RedEnvelope {

    // 红包钱
    public static double money = 100;

    // 个数
    public static int times = 3;

    public static double MIN = 0.01;

    // 锁
    public static final Object lock = new Object();

    public static final Random r = new Random();
}
