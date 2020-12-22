package nowcoder_0004;

/**
 * Date: 2020/12/22 21:17
 * Content:
 */
public class NowCoder0004 {

    /*
    (单选题) 以下哪个事件会导致线程销毁？(D)
        A 调用方法sleep()
        B 调用方法wait()
        C start方法的执行结束
        D run()方法的执行结束
     */

    /*
    (单选题) 下面不是面向对象的基本原则的是？(C)
        A 单一职责原则(Single-Responsibility Principle)
        B 开放封闭原则(Open-Closed Principle)
        C 抽象类原则(Abstract-Class Principle)
        D 依赖倒置原则(Dependency-Inversion Principle)
        E 接口隔离原则(Interface-Segregation Principle)
     */

    /*
    Derived

    class Base {
        public Base(String s) {
            System.out.println("B");
        }
    }
    public class Derived extends Base {
        public Derived(String s) {
            System.out.println("D");
        }
        public static void main(String[] args) {
            new Derived("C");
        }
    }
    运行结果？
    结果：编译错误
    原因：子类构造方法在调用时必须先调用父类的，由于父类没有无参构造，必须在子类中显式调用
     */

    /*
    TestDog
    运行结果？
    结果：编译错误
    原因：编译看左边，运行看右边。也就是在编译的时候会把 b 看成Animal类型，Animal中没有bark()方法，所以报错
     */

    /*
    (不定项选择题)下面关于变量及其范围的陈述哪些是不正确的？(BC)
        A 实例变量是类的成员变量
        B 实例变量用关键字 static 声明
        C 在方法中定义的局部变量在该方法被执行时创建
        D 局部变量在使用前必须初始化

        分析：
        A 成员变量 包含 实例变量和类变量(静态变量)
        B ...
        C 在方法中定义的局部变量在该方法被加载时创建
        D ...
     */
}
