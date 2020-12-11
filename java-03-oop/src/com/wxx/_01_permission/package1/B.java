package com.wxx._01_permission.package1;

/**
 * Date: 2020/12/11 15:14
 * Content:
 */
public class B {

    public void test01() {

        // B 不是 A的子类，因此这些内容都不能直接访问
//        System.out.println(v1);
//        System.out.println(v2);
//        System.out.println(v3);
//        System.out.println(v4);
//        showV1();
//        showV2();
//        showV3();
//        showV4();
    }

    // 同一个包下的非子类(new)
    public void test02() {

        A obj = new A();
//        System.out.println(obj.v1);  // error, private
        System.out.println(obj.v2);
        System.out.println(obj.v3);
        System.out.println(obj.v4);

//        obj.showV1();  // error, private
        obj.showV2();
        obj.showV3();
        obj.showV4();
    }
}
