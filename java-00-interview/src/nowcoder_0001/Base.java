package nowcoder_0001;

/**
 * Date: 2020/12/10 15:47
 * Content:
 */
public class Base {

    private String baseName = "base";

    public Base() {
        callName();
    }

    public void callName() {
        System.out.println("Base");
        System.out.println(baseName);
    }

    static class Sub extends Base {
        private String baseName = "sub";

        public void callName() {
            System.out.println("Sub");
            System.out.println(baseName);
        }
    }

    public static void main(String[] args) {
        /*
        首先创建基类，然后创建派生类。
        创建基类默认调用 Base()方法，由于派生类存在此方法，则调用派生类的callName()
        此时派生类的 baseName 还未构造，因此值为 null
         */
        Base b = new Sub();  // null
    }
}
