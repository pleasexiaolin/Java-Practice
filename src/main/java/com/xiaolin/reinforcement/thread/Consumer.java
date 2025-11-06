package com.xiaolin.reinforcement.thread;

/**
 * @author lzh
 * @description: 消费者
 * @date 2025/11/6 11:10
 */
public class Consumer extends Thread{

    @Override
    public void run() {
        /*
          编写 多线程套路
          1. 循环
          2. 同步代码块 （可替换为同步方法、lock锁）
          3. 判断共享数据是否到了末尾 （到了末尾）
          4. 判断共享数据是否到了末尾 （没有到末尾，执行核心逻辑）
         */
        while (true){
            synchronized (Table.lock){
                if (Table.count == 0){
                    // 到了末尾
                    break;
                }else {
                    /*
                      消费者逻辑
                      1. 判断桌子是否有食物
                      2. 如果没有就等待
                      3. 如果有就开吃
                      4. 吃完后，唤醒厨师继续做
                     */
                    if (Table.flag == 1){
                        Table.lock.notify();
                        Table.count--;
                        Table.flag = 0;
                        System.out.println(getName() + " 开始吃饭 " + "还剩" + Table.count + "碗");
                    }else {
                        try {
                            System.out.println(getName() + "发现没饭 等待吃饭");
                            Table.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }

    }
}
