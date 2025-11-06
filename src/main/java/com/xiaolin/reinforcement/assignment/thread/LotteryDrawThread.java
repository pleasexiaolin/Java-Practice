package com.xiaolin.reinforcement.assignment.thread;

import java.util.List;

/**
 * @author lzh
 * @description: 抽奖
 * @date 2025/11/6 16:55
 */
public class LotteryDrawThread extends Thread {

    @Override
    public void run() {

        while (true) {
            synchronized (LotteryDraw.lock) {
                if (LotteryDraw.lottery.length == 0) {
                    if ("抽奖箱1".equals(getName())) {
                        // 求出LotteryDraw.box1的总和 以及 最大值
                        int sum = 0;
                        int max = 0;
                        for (Integer value : LotteryDraw.box1) {
                            sum += value;
                            if (value > max) {
                                max = value;
                            }
                        }
                        System.out.println("在此次抽奖过程中，抽奖箱1总共产生了" + LotteryDraw.box1.size() + "个奖项");
                        System.out.println("   分别为：" + LotteryDraw.box1 + "最高奖项为" + max + "，总计额为" + sum + "元");
                    } else {
                        int sum = 0;
                        int max = 0;
                        for (Integer value : LotteryDraw.box2) {
                            sum += value;
                            if (value > max) {
                                max = value;
                            }
                        }
                        System.out.println("在此次抽奖过程中，抽奖箱2总共产生了" + LotteryDraw.box2.size() + "个奖项");
                        System.out.println("   分别为：" + LotteryDraw.box2 + "最高奖项为" + max + "，总计额为" + sum + "元");
                    }



                    break;
                } else {

                    Integer value = LotteryDraw.lottery[LotteryDraw.r.nextInt(LotteryDraw.lottery.length)];

                    // 从  LotteryDraw.lottery 去除 value 这个元素
                    List<Integer> tempList = new java.util.ArrayList<>();
                    for (int i = 0; i < LotteryDraw.lottery.length; i++) {
                        if (!LotteryDraw.lottery[i].equals(value)) {
                            tempList.add(LotteryDraw.lottery[i]);
                        }
                    }
                    LotteryDraw.lottery = tempList.toArray(Integer[]::new);

                    if ("抽奖箱1".equals(getName())) {

                        LotteryDraw.box1.add(value);


                        if (LotteryDraw.map.get(getName()) != null && value > LotteryDraw.map.get(getName())){
                            LotteryDraw.map.put(getName(),value);
                        }

                    } else {

                        LotteryDraw.box2.add(value);

                        if (LotteryDraw.map.get(getName()) != null && value > LotteryDraw.map.get(getName())){
                            LotteryDraw.map.put(getName(),value);
                        }
                    }


                    //System.out.println(getName() + "又产生了一个" + value + "元大奖");


                }
            }
            //try {
            //    sleep(30);
            //} catch (InterruptedException e) {
            //    throw new RuntimeException(e);
            //}
        }

        Integer value1 = LotteryDraw.map.get("抽奖箱1");
        Integer value2 = LotteryDraw.map.get("抽奖箱2");
        if (value1 > value2 ){
            System.out.println("在此次抽奖过程中，抽奖箱1中产生了最大奖项：" + value1);
        }else {
            System.out.println("在此次抽奖过程中，抽奖箱2中产生了最大奖项：" + value2);
        }
    }


}
