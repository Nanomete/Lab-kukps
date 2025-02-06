package Lab10.Lib;

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
        JPanel table = Createtable();
        JPanel start = CreateGame();
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
        p.setLayout(new GridLayout(8, 8));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                JButton B = new JButton();
                B.setPreferredSize(new Dimension(80, 80));
                if ((j + i) % 2 == 0) {
                    B.setBackground(Color.BLACK);
                } else {
                    B.setBackground(Color.WHITE);
                }
                p.add(B);
            }
        }
        return p;
    }

    public JPanel CreateGame() {
        JPanel G = new JPanel();
        G.setLayout(new BoxLayout(G, BoxLayout.Y_AXIS));

        JLabel Game_Panel = new JLabel("Game Panel.");
        Game_Panel.setPreferredSize(new Dimension(200,100));
        Game_Panel.setAlignmentX(Component.CENTER_ALIGNMENT);
        Game_Panel.setFont(new Font("Times New Roman", Font.BOLD , 20));
        JLabel Time_Passed = new JLabel("Time Passed : 00.00");
        Time_Passed.setPreferredSize(new Dimension(200,100));
        Time_Passed.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton b = new JButton("START");
        b.setAlignmentX(Component.CENTER_ALIGNMENT);
        b.setFont(new Font("Times New Roman", Font.BOLD , 13));
        b.setPreferredSize(new Dimension(60,150));

        G.add(Box.createVerticalStrut(200));
        G.add(Game_Panel);
        G.add(Box.createVerticalStrut(20));
        G.add(Time_Passed);
        G.add(Box.createVerticalStrut(30));
        G.add(b);
        G.add(Box.createVerticalStrut(50));
        cp.add(G,BorderLayout.EAST);
        return G;
    }
}
