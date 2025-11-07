package com.xiaolin.reinforcement.reflection;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * @author lzh
 * @description: 反射案例
 * @date 2025/11/6 21:00
 */
public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<Student> studentClass = Student.class;

        System.out.println(studentClass);

        Class<?> aClass = Class.forName("com.xiaolin.reinforcement.reflection.Student");
        System.out.println(aClass);

        Constructor<?>[] constructors = studentClass.getConstructors();

        System.out.println(Arrays.toString(constructors));

    }
}
