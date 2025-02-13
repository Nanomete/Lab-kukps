package Lib;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Form2 extends JFrame implements ActionListener {

    Container cp ;
    JButton left,right,up,down,box,reset ;
    
    public Form2(){
        Initial();
        setComponent();
        Finally();
    }

    public void Initial(){
        cp = this.getContentPane();
        cp.setLayout(null);
    }

    public void setComponent(){

        left = new JButton("A");
        right = new JButton("D");
        up = new JButton("W");
        down = new JButton("S");
        reset = new JButton("RESET");
        box = new JButton();
        box.setBackground(Color.black);
        box.setBounds(0, 0, 50, 50);

        left.setBounds(25, 230, 47, 30);
        down.setBounds(70, 230, 47, 30);
        right.setBounds(115, 230, 47, 30);
        up.setBounds(70, 200, 47, 30);

        x = box.getX();
        y = box.getY();

        cp.add(left);cp.add(right);
        cp.add(up);cp.add(down);
        cp.add(box);

        right.addActionListener(this);
        left.addActionListener(this);
        up.addActionListener(this);
        down.addActionListener(this);
    }

    public void Finally(){
        this.setSize(200, 300);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false); // Frame เพิ่มไซต์ไม่ได้
    }
    
    int x, y;
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == right && x + box.getWidth() <= cp.getWidth()) {
            x += 5;
            box.setBounds(x, y, 50, 50);
        } else if (e.getSource() == left && x - 5 >= 0) {
            x -= 5;
            box.setBounds(x, y, 50, 50);
        } else if (e.getSource() == up && y - 5 >= 0) {
            y -= 5;
            box.setBounds(x, y, 50, 50);
        } else if (e.getSource() == down && y + box.getHeight() < cp.getHeight() - (up.getHeight() + down.getHeight())) {
            y += 5;
            box.setBounds(x, y, 50, 50);
        }
    }
}
