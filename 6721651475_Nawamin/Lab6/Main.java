
import Lib.Data;
import java.util.Scanner;

public class Main {
    // No 2
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Data daTa = new Data();
        daTa.printMenu();
        boolean state = true;
        while (state) {
            try {
                System.out.print("Select--> ");
                int seLect = input.nextInt();
                switch (seLect) {
                    case 1:
                        daTa.addTextToBack();
                        break;
                    case 2:
                        daTa.addTextAtIndex();
                        break;
                    case 3:
                        daTa.editText();
                        break;
                    case 4:
                        daTa.removeTextByIndex();
                        break;
                    case 5:
                        daTa.removeTextByValue();
                        break;
                    case 6:
                        state = false;
                        System.out.println("Bye!!!");
                        break;
                    default:
                        System.out.println("Wrong input!!!");
                        System.out.println();
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
                input.nextLine();
                daTa.printArr();
            }
        }
    }
}
