import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input n = ");
        int n = Input.nextInt();
        int old_n = n;
        n *= n;
        int new_n = n;
        System.out.println("n^2 = " + new_n);

        String oldNum = Integer.toString(old_n);
        String newNum = Integer.toString(new_n);
    }
}
