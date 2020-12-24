package nowcoder_0005;

/**
 * Date: 2020/12/24 11:20
 * Content:
 */
interface A {

}

class B implements A {

}

class C extends B {

}

public class InstanceofTest {

    public static void main(String[] args) {

        A ab = new B();
        A ac = new C();
        B bb = new B();
        B bc = new C();
        C cc = new C();

        // 对象实现一个接口，用这个对象和这个接口进行instanceof判断，都为true
        System.out.println("ab instanceof A : " + (ab instanceof A));
        System.out.println("ac instanceof A : " + (ac instanceof A));
        System.out.println("bb instanceof A : " + (bb instanceof A));
        System.out.println("bc instanceof A : " + (bc instanceof A));
        System.out.println("cc instanceof A : " + (cc instanceof A));
        // 对象和父类进行instanceof判断，都为true
        System.out.println("ab instanceof B : " + (ab instanceof B));
        System.out.println("ac instanceof B : " + (ac instanceof B));
        System.out.println("bb instanceof B : " + (bb instanceof B));
        System.out.println("bc instanceof B : " + (bc instanceof B));
        System.out.println("cc instanceof B : " + (cc instanceof B));
        // 对象和它的子类进行instanceof，都为false
        System.out.println("ab instanceof C : " + (ab instanceof C));
        System.out.println("bb instanceof C : " + (bb instanceof C));

        // 对象是否为自身？以下都为true
        System.out.println("bc instanceof C : " + (bc instanceof C));  // true
        System.out.println("ac instanceof C : " + (ac instanceof C));  // true
    }
}
