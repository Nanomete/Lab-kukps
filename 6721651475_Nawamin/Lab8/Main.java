import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input csv file name : ");
        String fileName = input.nextLine();
        System.out.print("Please input string : ");
        String Text = input.nextLine();
        input.close();
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            f = new File(fileName+".csv");
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null) {
                if (s.contains(Text)) {
                    System.out.println(s);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close(); fr.close();
            } catch (Exception x) {
                System.out.println(x);
            }
        }
    }
}
