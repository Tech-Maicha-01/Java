import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class form1 {
    public static void main(String[] args) {
        // Frame
        JFrame frame = new JFrame("Simple Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new GridLayout(0, 2, 10, 10));

        // Name
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        // Password
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        // Hobbies
        JLabel hobbiesLabel = new JLabel("Hobbies:");
        JPanel hobbiesPanel = new JPanel();
        JCheckBox hobby1 = new JCheckBox("Reading");
        JCheckBox hobby2 = new JCheckBox("Traveling");
        JCheckBox hobby3 = new JCheckBox("Gaming");
        hobbiesPanel.add(hobby1);
        hobbiesPanel.add(hobby2);
        hobbiesPanel.add(hobby3);

        // Gender
        JLabel genderLabel = new JLabel("Gender:");
        JPanel genderPanel = new JPanel();
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderPanel.add(male);
        genderPanel.add(female);

        // Submit Button
        JButton submitBtn = new JButton("Submit");
        submitBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String pass = new String(passField.getPassword());

                String hobbies = "";
                if (hobby1.isSelected()) hobbies += "Reading ";
                if (hobby2.isSelected()) hobbies += "Traveling ";
                if (hobby3.isSelected()) hobbies += "Gaming ";

                String gender = "";
                if (male.isSelected()) gender = "Male";
                else if (female.isSelected()) gender = "Female";

                JOptionPane.showMessageDialog(frame,
                        "Name: " + name +
                        "\nPassword: " + pass +
                        "\nHobbies: " + hobbies +
                        "\nGender: " + gender);
            }
        });

        // Add components to frame
        frame.add(nameLabel);   frame.add(nameField);
        frame.add(passLabel);   frame.add(passField);
        frame.add(hobbiesLabel); frame.add(hobbiesPanel);
        frame.add(genderLabel); frame.add(genderPanel);
        frame.add(new JLabel()); // empty space
        frame.add(submitBtn);

        // Show frame
        frame.setVisible(true);
    }
}
