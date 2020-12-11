package com.wxx._01_permission.package1;

/**
 * Date: 2020/12/11 15:14
 * Content:
 */
public class C extends A {

    // 同一个包下的子类
    public void test01() {

        // B 是 A的子类，除了private之外都能直接访问
//        System.out.println(v1);  // error, private
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
//        showV1();  // error, private
        showV2();
        showV3();
        showV4();
    }
}
