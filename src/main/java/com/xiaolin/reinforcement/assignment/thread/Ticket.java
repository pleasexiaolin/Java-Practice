package com.xiaolin.reinforcement.assignment.thread;

import lombok.Data;

/**
 * @author lzh
 * @description: 买票案例
 * @date 2025/11/6 15:49
 */
@Data
public class Ticket {

    // 票数量
    public static int num = 1000;

    // 锁
    public static final Object lock = new Object();
}
