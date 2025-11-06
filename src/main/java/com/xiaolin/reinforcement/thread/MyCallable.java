package com.xiaolin.reinforcement.thread;

import java.util.concurrent.Callable;

/**
 * @author lzh
 * @description: 多线程
 * @date 2025/11/5 10:45
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "callable执行完毕";
    }
}
