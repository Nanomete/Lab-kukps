import java.util.Scanner;

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Input your E-mail : ");
        String Email = Input.next();

        int len = Email.length();

        for (int i = 0; i < len; i++) {
            char Username = Email.charAt(i);
            if (Username == '@') {
                String Domain = Email.substring(i);
                if (Domain.equals("@gmail.com") || Domain.equals("@hotmail.com")) {
                    System.out.println("Your Domain name is \"" + Domain + "\"");
                }
            }
        }
    }
}
