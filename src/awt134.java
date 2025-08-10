import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class awt134 extends JFrame implements ActionListener{

    JTextField tf;
    awt134()
    {
        setTitle("ActionListenerExample");
        setSize(200,400);
        setLayout(new FlowLayout());
        setVisible(true);
        
        tf=new JTextField();
        tf.setBounds(60,50,80,30);
        Button b=new Button("Click me");
        b.addActionListener(this);
        
        add(tf);
        add(b);
        
    }
    
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Welcome");
    }
    
    public static void main(String[] args)
    {
        new awt134();
    }
    
}
