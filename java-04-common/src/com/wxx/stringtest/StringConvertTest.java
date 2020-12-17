package com.wxx.stringtest;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Date: 2020/12/17 14:18
 * Content: String 和 其他类型之间的相互转换
 */
public class StringConvertTest {

    /*
    String 与 基本数据类型、包装类之间的转换
        String -> 基本数据类型、包装类 : 调用包装类的静态方法：parseXxx(str)
        基本数据类型、包装类 -> String : 调用String的重载方法 valueOf(xxx)
     */
    @Test
    public void test01() {

        String s1 = "123";
//        int num = (int)s1;  // error
        int num1 = Integer.parseInt(s1);
        System.out.println(num1);

        System.out.println("===============================");
        double num2 = 1.45;
        String s2 = String.valueOf(num2);
        System.out.println(s2);
    }

    /*
    String 和 char[] 之间的转换：
        String -> char[] : 调用 String 的 toCharArray()
        char[] -> String : 调用 String 的构造器
     */
    @Test
    public void test02() {

        String s1 = "abc123";
        char[] charArray = s1.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }

        System.out.println("===============================");
        char[] arr = new char[]{'h', 'e', 'l', 'd'};
        String s2 = new String(arr);
        System.out.println(s2);
    }

    /*
    String 和 byte[] 之间的转换：
        编码 : String -> byte[] : 调用 String 的 getBytes()
        解码 : byte[] -> String : 调用 String 的构造器

    编码：字符串 -> 字节（看得懂的 -> 看不懂的二进制数据）
    解码(编码的逆过程)：字节 -> 字符串（看不懂的二进制数据 -> 看得懂）

    说明：解码时，要求解码使用的字符集必须与编码时使用的字符集一致，否则会出现乱码。
     */
    @Test
    public void test03() throws UnsupportedEncodingException {

        String s1 = "abc123中国";
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));  // 使用默认的字符集进行编码
        byte[] gbks = s1.getBytes("gbk");  // 使用gbk字符集进行编码
        System.out.println(Arrays.toString(gbks));


        System.out.println("===============================");
        String s2 = new String(bytes);  // 使用默认的字符集进行解码
        System.out.println(s2);

        String s3 = new String(gbks);
        System.out.println(s3);

        String s4 = new String(gbks, "gbk");
        System.out.println(s4);
    }

}
