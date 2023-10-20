import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Jframe extends JFrame implements ActionListener {
    JButton b;
    JLabel l;
    int count;

    Jframe() {
        super("Hello");
        setLayout(new FlowLayout());
        final JTextField jm = new JTextField();
        l = new JLabel("Hello World");
        b = new JButton("Click");
        add(l);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        l.setText("Clicked " + count + " Times");
    }
}

public class Swing {
    public static void main(String[] args) {
        Jframe f1 = new Jframe();
        f1.setSize(500, 500);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
