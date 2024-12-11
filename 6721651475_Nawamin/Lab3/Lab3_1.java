import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input String 1 : ");
        String text1 = Input.nextLine();
        System.out.print("Input String 2 : ");
        String text2 = Input.nextLine();

        String new_Text1 = text1.toUpperCase();
        String new_Text2 = text2.toUpperCase();

        if (new_Text1.equals(new_Text2)) {
            System.out.println("The two strings are equal.");
        } else {
            System.out.println("The two strings are Not equal.");
        }
    }
}