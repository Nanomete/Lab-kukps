import java.util.Scanner;

public class lab1_2 {
        public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input your number : ");
        int number = Input.nextInt();
        if (number < 100000000) {
            System.out.print("Your Encryption Code = ");
            do { 
                int iDigit = number % 10;
                if (iDigit % 2 == 0) {
                    System.out.print(iDigit + 1);
                } else {
                    System.out.print(iDigit - 1);
                }
                number /= 10;
            } while (number > 0);
        } else {
            System.out.println("Your number it's too much.");
        }
    }
}
