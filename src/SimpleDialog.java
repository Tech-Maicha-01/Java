import javax.swing.JOptionPane;

public class SimpleDialog {
    public static void main(String[] args) {
        // Ask user for their name
        String name = JOptionPane.showInputDialog("Enter your name:");

        // Show a greeting message
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
    }
}
A