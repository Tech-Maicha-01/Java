import java.awt.*;
import javax.swing.*;

public class awt2 
{
    JFrame f1;
    
    awt2()
    {
        f1=new JFrame();
        f1.setLayout(new FlowLayout());
        
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4");
        JButton b5=new JButton("Button 5");
        JButton b6=new JButton("Button 6");
        
        f1.setVisible(true);
        f1.setSize(400,400);
        
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);
        f1.add(b6);
        
        f1.setTitle("Flow Layout Example");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args)
    {
        awt2 a1=new awt2();
    }
}