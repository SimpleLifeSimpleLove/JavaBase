package com.wxx.stringtest;

import org.junit.Test;

/**
 * Date: 2020/12/17 21:06
 * Content: 关于 StringBuffer 和 StringBuilder 的使用
 */
public class StringBufferBuilderTest {

    /*
    String、StringBuffer、StringBuilder 三者的异同？
        String : 不可变的字符序列
        StringBuffer : 可变的字符序列(是指value数组可变，扩容)；线程安全的，但是效率低
        StringBuilder : 可变的字符序列(是指value数组可变，扩容)；线程不安全的，但是效率高；jdk1.5新增的
    源码分析：
        String s1 = new String();  // char[] value = new char[0];
        String s2 = new String("abc");  // char[] value = new char[]{'a', 'b', 'c'};

        StringBuffer sb1 = new StringBuffer();  // char[] value = new char[16];  底层创建了一个长度为16的数组
        System.out.println(sb1.length());  // 0
        sb1.append('a');  // value[0] = 'a';
        sb1.append('b');  // value[1] = 'b';
        StringBuffer sb2 = new StringBuffer("abc");  // char[] value = new char["abc".length() + 16];
        System.out.println(sb2.length());  // 3
        扩容问题：如果要添加的数据底层数组放不下了，那么就需要扩容底层的数组。
            默认情况下，扩容为原来容量的2倍+2，同时将原有数组中的元素复制到新的数组中。
        指导建议：开发中建议大家使用：StringBuffer(int capacity) 或 StringBuilder(int capacity)
     */
    @Test
    public void test01() {

        StringBuffer sb1 = new StringBuffer("abc");
        sb1.setCharAt(0, 'm');
        System.out.println(sb1);
    }


    /*
    StringBuffer 的常用方法：
        StringBuffer append(xxx) : 提供了很多的append()方法，用于字符串拼接
        StringBuffer delete(int start, int end) : 删除指定位置的内容
        StringBuffer replace(int start, int end, String str) : 把[start, end)位置替换为str
        StringBuffer insert(int offset, xxx) : 在指定位置插入 xxx
        StringBuffer reverse() : 把当前字符序列翻转
        public int indexOf(String str)
        public String substring(int start, int end) : 返回一个从start开始，到end结束左闭右开的子字符串
        public int length()
        public char charAt(int index)
        public void setCharAt(int n, char ch)
    总结：
        增 : append(xxx)
        删 : delete(int start, int end)
        改 : setCharAt(int n, char ch) / replace(int start, int end, String str)
        查 : charAt(int index)
        长度 : length()
        遍历 : for + charAt()
     */
    @Test
    public void test02() {

        StringBuffer sb1 = new StringBuffer("abc");
        sb1.append(1);
        sb1.append('1');
        sb1.append("1");
//        sb1.delete(2,4);
//        sb1.replace(2, 4, "hello");
        sb1.insert(2, false);
        System.out.println(sb1);

        String s = sb1.substring(2, 4);
        System.out.println(s);
    }

    /*
    对比 String、StringBuffer、StringBuilder 三者的效率
        效率从高到低排列：StringBuilder > StringBuffer > String

        StringBuffer 用时 : 3
        StringBuilder 用时 : 2
        String 用时 : 1138
     */
    @Test
    public void test03() {

        // 初始设置
        long startTime = 0L;
        long endTime = 0L;
        int n = 20000;  // 循环的次数
        // 开始对比
        startTime = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("");
        for (int i = 0; i < n; i++) {
            buffer.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer 用时 : " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            builder.append(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder 用时 : " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String 用时 : " + (endTime - startTime));
    }

}
