import javax.swing.*;
import java.awt.*;

public class awt7
{
    JFrame f1;
    
    awt7()
    {
        f1=new JFrame("Menu Example");
        
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        f1.setTitle("Hotel Menu");
        f1.setSize(400,300);
        f1.setVisible(true);
        
        JMenuBar menuBar=new JMenuBar();
        
        JMenu fileMenu=new JMenu("File");
        JMenu editMenu=new JMenu("Edit");
        
        JMenuItem newMenu=new JMenuItem("New");
        JMenuItem openMenu=new JMenuItem("Open");
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        
        fileMenu.add(newMenu);
        fileMenu.add(openMenu);
        
        f1.setJMenuBar(menuBar);
        
        
    }
    
    public static void main(String[] args)
    {
        new awt7();
    }
}