package EXP_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EXP_10_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        JTextField textField = new JTextField();
        textField.setBounds(30, 20, 230, 30);
        frame.setLayout(null);

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        JTextField display = new JTextField();
        display.setBounds(30, 20, 230, 40);
        frame.add(display);

        ActionListener listener = new ActionListener() {
            String current = "";
            public void actionPerformed(ActionEvent e) {
                String cmd = e.getActionCommand();
                if (cmd.equals("=")) {
                    try {
                        display.setText(String.valueOf(eval(display.getText())));
                    } catch (Exception ex) {
                        display.setText("Error");
                    }
                } else if (cmd.equals("C")) {
                    display.setText("");
                } else {
                    display.setText(display.getText() + cmd);
                }
            }
        };

        int x = 30, y = 70;
        for (int i = 0; i < buttons.length; i++) {
            JButton b = new JButton(buttons[i]);
            b.setBounds(x, y, 50, 40);
            b.addActionListener(listener);
            frame.add(b);
            x += 60;
            if ((i + 1) % 4 == 0) {
                x = 30;
                y += 50;
            }
        }

        frame.setSize(320, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static double eval(String expression) {
        try {
            return ((Number) new javax.script.ScriptEngineManager()
                    .getEngineByName("JavaScript")
                    .eval(expression)).doubleValue();
        } catch (Exception e) {
            return 0;
        }
    }

}
