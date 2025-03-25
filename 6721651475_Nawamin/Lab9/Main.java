import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Form();
        // LoginPage();
    }

    public static void LoginPage() {
        JFrame f = new JFrame("Login");
        Container cp = f.getContentPane();
        cp.setLayout(null);
        JLabel User = new JLabel("USER : ");
        JLabel Password = new JLabel("Password : ");
        JTextField inputUser = new JTextField();
        JPasswordField inputPassword = new JPasswordField();
        JButton bt = new JButton("Login");

        User.setBounds(22+3, 0+5, 200, 16);
        Password.setBounds(0+3, 15+5, 200, 16);
        inputUser.setBounds(70+3, 0+5, 150, 16);
        inputPassword.setBounds(70+3, 20+5, 150, 16);
        bt.setBounds(70+3, 40+5, 75, 20);

        cp.add(User);
        cp.add(Password);
        cp.add(inputUser);
        cp.add(inputPassword);
        cp.add(bt);

        f.setSize(500, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void Form() {
        JFrame f = new JFrame("Login");
        Container cp = f.getContentPane();
        cp.setLayout(null);

        JLabel name = new JLabel("Name : ");
        JLabel Car_license = new JLabel("Car license : ");
        JLabel Province = new JLabel("Province : ");
        JLabel Car_type = new JLabel("Car Type : ");
        JTextField inputname = new JTextField();
        JTextField inputCar = new JTextField();
        JComboBox<String> select_Province = new JComboBox<>();
        JRadioButton rb_Car = new JRadioButton("Car", true); 
        JRadioButton rb_Bike = new JRadioButton("Bike", false);
        JButton bt = new JButton("OK");
        
        ButtonGroup G = new ButtonGroup();
        G.add(rb_Car);
        G.add(rb_Bike);

        name.setBounds(22+12, 0+5, 200, 16);
        Car_license.setBounds(3, 20+5, 200, 16);
        Province.setBounds(3+13, 20+23, 200, 16);
        inputname.setBounds(70+8, 0+5, 200, 16);
        inputCar.setBounds(70+8, 20+5, 90, 16);
        select_Province.setBounds(70+8, 20+23, 90, 16);
        Car_type.setBounds(3+13, 20+40, 200, 16);
        rb_Car.setBounds(70+8, 20+41, 50, 16);
        rb_Bike.setBounds(70+60, 20+41, 50, 16);
        bt.setBounds(70+18, 20+70, 75, 28);
        File file = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            file = new File("Thailand_PRV.csv");
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String s;
            br.readLine(); // header line
            while ((s = br.readLine()) != null) {
                String arr[] = s.split(","); // for split strat to "," => 1, Bangkok [1 is 0 index, Bangkok is 1 index]
                select_Province.addItem(arr[1]); // lacotion 1 is behind ","
            }
            select_Province.setSelectedIndex(1);            
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close(); fr.close();
            } catch (Exception x) {
                System.out.println(x);
            }
        }

        cp.add(name);
        cp.add(inputname);
        cp.add(Car_license);
        cp.add(inputCar);
        cp.add(Province);
        cp.add(select_Province);
        cp.add(Car_type);
        cp.add(rb_Car);
        cp.add(rb_Bike);
        cp.add(bt);

        f.setSize(500, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
