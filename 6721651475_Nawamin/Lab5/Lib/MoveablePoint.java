public class MoveablePoint extends Point {
    private double x;
    private double y;
    private static double speed;

    public MoveablePoint() {
        this.x = 0;
        this.y = 0;
        this.speed = 0;
    }
    public MoveablePoint(double x, double y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    public void Forward() {
        x += speed; // x = x + speed เพื่อเคลื่อนที่ไปข้างหน้า
        y += speed; // y = y + speed เพื่อเคลื่อนที่ไปข้างหน้า 
    }
    public void Backward() {
        x -= speed; // x = x - speed เพื่อเคลื่อนที่ไปข้างหลัง
        y -= speed; // y = y - speed เพื่อเคลื่อนที่ไปข้างหลัง
    }

    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    //@Override
    public String toString() {
        return "(" + x + "," + y + "," + speed + ")";
    }
}
