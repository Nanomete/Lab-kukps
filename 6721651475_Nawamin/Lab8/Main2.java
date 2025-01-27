import java.io.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        File f = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        int i = 1;
        try {
            f = new File("Text1.txt");
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            Scanner Input = new Scanner(System.in);
            do {
                System.out.print("Please input name : ");
                String Name = Input.nextLine();
                if (Name.equals("Q")) {
                    break;
                }
                bw.write("Name ["+ i + "]" + " : " + Name + "\n");
                i++;
            } while(true);
            Input.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bw.close(); fw.close();
            } catch (Exception x) {
                System.out.println(x);
            }
        }
    }
}
