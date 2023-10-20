import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField tf1, tf2;
    JButton b1, b2, b3, b4;

    Calculator() {
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 20);
        b1 = new JButton("+");
        b1.setBounds(50, 150, 50, 50);
        b2 = new JButton("-");
        b2.setBounds(110, 150, 50, 50);
        b3 = new JButton("*");
        b3.setBounds(170, 150, 50, 50);
        b4 = new JButton("/");
        b4.setBounds(230, 150, 50, 50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        add(tf1);
        add(tf2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setSize(350, 350);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1) {
            c = a + b;
        } else if (e.getSource() == b2) {
            c = a - b;
        } else if (e.getSource() == b3) {
            c = a * b;
        } else if (e.getSource() == b4) {
            c = a / b;
        }
        JOptionPane.showMessageDialog(this, "Result is: " + c);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}