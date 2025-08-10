import javax.swing.*;

public class awt9
{
    JFrame f1;
    
    awt9()
    {
        f1=new JFrame();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JOptionPane.showMessageDialog(f1,"This is for showing dialog");
        
        int result=JOptionPane.showConfirmDialog(f1,"Do you want to continue?");
        
        if(result == JOptionPane.YES_OPTION)
        {
            JOptionPane.showMessageDialog(f1," you choose yes!");
        }
        else if(result==JOptionPane.NO_OPTION)
        {
            JOptionPane.showMessageDialog(f1,"You choose no!");
        }
        else
        {
            JOptionPane.showMessageDialog(f1,"You cancelled!!");
        }
        
    }
    
    public static void main(String[] args)
    {
        new awt9();
    }
}