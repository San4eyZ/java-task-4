package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Function;
import javax.swing.*;

public class GUI<EventType> extends JFrame {
    private EventType calcEvent;
    private Function<String[], String> calculate;

    private JComboBox<String> valueTypes = new JComboBox<>(new String[]{
            "Integer values","Real values","Complex values"
    });
    private JTextField val1 = new JTextField("", 5);
    private JTextField val2 = new JTextField("", 5);
    private JTextField answer = new JTextField("", 5);
    private JComboBox<String> operations = new JComboBox<>(new String[]{
            "+", "-", "*", "/"
    });
    private JButton calculateButton = new JButton("Calculate");

    public GUI(EventType calcEvent, Function<String[], String> calculate) {
        super("Calculator");
        this.calcEvent = calcEvent;
        this.calculate = calculate;

        this.setBounds(100, 100, 500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(6, 2, 1, 1));

        this.valueTypes.setSelectedIndex(0);
        container.add(this.valueTypes);
        container.add(this.val1);
        container.add(this.operations);
        container.add(this.val2);
        container.add(this.answer);
        container.add(this.calculateButton);
    }

    public static class ButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {

        }
    }
}
