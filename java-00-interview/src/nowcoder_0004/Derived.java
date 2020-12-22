package nowcoder_0004;

/**
 * Date: 2020/12/22 21:26
 * Content:
 */
class Base {

    public Base(String s) {
        System.out.println("B");
    }
}

public class Derived extends Base {

    public Derived(String s) {
        super("s");  // 没有这句话，会报错，默认调用super()
        System.out.println("D");
    }

    public static void main(String[] args) {

        new Derived("C");
    }
}
