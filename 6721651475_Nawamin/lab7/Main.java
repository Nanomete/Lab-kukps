import Lib.*;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Chess c = new Chess();
        c.play();
        System.out.println("Area: " + c.calculateArea());
        System.out.println("Circumference: " + c.calculateCircumference());
        System.out.println("Height: " + c.getHight());
        System.out.println("Width: " + c.getWidth());
    }
}
