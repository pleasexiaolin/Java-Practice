package com.xiaolin.reinforcement.reflection;

import lombok.Data;

/**
 * @author lzh
 * @description: 学生类
 * @date 2025/11/6 20:33
 */
@Data
public class Student {

    private String name;

    private String age;


    public Student(String age){
        this.age = age;
    }
}
