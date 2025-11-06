package com.xiaolin.reinforcement.thread;

/**
 * @author lzh
 * @description: 生产者
 * @date 2025/11/6 11:09
 */
public class Producer extends Thread {



    @Override
    public void run() {
        /*
          编写 多线程套路
          1. 循环
          2. 同步代码块 （可替换为同步方法、lock锁）
          3. 判断共享数据是否到了末尾 （到了末尾）
          4. 判断共享数据是否到了末尾 （没有到末尾，执行核心逻辑）
         */
        while (true) {
            synchronized (Table.lock) {
                if ( Table.count == 0){
                    // 到了末尾
                    break;
                }else {
                    if (Table.flag == 1) {
                        try {
                            System.out.println(getName() + "发现有饭， 等待做饭");
                            Table.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        Table.flag = 1;
                        System.out.println(getName() + " 做了一碗饭 喊人吃饭");
                        Table.lock.notifyAll();
                    }
                }
            }

        }
    }


}
