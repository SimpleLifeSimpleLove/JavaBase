package nowcoder_0001;

import org.junit.Test;

/**
 * Date: 2020/12/10 9:33
 * Content:
 */
public class NowCoder_0001 {

    /*
    (单选题)对于Java类型变量 char c、 short s、 float f、 double d表达式
           c*s + f + d的结果类型为 (D)
           A.float      B.char      C.short     D.double
     */

    /*
    (单选题)在 applet 的方法中，可关闭小程序并释放资源的是(D)
           A.stop()      B.paint()      C.init()     D.destroy()
     */

    @Test
    public void test01() {

        int a = 100, b = 50;
        int c = a-- - b;
        int d = a-- - b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    /*
    参见Base
     */

    /*
    (不定项选择题)在jdk1.8中，下面关于java抽象类和接口的区别，说法错误的是(BD)
        A.抽象类中可以有构造方法，接口中不能有构造方法
        B.抽象类中可以包含非抽象的普通方法，接口中的方法必须是抽象的，不能有非抽象的普通方法
        C.一个类可以实现多个接口，但只能继承一个抽象类
        D.接口中可以有普通成员变量，抽象类中没有普通成员变量

        分析：
        抽象类：
            (1)可以有构造方法
            (2)可以存在普通属性，普通方法；也可以存在静态属性，静态方法
            (3)可以存在抽象方法，也可以不存在
        接口：
            (1)可以有 static方法，default方法
            (2)不能有构造
            (3)接口中定义的量最终都会加上 public static final
     */

}
