import java.awt.*;
import javax.swing.*;


public class BorderLayoutDemo
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Border Layotu Example");

        frame.setLayout( new BorderLayout());

        JButton button1=new JButton("Button1");
        JButton button2=new JButton("Button2");
        

        frame.add(button1, BorderLayout.WEST);
        frame.add(button2, BorderLayout.EAST);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setVisible(true);



    }
}