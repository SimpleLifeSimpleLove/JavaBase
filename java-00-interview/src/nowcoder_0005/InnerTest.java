package nowcoder_0005;

/**
 * Date: 2020/12/24 11:04
 * Content:
 */
public class InnerTest {

    int a = 2;
    static int b = 9;
    private String s;
    private static String str;

    class Inner1 {

        void test() {
            System.out.println(a);  // 外围类属性
            System.out.println(b);  // 外围类静态属性
            System.out.println(s);  // 外围类私有属性
            System.out.println(str);  // // 外围类静态私有属性
            /*
            总结：非静态内部类
                1.可以访问外围类的非静态属性，包括私有属性
                2.可以访问外围类的静态属性，包括私有属性
             */
        }
    }

    static class Inner2 {

        void test() {
//            System.out.println(a);  // 外围类属性，编译错误
            System.out.println(b);  // 外围类静态属性
//            System.out.println(s);  // 外围类私有属性，编译错误
            System.out.println(str);  // // 外围类静态私有属性
            /*
            总结：静态内部类
                1.不可以访问外围类的非静态属性
                2.可以访问外围类的静态属性，包括私有属性
             */
        }
    }
}
