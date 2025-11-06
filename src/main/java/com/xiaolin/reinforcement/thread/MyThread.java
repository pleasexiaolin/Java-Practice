package com.xiaolin.reinforcement.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author lzh
 * @description: 线程类
 * @date 2025/11/5 10:14
 */
public class MyThread extends Thread {

    // 表示这个类所有的对象 都共享ticket数据
    static int ticket = 0;

    // 锁对象 一定唯一。一般是当前类的字节码文件 MyThread.class
    //static final Object object = new Object();

    // lock锁
    static Lock lock = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
            // 同步代码块
            //synchronized (MyThread.class) {
            //    if ( ticket < 100){
            //        try {
            //            Thread.sleep(100);
            //        } catch (InterruptedException e) {
            //            throw new RuntimeException(e);
            //        }
            //
            //        ticket++;
            //        System.out.println( getName() + "正在卖第 " + ticket +" 张票");
            //    }else {
            //        break;
            //    }
            //}

            // lock锁
            lock.lock();
            try {
                if (ticket < 100) {
                    Thread.sleep(100);
                    ticket++;
                    System.out.println(getName() + "正在卖第 " + ticket + " 张票");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }

        }
    }
}
