import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample
{
    public static void main(String[] args){

        JFrame frame =new JFrame();
        frame.setTitle("FlowLayout example");

        frame.setLayout(new FlowLayout());
        
        JButton button1=new JButton("Button 1 ");
        JButton button2=new JButton("Button 2");
        JButton button3=new JButton("Button 3");
        JButton button4=new JButton("Button 4");
        JButton button5=new JButton("Button 5");

        

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);

        frame.setVisible(true);

   
    }
}
