package com.xiaolin.reinforcement.assignment.thread;

/**
 * @author lzh
 * @description: 礼物案例
 * @date 2025/11/6 15:59
 */
public class GiftThread extends Thread{

    @Override
    public void run() {

        while(true){
            synchronized (Gift.lock){
                if (Gift.num <= 10){
                    break;
                }else {

                    Gift.num--;
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(getName() + "送出了一份礼物 还剩下" + Gift.num + "份");
                }
            }
        }
    }
}
