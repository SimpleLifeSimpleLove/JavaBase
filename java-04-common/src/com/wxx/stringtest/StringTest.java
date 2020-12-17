package com.wxx.stringtest;

import org.junit.Test;

/**
 * Date: 2020/12/15 21:05
 * Content:
 */
public class StringTest {

    /*
    String : 字符串，使用一对 "" 引起来表示
        1. String 声明为 final 的，不可被继承；
        2. String 实现了 Serializable 接口：表示字符串是支持序列化的；
                  实现了 Comparable 接口，表示 String 可以比较大小
        3. String 内部定义了 private final char value[]; 用于存储字符串数据。数组不可以被重新赋值，数据内的元素也不能被重新赋值
        4. String 代表不可变的字符序列。简称：不可变 性。
            体现：(1) 当对字符串重新赋值时，需要重写指定内存区域（方法区的字符串常量池中）赋值，不能使用原有的 value 进行赋值
                 (2) 当对现有的字符串进行连接操作时，也需要重新指定内存区域（方法区的字符串常量池中）赋值，不能使用原有的 value 进行赋值
                 (3) 当调用 String 的 replace() 方法修改指定字符或者字符串时，也需要重新指定内存区域（方法区的字符串常量池中）赋值，
                     不能使用原有的 value 进行赋值
        5. 通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串值声明在字符串常量池（方法区）中。
        6. 字符串常量池中是不会存储相同内容的字符串的。
     */
    @Test
    public void test01() {

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);  // 比较s1和s2的地址值，true

        System.out.println("===============================");
        s1 = "hello";  // 4 (1)
        System.out.println(s1);  // hello
        System.out.println(s2);  // abc

        System.out.println("===============================");
        String s3 = "abc";
        s3 += "def";  // 4 (2)
        System.out.println(s3);  // abcdef
        System.out.println(s2);

        System.out.println("===============================");
        String s4 = "abc";
        String s5 = s4.replace('a', 'm');  // 4 (3)
        String s6 = s4.replace("ab", "mm");  // 4 (3)
        System.out.println(s4);  // abc
        System.out.println(s5);  // mbc
        System.out.println(s6);  // mmc
    }

    /*
    String 的实例化方式：
        方式一：通过字面量定义的方式
        方式二：通过 new + 构造器的方式
    面试题：String s = new String("abc"); 方式创建对象时，在内存中创建了几个对象？
        两个：一个是在堆空间中的 new 结构； 另一个是 char[] 对应的常量池中的数据："abc"
     */
    @Test
    public void test02() {

        // 通过字面量定义的方式：此时的 s1 和 s2 的数据 JavaEE 声明在方法区中的字面量常量池中。
        String s1 = "JavaEE";
        String s2 = "JavaEE";
        // 通过 new + 构造器的方式：此时的 s3 和 s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值。
        String s3 = new String("JavaEE");
        String s4 = new String("JavaEE");
        System.out.println(s1 == s2);  // true
        System.out.println(s1 == s3);  // false
        System.out.println(s1 == s4);  // false
        System.out.println(s3 == s4);  // false

        System.out.println("===============================");
        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Tom", 12);
        System.out.println(p1.name.equals(p2.name));  // true
        System.out.println(p1.name == p2.name);  // true
        p1.name = "Jerry";  // 通过修改 p1.name 无法修改 p2.name
        System.out.println(p2.name);  // Tom
    }

    /*
    通过下面的测试，可以得到如下结论：
        1. 常量与常量拼接的结果仍然在方法区中的常量池中。且常量池不会存在相同内容的常量。
        2. 拼接的过程中只要有一个是变量(包括基本类型的变量)，结果就在堆中。
        3. 如果拼接的结果调用 intern() 方法，返回值就在常量池中。
     */
    @Test
    public void test03() {

        String s1 = "JavaEE";
        String s2 = "Hadoop";

        String s3 = "JavaEEHadoop";
        String s4 = "JavaEE" + "Hadoop";
        String s5 = s1 + "Hadoop";
        String s6 = "JavaEE" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);  // true
        System.out.println(s3 == s5);  // false
        System.out.println(s3 == s6);  // false
        System.out.println(s3 == s7);  // false
        System.out.println(s5 == s6);  // false
        System.out.println(s5 == s7);  // false
        System.out.println(s6 == s7);  // false

        String s8 = s5.intern();  // 返回值得到的 s8 使用常量池中已经存在的"JavaEEHadoop"
        System.out.println(s3 == s8);  // true

        System.out.println("===============================");
        final String s9 = "JavaEE";  // s9 是常量
        String s10 = s9 + "Hadoop";
        System.out.println(s3 == s10);  // true
    }
}