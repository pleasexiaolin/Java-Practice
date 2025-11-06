package com.xiaolin.reinforcement.assignment.thread;

/**
 * @author lzh
 * @description: 抢红包
 * @date 2025/11/6 16:13
 */
public class RedEnvelopeThread extends Thread {

    @Override
    public void run() {

        //while (true) {
            synchronized (RedEnvelope.lock) {
                if (RedEnvelope.times == 0) {
                    System.out.println(getName() + "没抢到");

                } else {
                    if (RedEnvelope.times == 1) {
                        System.out.println(getName() + "抢到了" + RedEnvelope.money + "元");

                    } else {
                        double money = RedEnvelope.r.nextDouble(RedEnvelope.money);
                        System.out.println(getName() + "抢到了" + money + "元");
                        RedEnvelope.money -= money;
                    }

                    --RedEnvelope.times;
                }
            }
        //}

    }
}
