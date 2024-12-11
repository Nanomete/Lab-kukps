import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input Number : ");
        int w = Input.nextInt();
        int sum = 0;
        for (int i = 0; i <= w / 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
                sum++;
            }
            System.out.print("\n");
        }
        for (int i = w / 2 - 1; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i + 1; j++) {
                System.out.print("*");
                sum++;
            }
            System.out.print("\n");
        }
        System.out.println("Count of * is " + sum);   
    }
}