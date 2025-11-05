package com.xiaolin.reinforcement.stream;

import lombok.Data;

import java.util.Date;

/**
 * @author lzh
 * @description: 演员对象
 * @date 2025/10/29 17:25
 */
@Data
public class Actor {

    //  姓名
    String name;

    //  年龄
    int age;

    public static void main(String[] args) {
        long now = new Date().getTime();
        String nonce = Long.toHexString(now) + "-" +
                Long.toHexString((long) Math.floor(Math.random() * 0xFFFFFF));

        System.out.println(nonce);
    }
}
