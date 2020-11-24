package com.wxx;

import com.wxx.pojo.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Date: 2020/11/24 19:46
 * Content: 通过反射动态创建对象
 */
public class Test05 {

    public static void main(String[] args) throws Exception {

        Class c1 = Class.forName("com.wxx.pojo.User");

        // 通过无参构造器创建对象，如果不存在无参构造器会抛出异常
        User user = (User) c1.newInstance();
        System.out.println(user);

        // 通过有参构造器创建对象
        System.out.println("========================================");
        Constructor constructor = c1.getDeclaredConstructor(int.class, String.class, int.class);
        User user2 = (User) constructor.newInstance(1, "王肖肖", 18);
        System.out.println(user2);

        // 通过反射创建普通方法
        System.out.println("========================================");
        User user3 = (User) c1.newInstance();  // 执行普通方法需要先有对象
        Method setName = c1.getDeclaredMethod("setName", String.class);  // 通过反射获得方法
        setName.invoke(user3, "王肖肖...");  // 通过反射运行方法   方法.invoke(对象, 参数...)
        System.out.println(user3.getName());

        // 通过反射操作属性
        System.out.println("========================================");
        User user4 = (User) c1.newInstance();  // 实例变量需要先有对象
        Field name = c1.getDeclaredField("name");
        name.setAccessible(true);  // 不能直接操作私有属性，我们需要先关闭属性或者方法的安全监测
        name.set(user4, "王肖肖......");
        System.out.println(user4.getName());

    }
}
