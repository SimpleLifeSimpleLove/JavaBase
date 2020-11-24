package com.wxx;

/**
 * Date: 2020/11/24 18:13
 * Content: 什么是注解?
 */
// @SuppressWarnings("all") 镇压所有警告
@SuppressWarnings("all")
public class Test01 implements Runnable {

    // @Override 重写的注解
    @Override
    public void run() {

    }

    // @Deprecated 不推荐程序员使用，但是可以使用，或者存在更好的方式
    @Deprecated
    public static void test01() {
        System.out.println("Deprecated");
    }


    public static void test02() {
        test01();
    }

}
