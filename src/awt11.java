// Write a program to find out the Sum when mouse is pressed and difference when mouse is released..


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class awt11 extends JFrame
{
    JTextField textfield1;
    JTextField textfield2;
    JTextField resultfield;
    
    public awt11()
    {
        setTitle("Addition and Subtraction");
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2));
        
        JLabel label1=new JLabel("Enter first Number");
        textfield1=new JTextField(10);
        JLabel label2=new JLabel("Enter Second Number");
        textfield2=new JTextField(10);
        JLabel label3=new JLabel("Result");
        resultfield=new JTextField(10);
        
        add(label1);
        add(textfield1);
        add(label2);
        add(textfield2);
        add(label3);
        add(resultfield);
        
        
        
        
        addMouseListener(new MouseAdapter()
        {
            @Override
            public void mousePressed(MouseEvent e)
            {
                calculateSum();
            }
            
            @Override
            public void mouseReleased(MouseEvent e)
            {
                calculateDiff();
            }
        });
        
        
    }
    
    public void calculateSum()
    {
        try
        {
            int num1=Integer.parseInt(textfield1.getText());
            int num2=Integer.parseInt(textfield2.getText());
            
            int result=num1+num2;
            resultfield.setText(String.valueOf(result));
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
    };
    
    public void calculateDiff()
    {
        try 
        {
            int num1=Integer.parseInt(textfield1.getText());
            int num2=Integer.parseInt(textfield2.getText());
            
            int result=num1-num2;
            
            resultfield.setText(String.valueOf(result));
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }   
    };
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() ->
        {
            awt11 a1=new awt11();
        });
    };
}

















