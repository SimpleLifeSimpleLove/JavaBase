package com.wxx;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Date: 2020/11/24 19:31
 * Content: 获取类的信息
 */
public class Test04 {

    public static void main(String[] args) throws Exception {

        Class c1 = Class.forName("com.wxx.pojo.User");

        // 获取类的名字
        System.out.println(c1.getName());  // 全限定名：com.wxx.pojo.User
        System.out.println(c1.getSimpleName());  // 全限定名：User


        // 获取类的属性
        System.out.println("========================================");
        Field[] fields = c1.getFields();  // 只能获取 public 属性
        Field[] declaredFields = c1.getDeclaredFields();  // 获取全部属性
        for (Field field : declaredFields) {
            System.out.println(field);
        }
        // 获取指定属性的值
        Field name = c1.getDeclaredField("name");
        System.out.println(name);


        // 获取类的方法
        System.out.println("========================================");
        Method[] methods = c1.getMethods();  // 获取本类及其父类的全部 public 方法
        Method[] declaredMethods = c1.getDeclaredMethods();  // 获取本类所有方法
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        // 获取指定方法
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);


        // 获取构造器
        System.out.println("========================================");
        Constructor[] constructors = c1.getConstructors();  // 只能获取 public 构造器
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();  // 获取所有构造器
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor);
        }
        // 获取指定的构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(int.class, String.class, int.class);
        System.out.println(declaredConstructor);

    }
}
