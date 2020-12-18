package com.wxx.stringtest.exercise;

/**
 * Date: 2020/12/18 22:07
 * Content:
 */
public class Exercise2 {

    public static void main(String[] args) {

        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());  // 4
        System.out.println(sb);  // "null"

        StringBuffer sb1 = new StringBuffer(str);  // NPE
        System.out.println(sb1);
    }
}
