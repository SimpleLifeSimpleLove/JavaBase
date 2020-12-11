package nowcoder_0002;

/**
 * Date: 2020/12/11 14:27
 * Content:
 */
public class Test {

    public static Test t1 = new Test();
//    public Test t3 = new Test();  // java.lang.StackOverflowError

    {
        // 通过字节码分析，会被编译到 对象的构造方法中（即<init>中）
        System.out.println("blockA");
    }

    // 会生成三个 <init> 方法，每个方法中都有 System.out.println("blockA");
//    public Test() {
//    }
//    public Test(Object o1) {
//    }
//    public Test(Object o1, Object o2) {
//    }

    static {
        System.out.println("blockB");
    }

    public static void main(String[] args) {

        /*
            blockA
            blockB
            blockA
         */
        Test t2 = new Test();
    }
}
/*
分析：
    类的加载顺序：
    (1) 父类静态对象 和 静态代码块；
    (2) 子类静态对象 和 静态代码块；
    (3) 父类非静态对象 和 非静态代码块；
    (4) 父类构造函数；
    (5) 子类非静态对象 和 非静态代码块；
    (6) 子类构造函数；

    public static Test t1 = new Test();  这句话会使得调用 Test 的构造函数，
    运行 代码块 中的内容 System.out.println("blockA");

    然后继续执行static块中内容，System.out.println("blockB");

    类加载完毕后最后执行Test t2 = new Test();这句话又会执行  代码块 中的内容 System.out.println("blockA");
 */
