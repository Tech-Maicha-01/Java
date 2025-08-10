import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class awt12 extends JFrame
{
    JButton button;
    awt12()
    {
        
        setTitle("Mouse Adapter Example");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        JLabel label=new JLabel("Click here");
        button=new JButton("Button 1");
        
        add(label);
        add(button);
        
        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e )
            {
                label.setText("Mouse clicked at"+e.getX()+" "+e.getY());
                
                
            }a
        });
        }
    
    public static void main(String[] args)
    {
        new awt12();
    }
}













