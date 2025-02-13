package Lib;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Form1 extends JFrame implements ActionListener{

    Container cp ;
    JLabel name , id ;
    JTextField t1 ,t2,t3 ;
    JButton b1,b2 ;
    public Form1(){
        Initial();
        setComponent();
        Finally();
    }
    public void Initial(){
        cp = this.getContentPane();
        cp.setLayout(null);
    }
    public void setComponent(){
        id = new JLabel("ID : ");
        name = new JLabel("Name : ");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton("Add");
        b2 = new JButton("Clear");  
        
        id.setBounds(32, 10, 60, 25);
        name.setBounds(10, 40, 60, 25);
        t1.setBounds(60, 10, 120, 25);
        t2.setBounds(60, 40, 180, 25);
        b1.setBounds(30, 80, 70, 25);
        b2.setBounds(120, 80, 70, 25);
        
        cp.add(id); cp.add(t1);
        cp.add(name); cp.add(t2);
        cp.add(b1) ; cp.add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    public void Finally(){
        this.setSize(270, 160);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            t1.setText(""); // เซ็ตเป็นช่องว่าง
            t2.setText(""); // เซ็ตเป็นช่องว่าง
        } else if (e.getSource() == b1) {
            boolean Error = false;
            String errorString = "";
            String tmp = t1.getText();
            for (int i = 0; i < tmp.length(); i++) {
                if (!Character.isDigit(tmp.charAt(i))) {
                    Error = true;
                    errorString += "ID must be a number.";
                    break;
                }
            }
            tmp = t2.getText();
            for (int i = 0; i < tmp.length(); i++) {
                if (!(Character.isAlphabetic(tmp.charAt(i)) || tmp.charAt(i) == ' ')) {
                    Error = true;
                    errorString += "ID must container letters or spaces.";
                    break;
                }
            }
            if (Error) {
                popUp(errorString);
            } else {
                Write_csv(t1.getText(), t2.getText());
                popUp("Complete");
            }
        }
    }

    public void Write_csv(String id, String name) {
        File f = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            f = new File("./File/STD.csv");
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            bw.write(id + "," + name + "\n");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bw.close(); fw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void popUp(String s) {
        JDialog d = new JDialog();
        JLabel l = new JLabel(s);
        l.setFont(new Font("", Font.PLAIN, 18));
        d.getContentPane().add(l);
        d.pack();
        d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }
}
