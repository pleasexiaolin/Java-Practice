package com.xiaolin.reinforcement.thread;

/**
 * @author lzh
 * @description: 多线程
 * @date 2025/11/6 19:32
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "照着执行");
    }
}
