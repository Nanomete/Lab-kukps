import Lib.*;

public class Main {
    public static void main(String[] args) {
        // @SuppressWarnings("unused") คือการปิดการแจ้งเตือนว่าไม่ได้ใช้ตัวแปรนี้
        @SuppressWarnings("unused") // ปิดการแจ้งเตือนว่าไม่ได้ใช้ตัวแปรนี้
        Chess c = new Chess();
        c.play();
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Circumference: " + c.calculateCircumference());
        System.out.println("Height: " + c.getHeight());
        System.out.println("Width: " + c.getWidth());
    }
}
