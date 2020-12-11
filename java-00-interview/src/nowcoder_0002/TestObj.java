package nowcoder_0002;

/**
 * Date: 2020/12/11 14:21
 * Content:
 */
public class TestObj {

    public static void main(String[] args) {

        Object o = new Object() {
            @Override
            public boolean equals(Object obj) {
                return true;
            }
        };

        System.out.println(o.equals("Fred"));  // true
    }
}
