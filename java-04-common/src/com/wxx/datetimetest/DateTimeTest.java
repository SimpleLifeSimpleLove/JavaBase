package com.wxx.datetimetest;

import org.junit.Test;

import java.util.Date;

/**
 * Date: 2020/12/18 10:29
 * Content:
 */
public class DateTimeTest {

    /*
    System类中的currentTimeMillis()
     */
    @Test
    public void test01() {

        long time = System.currentTimeMillis();
        // 返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差，称为时间戳
        System.out.println(time);
    }

    /*
    java.util.Date类
        |--- java.sql.Date类

    java.util.Date类
        1.两个构造器的使用
            > 构造器1：Date() : 创建一个对应于当前时间的Date对象
            > 构造器2：Date(long date) : 创建指定毫秒数的Date对象
        2.两个方法的使用
            > toString() : 显示当前的年、月、日、时、分、秒
            > getTime() : 获取当前Date对象对应的毫秒数(时间戳).

    java.sql.Date类：对应着数据库中的日期时间类型，是java.util.Date的子类
        1.如何实例化
            > java.sql.Date(long date) : 创建指定毫秒数的Date对象
        2.如何将 java.util.Date 对象转换为 java.sql.Date对象
            > 情况1：多态形式，原本就是子类对象，只不过赋值给了父类，可以强转为子类
            > 情况2：通过时间戳这个桥梁
     */
    @Test
    public void test02() {

        // 构造器1：Date() : 创建一个对应于当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1);  // Fri Dec 18 10:35:42 CST 2020
        System.out.println(date1.toString());  // Fri Dec 18 10:35:42 CST 2020
        System.out.println(date1.getTime());  // 1608258942944

        // 构造器2：Date(long date) : 创建指定毫秒数的Date对象
        Date date2 = new Date(1608258942944L);
        System.out.println(date2);

        System.out.println("===============================");
        // 创建 java.sql.Date 对象
        java.sql.Date date3 = new java.sql.Date(1608258942944L);
        System.out.println(date3);
        // 如何将 java.util.Date 对象转换为 java.sql.Date对象
        // 情况1：
        Date date4 = new java.sql.Date(1608258942944L);
        java.sql.Date date5 = (java.sql.Date) date4;
        // 情况2：
        Date date6 = new Date();
//        java.sql.Date date7 = (java.sql.Date) date6;  // java.lang.ClassCastException
        java.sql.Date date7 = new java.sql.Date(date6.getTime());
        System.out.println(date7);
    }
}
