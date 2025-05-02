package EXP_10;
import javax.swing.*;
import java.awt.event.*;

public class EXP_10_5 {
    static int seconds = 0;
    static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stopwatch");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel timeLabel = new JLabel("0");
        timeLabel.setBounds(140, 30, 100, 30);

        JButton startButton = new JButton("Start");
        startButton.setBounds(30, 80, 70, 30);
        JButton stopButton = new JButton("Stop");
        stopButton.setBounds(110, 80, 70, 30);
        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(190, 80, 70, 30);

        timer = new Timer(1000, e -> {
            seconds++;
            timeLabel.setText(String.valueOf(seconds));
        });

        startButton.addActionListener(e -> timer.start());
        stopButton.addActionListener(e -> timer.stop());
        resetButton.addActionListener(e -> {
            timer.stop();
            seconds = 0;
            timeLabel.setText("0");
        });

        frame.add(timeLabel);
        frame.add(startButton);
        frame.add(stopButton);
        frame.add(resetButton);

        frame.setVisible(true);
    }
}

