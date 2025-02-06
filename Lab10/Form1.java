package Lab10;

import java.awt.*;
import javax.swing.*;

public class Form1 extends JFrame {
    Container cp;
    public Form1() {
        super("Checkers");
        Initial();
        setComponent();
        Finally();
    }

    public void Initial() {
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
    }

    public void setComponent() {
        JPanel table = new JPanel();
        JPanel start = new JPanel();
        cp.add(table, BorderLayout.CENTER);
        cp.add(start, BorderLayout.EAST);
        table.setLayout(new GridLayout(8, 8));
        start.setLayout(new BoxLayout(start, BoxLayout.Y_AXIS));
    }
    
    public void Finally() {
        ImageIcon img = new ImageIcon("./img/chess.jpg");
        this.setIconImage(img.getImage());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public JPanel Createtable() {
        JPanel p = new JPanel();
        return p;
    }

    public JPanel CreateGame() {
        JPanel G = new JPanel();
        return G;
    }
}
