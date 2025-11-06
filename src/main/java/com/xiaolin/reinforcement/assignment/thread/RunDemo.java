package com.xiaolin.reinforcement.assignment.thread;

/**
 * @author lzh
 * @description: 运行demo
 * @date 2025/11/6 15:53
 */
public class RunDemo {

    public static void main(String[] args) {

        //redEnvelope();
        lotteryDraw();

    }

    private static void lotteryDraw() {
        LotteryDrawThread l1 = new LotteryDrawThread();
        LotteryDrawThread l2 = new LotteryDrawThread();

        l1.setName("抽奖箱1");
        l2.setName("抽奖箱2");
        LotteryDraw.map.put("抽奖箱1",0);
        LotteryDraw.map.put("抽奖箱2",0);

        l1.start();
        l2.start();
    }

    private static void redEnvelope() {
        RedEnvelopeThread r1 = new RedEnvelopeThread();
        RedEnvelopeThread r2 = new RedEnvelopeThread();
        RedEnvelopeThread r3 = new RedEnvelopeThread();
        RedEnvelopeThread r4 = new RedEnvelopeThread();
        RedEnvelopeThread r5 = new RedEnvelopeThread();

        r1.setName("小王");
        r2.setName("小张");
        r3.setName("小陆");
        r4.setName("小里");
        r5.setName("小可");


        r1.start();
        r2.start();
        r3.start();
        r4.start();
        r5.start();
    }

    private static void number() {
        NumberThread t1 = new NumberThread();
        NumberThread t2 = new NumberThread();

        t1.setName("小王");
        t2.setName("小张");

        t2.start();
        t1.start();
    }

    private static void giftDemo() {
        GiftThread t1 = new GiftThread();
        GiftThread t2 = new GiftThread();

        t1.setName("小王");
        t2.setName("小张");

        t2.start();
        t1.start();
    }

    private static void ticketDemo() {
        TicketThead t1 = new TicketThead();
        TicketThead t2 = new TicketThead();

        t1.setName("小王");
        t2.setName("小张");

        t2.start();
        t1.start();
    }
}
