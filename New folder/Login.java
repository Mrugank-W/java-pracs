import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Login() {
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(loginButton);

        add(panel);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        if (username.equals("admin") && password.equals("password")) {
            JFrame frame = new JFrame("Welcome");
            JLabel label = new JLabel("Welcome to My world");
            frame.add(label);
            frame.pack();
            frame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Something went wrong");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}