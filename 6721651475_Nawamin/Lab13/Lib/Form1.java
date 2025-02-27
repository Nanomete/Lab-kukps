package Lib;

import java.awt.*;
import javax.swing.*;

public class Form1 extends JFrame {
    public Form1(){
        getContentPane().setLayout(new BorderLayout());
        Draw1 a = new Draw1();
        getContentPane().add(a,BorderLayout.CENTER);
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class Draw1 extends JPanel{
    public void paintComponent(Graphics g) {
        g.setFont(new Font("", Font.BOLD, 20));
        g.drawString("Just Keep Smiling", getWidth()/2-75, getHeight()/2-100);
        g.setColor(Color.YELLOW);
        g.fillOval(getWidth()/2-75, getHeight()/2-75, 150, 150); // face
        g.setColor(Color.black);
        g.fillOval(getWidth()/2-33, getHeight()/2-40, 30, 30); // eyes
        g.fillOval(getWidth()/2-(-6), getHeight()/2-40, 30, 30); // eyes
        g.drawArc(getWidth()/2-60, getHeight()/2-20, 120, 70, -28, -120); // draw mouse
        g.drawOval(getWidth()/2-75, getHeight()/2-75, 150, 150);
        Polygon xy = new Polygon();
        xy.addPoint(getWidth()/2-75, getHeight()/2+75-17);
        xy.addPoint(getWidth()/2-75, getHeight()/2+110-17);
        xy.addPoint(getWidth()/2+75, getHeight()/2+75-17);
        xy.addPoint(getWidth()/2+75, getHeight()/2+110-17);
        g.setColor(Color.RED);
        g.fillPolygon(xy);
    }
}