import javax.swing.*;

public class NoLayoutExample {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame frame = new JFrame("No Layout Example");

        JLabel label = new JLabel("Name:");
        JTextField textfield = new JTextField("Hello", 20);

        frame.getContentPane().setLayout(null);

        label.setBounds(0, 0, 80, 25);
        textfield.setBounds(100, 10, 160, 25);

        frame.getContentPane().add(label);
        frame.getContentPane().add(textfield);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
