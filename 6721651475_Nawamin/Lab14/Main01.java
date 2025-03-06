import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Input Number : ");
            int Number = Integer.parseInt(input.nextLine());
            input.close();

            System.out.println("Summation = " + Summation(Number));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static int Summation(int Num) {
        if (Num < 10) {
            return Num;
        } else {
            Num = (Num % 10) + Summation(Num / 10);
            return Num;
        }
    }
}