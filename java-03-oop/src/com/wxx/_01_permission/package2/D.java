package com.wxx._01_permission.package2;

import com.wxx._01_permission.package1.A;

/**
 * Date: 2020/12/11 15:14
 * Content:
 */
public class D extends A {

    // 不同包下的子类
    public void test01() {

        // B 是 A 的不同子类
//        System.out.println(v1);  // error, private
//        System.out.println(v2);  // error, default
        System.out.println(v3);
        System.out.println(v4);
//        showV1();  // error, private
//        showV2();  // error, default
        showV3();
        showV4();
    }

    // 不同包下的非子类(new)
    public void test02() {

        A obj = new A();
//        System.out.println(obj.v1);  // error, private
//        System.out.println(obj.v2);  // error, default
//        System.out.println(obj.v3);  // error, protected 只能作为子类才能访问
        System.out.println(obj.v4);

//        obj.showV1();  // error, private
//        obj.showV2();  // error, default
//        obj.showV3();  // error, protected 只能作为子类才能访问
        obj.showV4();
    }
}
