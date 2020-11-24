package com.wxx;

/**
 * Date: 2020/11/24 18:47
 * Content: 演示反射
 */
public class Test01 {

    public static void main(String[] args) throws Exception {

        // 一个类在内存中只有一个class对象
        Class user1 = Class.forName("com.wxx.pojo.User");
        Class user2 = Class.forName("com.wxx.pojo.User");

        System.out.println(user1 == user2);  // true
    }
}



