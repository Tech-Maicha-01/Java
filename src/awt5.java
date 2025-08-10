import java.awt.*;
import javax.swing.*;

public class awt5
{
    JFrame f1;
    
    awt5()
    {
        f1=new JFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new GridBagLayout());
        f1.setSize(400,400);
        f1.setTitle("Grid Bag Layout Demonstration");
        
        GridBagConstraints gbc=new GridBagConstraints();
        
        
        JButton b1=new JButton("B1");
        gbc.gridx=0;
        gbc.gridy=0;
        f1.add(b1,gbc);
        
        JButton b2=new JButton("B2");
        gbc.gridx=1;
        gbc.gridy=0;
        f1.add(b2,gbc);
        
        JButton b3=new JButton("B3");
        gbc.gridx=0;
        gbc.gridy=1;
        f1.add(b3,gbc);
        
        JButton b4=new JButton("B4");
        gbc.gridx=1;
        gbc.gridy=1;
        f1.add(b4,gbc);

        f1.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        awt5 a=new awt5();
    }
}
