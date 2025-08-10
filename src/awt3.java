import java.awt.*;
import javax.swing.*;

public class awt3 
{
    JFrame f1;

    awt3(){
        
        f1=new JFrame();
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4");
        JButton b5=new JButton("Button 5");
        
        f1.setLayout(new BorderLayout());
        f1.setSize(400,400);
        
        f1.add(b1,BorderLayout.NORTH);
        f1.add(b2,BorderLayout.SOUTH);
        f1.add(b3,BorderLayout.EAST);
        f1.add(b4,BorderLayout.WEST);
        f1.add(b5,BorderLayout.CENTER);

        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setTitle("Border Layout");
        f1.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        awt3 a3=new awt3();
    }
}