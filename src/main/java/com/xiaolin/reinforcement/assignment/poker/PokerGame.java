package com.xiaolin.reinforcement.assignment.poker;

import java.util.*;

/**
 * @author lzh
 * @description: TODO
 * @date 2025/11/4 17:04
 */
public class PokerGame {

    private static List<String> POKERS;

    static {
        // 准备牌

        String[] color = {"♥", "♦", "♠", "♣"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        List<String> pokers = new ArrayList<>();

        for (String c : color) {
            for (String n : number) {
                pokers.add(n + c);
            }
        }

        pokers.add("大🃏");
        pokers.add("小🃏");

        // 洗牌
        Collections.shuffle(pokers);
        POKERS = pokers;
    }

    public PokerGame() {

        System.out.println(POKERS);

        // 发牌
        List<String> zf = new ArrayList<>();
        List<String> gy = new ArrayList<>();
        List<String> lb = new ArrayList<>();

        List<String> dp = new ArrayList<>();

        zf = POKERS.subList(0, 17);
        gy = POKERS.subList(17, 34);
        lb = POKERS.subList(34, 51);

        dp = POKERS.subList(51, 54);


        System.out.println("张飞的牌：" + zf);
        System.out.println("关羽的牌：" + gy);
        System.out.println("刘备的牌：" + lb);
        System.out.println("底牌：" + dp);

        // 给 zf 的牌排序 要求安装扑克牌的顺序，大的排前 小的排后 例如：3，4，5....8,9,10,J,Q,k,A,2,小🃏，大🃏
        sortPoker(zf);
        sortPoker(gy);
        sortPoker(lb);

        System.out.println("==============整理牌种...================");
        System.out.println("张飞的牌：" + zf);
        System.out.println("关羽的牌：" + gy);
        System.out.println("刘备的牌：" + lb);
    }

    private void sortPoker(List<String> pokerList) {
        pokerList.sort( (o1 , o2) -> {
                // 定义牌的优先级顺序
                String[] order = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "小 Joker", "大 Joker"};

                // 提取牌面数字/标识
                String card1 = getCardNumber(o1);
                String card2 = getCardNumber(o2);

                // 查找在顺序数组中的位置
                int index1 = Arrays.asList(order).indexOf(card1);
                int index2 = Arrays.asList(order).indexOf(card2);

                // 按照位置比较大小（index越大，牌越大）
                return Integer.compare(index2, index1);
            }
        );
    }

    /**
     * 从完整的牌中提取牌面数字
     * @param card 完整的牌，如"3♥", "J♦", "小 Joker"
     * @return 牌面数字或标识
     */
    private String getCardNumber(String card) {
        if ("小 Joker".equals(card) || "小🃏".equals(card)) {
            return "小 Joker";
        }
        if ("大 Joker".equals(card) || "大🃏".equals(card)) {
            return "大 Joker";
        }

        // 对于普通牌，提取数字部分
        if (card.length() > 1) {
            char firstChar = card.charAt(0);
            if (Character.isDigit(firstChar)) {
                // 处理10的情况（占两个字符）
                if (card.startsWith("10")) {
                    return "10";
                }
                return String.valueOf(firstChar);
            } else {
                // J, Q, K, A
                return String.valueOf(firstChar);
            }
        }
        return card;
    }

}
