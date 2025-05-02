package EXP_10;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class EXP_10_3{
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField taskField = new JTextField();
        taskField.setBounds(20, 20, 240, 30);
        JButton addButton = new JButton("Add");
        addButton.setBounds(270, 20, 80, 30);

        DefaultListModel<String> listModel = new DefaultListModel<>();
        JList<String> taskList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(taskList);
        scrollPane.setBounds(20, 60, 330, 150);

        JButton removeButton = new JButton("Remove");
        removeButton.setBounds(130, 220, 100, 30);

        addButton.addActionListener(e -> {
            String task = taskField.getText();
            if (!task.isEmpty()) {
                listModel.addElement(task);
                taskField.setText("");
            }
        });

        removeButton.addActionListener(e -> {
            int selected = taskList.getSelectedIndex();
            if (selected != -1) {
                listModel.remove(selected);
            }
        });

        frame.add(taskField);
        frame.add(addButton);
        frame.add(scrollPane);
        frame.add(removeButton);
        frame.setVisible(true);
    }
}
