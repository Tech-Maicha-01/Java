import javax.swing.*;

public class awt23 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Example");
        
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        JComboBox<String> comboBox = new JComboBox<>(fruits);
        
        frame.add(comboBox);
        frame.setSize(300, 200);
        frame.setLayout(null);
        comboBox.setBounds(50, 50, 150, 25);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
