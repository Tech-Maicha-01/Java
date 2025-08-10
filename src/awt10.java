import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class awt10 extends JFrame
{
     JLabel inputLabel;
     JTextField inputField;
     JButton checkBtn;
     JLabel resultLabel;
     
     public awt10()
     {
         setTitle("Even odd Check");
         setSize(400,300);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new FlowLayout(FlowLayout.RIGHT, 150, 10));
         
         inputLabel=new JLabel("Enter a number");
         inputField=new JTextField(10);
         checkBtn=new JButton("Check");
         resultLabel=new JLabel(" ");

         add(inputLabel);
         add(inputField);
         add(checkBtn);
         add(resultLabel);
         
         checkBtn.addActionListener(new ActionListener() 
         {
             @Override
             public void actionPerformed(ActionEvent e)
             {
                 checkEvenOdd();
             }
         });
     }
     
     
     public void checkEvenOdd()
     {
         try
         {
             int number=Integer.parseInt(inputField.getText());
             
             if(number%2==0)
             {
                 resultLabel.setText("Even");
             }
             else
             {
                 resultLabel.setText("Odd");
             }
         }
         catch(NumberFormatException e)
         {
             System.out.println(e);
         }
     }
     
     public static void main(String[] args)
     {
         SwingUtilities.invokeLater(() ->
         {
             awt10 oc=new awt10();
             
         }
         );
     }
}













