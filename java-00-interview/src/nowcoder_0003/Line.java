package nowcoder_0003;

/**
 * Date: 2020/12/18 21:13
 * Content:
 */
public class Line {

    public class Point {
        public int x, y;
    }

    public Point getPoint() {
        return new Point();
    }
}

class Triangle {
    public Triangle() {
        // insert code here
//        Point p = (new Line()).getPoint();  // error
        Line.Point p = (new Line()).getPoint();
    }
}
