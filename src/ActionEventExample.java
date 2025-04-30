// An action event occurs when a user performs an action on a component like :
// JButton , JTextField ,JMenuItem


import javax.swing.*;
import java.awt.event.*;

public class ActionEventExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Action Event Example");

        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 120, 40);

        JTextField textField = new JTextField();
        textField.setBounds(100, 160, 150, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("Button was clicked!");
            }
        });

        frame.add(button);
        frame.add(textField);

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
