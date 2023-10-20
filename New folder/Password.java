import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Newpage extends JFrame {
    Newpage() {
        super("Welcome page");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        JLabel h1 = new JLabel("Welcome to My World");
        add(h1);
        setVisible(true);
        setSize(300, 300);
    }
}

class Jframe1 extends JFrame implements ActionListener {
    JButton b1;
    JLabel l1, l2;
    JTextField t1, t2;

    Jframe1() {
        super("Login page");
        setLayout(new FlowLayout());
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        b1 = new JButton("Login");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent r) {
        String username = t1.getText();
        String password = t2.getText();
        if (username.equals("mnt") && password.equals("tt")) {
            Newpage n1 = new Newpage();
        } else {
            JOptionPane.showMessageDialog(null, "Please enter a valid username and password");
        }
    }
}

public class Password {
    public static void main(String[] args) {
        Jframe1 j1 = new Jframe1();
        j1.setVisible(true);
        j1.setSize(500, 500);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
