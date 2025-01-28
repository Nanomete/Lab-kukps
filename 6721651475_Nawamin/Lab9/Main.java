import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        LoginPage();
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
}
