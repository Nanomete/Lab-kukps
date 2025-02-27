package Lib;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Form2 extends JFrame {
    public Form2(){
            getContentPane().setLayout(new BorderLayout());
            Draw2 b = new Draw2();
            getContentPane().add(b,BorderLayout.CENTER);
            setSize(300, 300);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }
    }

class Draw2 extends JPanel implements ActionListener{
    int r = 100;
    boolean decrease_r;
    int start_ang;
    public Draw2() {
        Timer t = new Timer(50, this);
        t.start();
        decrease_r = true;
        start_ang = 0;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width_Center = getHeight()/2;
        int height_Center = getHeight()/2;
        g.drawOval(width_Center-r, height_Center-r, r*2, r*2);
        for (int i = 0; i < 6; i++) {
            g.fillArc(width_Center-r, height_Center-r, r*2, r*2, i*60 + start_ang, 30);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        start_ang += 2;
        if (start_ang > 360) start_ang = 0;
        if (decrease_r) {
            r -= 5;
            if (r == 0)
            decrease_r = false;
        } else {
            r += 5;
            if (r == 100)
                decrease_r = true;
        }        
        repaint();
    }
}
