package com.xiaolin.reinforcement.thread;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author lzh
 * @description: 桌子
 * @date 2025/11/6 11:14
 */
public class Table {

    // 控制生产者 消费者 执行
    public static int flag = 0;

    // 消费者最多执行次数
    public static int count = 30;

    // 锁对象
    public static final Object lock = new Object();

    // 阻塞队列
    public static final ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
}
