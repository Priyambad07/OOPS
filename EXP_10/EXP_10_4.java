package EXP_10;

import javax.swing.*;
import java.awt.event.*;

public class EXP_10_4{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 30, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(160, 30, 150, 25);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 70, 100, 25);
        JTextField emailField = new JTextField();
        emailField.setBounds(160, 70, 150, 25);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 110, 100, 25);
        JPasswordField passField = new JPasswordField();
        passField.setBounds(160, 110, 150, 25);

        JLabel confirmLabel = new JLabel("Confirm Password:");
        confirmLabel.setBounds(50, 150, 120, 25);
        JPasswordField confirmField = new JPasswordField();
        confirmField.setBounds(160, 150, 150, 25);

        JLabel messageLabel = new JLabel();
        messageLabel.setBounds(50, 240, 300, 25);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(130, 200, 100, 30);

        registerButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String pass = new String(passField.getPassword());
            String confirm = new String(confirmField.getPassword());

            if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                messageLabel.setText("Please fill in all fields.");
            } else if (!email.contains("@")) {
                messageLabel.setText("Invalid email format.");
            } else if (!pass.equals(confirm)) {
                messageLabel.setText("Passwords do not match.");
            } else {
                messageLabel.setText("Registration successful!");
            }
        });

        frame.add(nameLabel); frame.add(nameField);
        frame.add(emailLabel); frame.add(emailField);
        frame.add(passLabel); frame.add(passField);
        frame.add(confirmLabel); frame.add(confirmField);
        frame.add(registerButton);
        frame.add(messageLabel);

        frame.setVisible(true);
    }
}

