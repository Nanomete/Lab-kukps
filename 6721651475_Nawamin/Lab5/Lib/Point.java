
public class Point {
    private double x;
    private double y;
    private static int count;

    public Point() { // constuctor defualt
        this.count = 0;
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) { // constructor
        this.x = x;
        this.y = y;
        increseCount(); // count บวก 1 เมื่อสร้าง object ใหม่
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public static int getCount() {
        return count;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public static void setCount(int count) {
        Point.count = count;
    }

    public double Distance() {
        return Math.sqrt(Math.pow(x , 2) + Math.pow(y, 2));
    }
    public double Distance(double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x), 2) + Math.pow((y2 - y), 2));
    }
    public double Distance(Point p) {
        return Distance(p.getX(), p.getY());
    } 
    public static void increseCount() {
        count++;
    }

    //@Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
