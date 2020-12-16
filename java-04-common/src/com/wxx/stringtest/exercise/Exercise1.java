package com.wxx.stringtest.exercise;

/**
 * Date: 2020/12/16 20:51
 * Content:
 */
public class Exercise1 {

    String s = new String("good");
    char[] ch = {'t', 'e', 's', 't'};

    private void change(String s, char ch[]) {  // 对应一个新的栈帧，变量都是新的
        s = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        exercise1.change(exercise1.s, exercise1.ch);
        System.out.println(exercise1.s);  // good
        System.out.println(exercise1.ch);  // best
    }
}
