import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Please input csv file name: ");
        String mFileName = Input.next();

        if (mFileName.equals("CarMPG")) {
            System.out.print("Please input string: ");
            String mTextString = Input.next();

            BufferedReader br = null;
            FileReader fr = null;

            try {
                File read = new File("CarMPG.csv");
                fr = new FileReader(read);
                br = new BufferedReader(fr);

                String s;
                boolean found = false;

                while ((s = br.readLine()) != null) {
                    if (s.contains(mTextString)) {
                        System.out.println(s);
                        found = true;
                    }
                }
                if (!found) {
                    System.out.println("String not found.");
                }
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                try {
                    br.close();
                    fr.close();
                } catch (Exception x) {
                    System.out.println(x);
                }
            }
        } else {
            System.out.println("Not Found.");
        }
    }
}
