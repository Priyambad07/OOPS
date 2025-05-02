package EXP_10;

import javax.swing.*;
import java.awt.event.*;

public class EXP_10_1{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        JTextField userField = new JTextField();
        userField.setBounds(100, 20, 150, 25);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 60, 80, 25);
        JPasswordField passField = new JPasswordField();
        passField.setBounds(100, 60, 150, 25);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 100, 80, 30);

        JLabel result = new JLabel();
        result.setBounds(100, 140, 200, 25);

        loginButton.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());
            if (user.equals("admin") && pass.equals("password")) {
                result.setText("Login Successful!");
            } else {
                result.setText("Invalid credentials.");
            }
        });

        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);
        frame.add(result);
        frame.setVisible(true);
    }
}
