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
        int len1 = oldNum.length();
        int len2 = newNum.length();
        int text1 = len1 - 1;
        int text2 = len2 - 1;

        char Old_compare = oldNum.charAt(text1);
        char New_compare = newNum.charAt(text2);

        if (Old_compare == New_compare) {
            System.out.println("Yes. " + old_n + " is automorphic number.");
        } else {
            System.out.println("No. " + old_n + " is not automorphic number.");
        }
    }
}
