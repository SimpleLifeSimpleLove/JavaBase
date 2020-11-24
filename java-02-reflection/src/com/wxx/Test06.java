package com.wxx;

import com.wxx.pojo.User;

import java.lang.reflect.Method;

/**
 * Date: 2020/11/24 19:57
 * Content:
 */
public class Test06 {

    public static final int TIME = 1000000000;

    // 普通方法调用
    public static void test01() {
        User user = new User();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < TIME; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();

        System.out.println("普通方法执行" + TIME + "次：" + (endTime - startTime) + "ms");
    }

    // 反射方法调用
    public static void test02() throws Exception {
        Class c = Class.forName("com.wxx.pojo.User");
        User user = (User) c.newInstance();
        Method getName = c.getDeclaredMethod("getName", null);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < TIME; i++) {
            getName.invoke(user, null);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("反射方法执行" + TIME + "次：" + (endTime - startTime) + "ms");
    }

    // 反射方法调用，关闭安全监测
    public static void test03() throws Exception {
        Class c = Class.forName("com.wxx.pojo.User");
        User user = (User) c.newInstance();
        Method getName = c.getDeclaredMethod("getName", null);
        getName.setAccessible(true);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < TIME; i++) {
            getName.invoke(user, null);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("反射方法(关闭安全监测)执行" + TIME + "次：" + (endTime - startTime) + "ms");
    }

    public static void main(String[] args) throws Exception {

        test01();
        test02();
        test03();
        /*
         * 普通方法执行1000000000次：4ms
         * 反射方法执行1000000000次：1826ms
         * 反射方法(关闭安全监测)执行1000000000次：1678ms
         */
    }

}
