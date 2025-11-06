package com.xiaolin.reinforcement.assignment.thread;

/**
 * @author lzh
 * @description: 数字线程
 * @date 2025/11/6 16:06
 */
public class NumberThread extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Number.lock) {
                if (Number.num > 100) {
                    break;
                } else {

                    if (Number.num % 2 == 1) {
                        System.out.println(getName() + "打印了奇数：" + Number.num);
                    }

                    try {
                        sleep(300);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    ++Number.num;
                }
            }
        }
    }
}
