import Lib.Point;
import Lib.MoveablePoint;

public class Main {
    public static void main(String[] args) {
        
        // ข้อที่ 1
        Point A = new Point(20, 50);
        Point B = new Point(30, 15);

        System.out.println(A.toString());
        System.out.println(B.toString());

        System.out.println(A.Distance(B));
        System.out.println(A.Distance(0, 0));
        System.out.println(B.Distance(10, 100));
        System.out.println(Point.getCount() + ".0");
        
        // ข้อที่ 2
        MoveablePoint C = new MoveablePoint(25, 60, 5);
        System.out.println(C.toString());
        C.Forward();
        System.out.println(C.toString());
        C.Backward();
        System.out.println(C.toString());
    }
}
