import javax.swing.*;


public class awt6
{
    JFrame f1;
    
    awt6()
    {
        f1=new JFrame("Textfield adding!");
        
        JTextField textField=new JTextField("Write your message here");
        textField.setBounds(20,30,200,30);
        
        JTextArea textArea=new JTextArea("This is a text area");
        textArea.setBounds(20,70,200,100);
        JScrollPane scrollpane=new JScrollPane(textArea);
        textArea.setEditable(true);

        JPasswordField passwordField=new JPasswordField();
        passwordField.setBounds(20,200,200,30);
        passwordField.setActionCommand("OK");
        // passwordField.addActionListener(this);


        JCheckBox checkBox=new JCheckBox("Check me");
        checkBox.setBounds(20,240,200,30);

        JCheckBox checkBox2=new JCheckBox("Or me");
        checkBox2.setBounds(20,260,200,30);

        JRadioButton radioButton=new JRadioButton("Select me");
        radioButton.setBounds(20,280,200,30);   

        JRadioButton radioButton2=new JRadioButton("Or me");
        radioButton2.setBounds(20,320,200,30);  


        f1.add(checkBox);
        f1.add(checkBox2);
        f1.add(radioButton);
        f1.add(radioButton2);
        f1.add(textField);
        f1.add(textArea);
        f1.add(scrollpane);
        f1.add(passwordField);
        f1.setLayout(null);
        f1.setSize(400,400);
        
        f1.setLayout(null);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        
    }

    public static void main(String[] args)
    {
        awt6 a6=new awt6();
    }
}
