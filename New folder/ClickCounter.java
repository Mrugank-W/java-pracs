import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClickCounter extends JFrame implements ActionListener {
    private int count = 0;
    private JLabel label;
    private JButton button;

    public ClickCounter() {
        label = new JLabel("Clicks: 0");
        button = new JButton("Click me!");
        button.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(button);

        add(panel);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Clicks: " + count);
    }

    public static void main(String[] args) {
        new ClickCounter();
    }
}