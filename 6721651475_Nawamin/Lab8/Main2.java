import java.io.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String mName;
        int i = 1;

        do {             
            System.out.print("Please input name : ");
            mName = Input.nextLine();
            File f = new File("Text1.txt");
            FileWriter fw = null;
            BufferedWriter bw = null;
            if (!(mName.equals("Q"))) {
                try {
                    fw = new FileWriter(f, true);
                    bw = new BufferedWriter(fw);
                    bw.write("Name" + "[" + i + "]" + " : " + mName + "\n");
                } catch (Exception e) {
                    System.out.println(e);
                } finally {
                    try {
                        bw.close();
                        fw.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
            i++;
        } while (!(mName.equals("Q")));
    }
}
