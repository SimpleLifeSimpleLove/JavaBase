package com.wxx.stringtest;

import org.junit.Test;

/**
 * Date: 2020/12/16 21:12
 * Content: String 中的常用方法演示
 */
public class StringMethodTest {

    /*
    int length() : 返回字符串的长度：return value.length
    char charAt(int index) : 返回某索引处的字符串：return value[index]
    boolean isEmpty() : 判断是否是空字符串：return value.length == 0
    String toLowerCase() : 使用默认语言环境，将 String 中的所有字符转换为小写。
    String toUpperCase() : 使用默认语言环境，将 String 中的所有字符转换为大写。
    String trim() : 返回字符串的副本，忽略前导空白和尾部空白。
    boolean equals(Object obj) : 比较字符串的内容是否相同。
    boolean equalsIgnoreCase(String anotherString) : 与equals方法类似，忽略大小写。
    String concat(String str) : 将指定字符串连接到此字符串的结尾。等价于"+"。
    int compareTo(String anotherString) : 比较两个字符串的大小。
    String substring(int beginIndex) : 返回一个新的字符串，它是此字符串从 beginIndex 开始截取到最后的一个子字符串。
    String substring(int beginIndex, int endIndex) : 返回一个新的字符串，
        它是此字符串从 beginIndex 开始截取到endIndex(不包含)的一个子字符串。
     */
    @Test
    public void test01() {

        String s1 = "HelloWorld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
//        System.out.println(s1.charAt(10));  // java.lang.StringIndexOutOfBoundsException
        System.out.println(s1.isEmpty());

        System.out.println("===============================");
        String s2 = s1.toLowerCase();
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("===============================");
        String s3 = "   he   llo  world    ";
        String s4 = s3.trim();
        System.out.println("--" + s3 + "--");
        System.out.println("--" + s4 + "--");

        System.out.println("===============================");
        String s5 = "HelloWorld";
        String s6 = "helloworld";
        System.out.println(s5.equals(s6));
        System.out.println(s5.equalsIgnoreCase(s6));

        System.out.println("===============================");
        String s7 = "abc";
        String s8 = s7.concat("def");
        System.out.println(s8);

        System.out.println("===============================");
        String s9 = "abc";
        String s10 = "abe";
        System.out.println(s9.compareTo(s10));

        System.out.println("===============================");
        String s11 = "大连理工大学";
        System.out.println(s11.substring(2));
        System.out.println(s11.substring(2, 4));
    }

    /*
    boolean endsWith(String suffix) : 测试此字符串是否以指定的后缀结束。
    boolean startsWith(String suffix) : 测试此字符串是否以指定的前缀开始。
    boolean startsWith(String prefix, int toffset) : 测试此字符串从指定索引开始的字符串是否是以指定前缀开始。
    ------------------------------
    boolean contains(CharSequence s) : 当且仅当此字符串包含指定的 char 值序列时，返回 true。
    int indexOf(String str) : 返回指定子字符串在此字符串中第一次出现的索引。
    int indexOf(String str, int fromIndex) : 返回指定子字符串在此字符串中第一次出现的索引，从指定的索引开始。
    int lastIndexOf(String str) : 返回指定子字符串在此字符串中最右边出现的索引。
    int lastIndexOf(String str, int fromIndex) : 返回指定子字符串在此字符串中最右边出现的索引，从指定的索引开始反向搜索。
    注意：indexOf和lastIndexOf方法如果未找到都是返回 -1
     */
    @Test
    public void test02() {

        String s1 = "HelloWorld";

        System.out.println(s1.endsWith("rld"));
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.startsWith("ll", 2));

        System.out.println("===============================");
        System.out.println(s1.contains("Wor"));
        System.out.println(s1.indexOf("lo"));
        System.out.println(s1.indexOf("lo", 5));

        System.out.println("===============================");
        String s2 = "Hello or World";
        System.out.println(s2.lastIndexOf("or"));
        System.out.println(s2.lastIndexOf("or", 8));

        /*
        什么情况下，indexOf(str)和lastIndexOf(str)返回值相同？
            (1) 存在唯一一个str. (2) 不存在str
         */
    }

    /*
    String replace(char oldChar, char newChar) : 返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有的 oldChar 得到的。
    String replace(CharSequence target, CharSequence replacement) : 使用指定的字面值替换序列，替换此字符串所有匹配字面值目标序列
        的子字符串。
    String replaceAll(String regex, String replacement) : 使用给定的 replacement 替换此字符串所有匹配给定正则表达式的子字符串。
    String replaceFirst(String regex, String replacement) : 使用给定的 replacement 替换此字符串匹配给定正则表达式的第一个子字符串。
    ------------------------------
    boolean matches(String regex) : 告知此字符串是否匹配给定的正则表达式。
    ------------------------------
    String[] split(String regex) : 根据给定正则表达式拆分字符串。
    String[] split(String regex, int limit) : 根据给定正则表达式拆分字符串，最多不超过limit个，如果超过了，剩下的全部放到最后一个元素中。
     */
    @Test
    public void test03() {

        String s1 = "大连 大连理工大学";
        System.out.println(s1.replace('连', '理'));
        System.out.println(s1.replace("大连", "北京"));

        System.out.println("===============================");
        String s2 = "12hello34world5java7981mysql1456";
        System.out.println(s2.replaceAll("\\d+", ",").replaceAll("^,|,$", ""));

        System.out.println("===============================");
        String s3 = "12345";
        System.out.println(s3.matches("\\d+"));
        String tel = "0571-4534289";
        System.out.println(tel.matches("0571-\\d{7,8}"));

        System.out.println("===============================");
        String s4 = "hello   world  java";
        String[] strs = s4.split("\\s+");
        for (String str : strs) {
            System.out.println(str);
        }
        System.out.println();
        String s5 = "hello.world.java";
        String[] strs2 = s5.split("\\.");
        for (String str : strs2) {
            System.out.println(str);
        }

    }
}
