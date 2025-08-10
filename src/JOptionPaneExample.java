import javax.swing.JOptionPane;

public class JOptionPaneExample {
    public static void main(String[] args) {
        // 1. Show welcome message
        JOptionPane.showMessageDialog(null, "Welcome to the JOptionPane Demo!", "Welcome", JOptionPane.INFORMATION_MESSAGE);

        // 2. Ask for user's name
        String name = JOptionPane.showInputDialog(null, "What is your name?", "Name Input", JOptionPane.QUESTION_MESSAGE);

        // If user presses cancel or closes the dialog, exit
        if (name == null) {
            JOptionPane.showMessageDialog(null, "No name entered. Exiting.");
            System.exit(0);
        }

        // 3. Ask for age
        String ageStr = JOptionPane.showInputDialog(null, "Hello, " + name + "! How old are you?", "Age Input", JOptionPane.QUESTION_MESSAGE);

        if (ageStr == null) {
            JOptionPane.showMessageDialog(null, "No age entered. Exiting.");
            System.exit(0);
        }

        // 4. Confirm submission
        int confirm = JOptionPane.showConfirmDialog(null, "Confirm your information:\nName: " + name + "\nAge: " + ageStr, "Confirm Info", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Information saved successfully!\nThank you, " + name + "!", "Success", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Information not saved.", "Cancelled", JOptionPane.WARNING_MESSAGE);
        }

        // 5. Exit message
        JOptionPane.showMessageDialog(null, "Program is closing. Goodbye!", "Exit", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
