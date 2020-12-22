package nowcoder_0004;

/**
 * Date: 2020/12/22 21:32
 * Content:
 */
class Animal {
    public void move() {
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("狗可以跑和走");
    }
    public void bark() {
        System.out.println("狗可以吠叫");
    }
}

public class TestDog {

    public static void main(String[] args) {

        Animal a = new Animal();
        Animal b = new Dog();
        a.move();
        b.move();
//        b.bark();  // 编译报错
    }
}
