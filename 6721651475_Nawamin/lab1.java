import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input distance(km) : ");
        float dist = Input.nextFloat();
        if (dist <= 4.0) {
            System.out.println("Delivery Fee : Free!!!");
        } else if (dist > 4 && dist <= 10) {
            dist -= 4.0f;
            dist *= 10.0f;
            System.out.println("Delivery Fee : " + dist);
        } else {
            float extradist = dist - 10.0f;
            float result = extradist * 12 + 60;
            System.out.println("Delivery Fee : " + result);
        }
    }
}