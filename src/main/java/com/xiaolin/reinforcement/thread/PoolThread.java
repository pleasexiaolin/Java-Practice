package com.xiaolin.reinforcement.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lzh
 * @description: 线程池
 * @date 2025/11/6 19:27
 */
public class PoolThread {

    public static void main(String[] args) {

        //ExecutorService pool1 = Executors.newFixedThreadPool(3);
        //
        //pool1.submit(new MyRunnable());
        //pool1.submit(new MyRunnable());
        //pool1.submit(new MyRunnable());

        // 自定义线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3
                , 6
                , 60
                , TimeUnit.SECONDS
                , new ArrayBlockingQueue<>(3)
                , Executors.defaultThreadFactory()
                , new ThreadPoolExecutor.AbortPolicy()
        );

        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());

    }
}
