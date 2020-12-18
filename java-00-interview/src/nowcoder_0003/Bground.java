package nowcoder_0003;

/**
 * Date: 2020/12/18 21:17
 * Content:
 */
public class Bground extends Thread {

    public static void main(String[] args) {

        Bground b = new Bground();
        b.run();  // 执行后没有输出
    }

    public void start() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Value of i = " + i);
        }
    }
}
