package com.xiaolin.reinforcement.thread;

import java.util.concurrent.ExecutionException;

/**
 * @author lzh
 * @description: 多线程
 * @date 2025/11/5 10:12
 */
public class ThreadDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //MyThread t1 = new MyThread();
        //MyThread t2 = new MyThread();
        //
        //
        //Thread thread1 = new Thread(t1);
        //Thread thread2 = new Thread(t2);
        //
        //thread1.setName("线程1");
        //thread2.setName("线程2");
        //
        //
        //thread1.start();
        //thread2.start();

        //MyCallable callable = new MyCallable();
        //FutureTask<String> futureTask = new FutureTask<>(callable);
        //Thread thread = new Thread(futureTask);
        //
        //thread.start();
        //
        //String s = futureTask.get();
        //System.out.println(s);

        /**
         * 需求：
         *      电影院100张票 有3个窗口卖票 设计一个程序模拟电影院卖票
         */

        //MyThread t1 = new MyThread();
        //MyThread t2 = new MyThread();
        //MyThread t3 = new MyThread();
        //
        //t1.start();
        //t2.start();
        //t3.start();

        // 生产者 消费者

        Consumer c1 = new Consumer();
        Consumer c2 = new Consumer();
        Consumer c3 = new Consumer();

        Producer p1 = new Producer();
        //Producer p2 = new Producer();

        c1.setName("张飞");
        c2.setName("刘备");
        c3.setName("关羽");

        p1.setName("大乔");
        //p2.setName("小乔");

        c1.start();
        c2.start();
        c3.start();
        p1.start();
        //p2.start();

    }
}
