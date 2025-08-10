import java.awt.*;

public class awt1 extends Frame
{
    awt1()
    {
        Button b=new Button("Click here");
        b.setBounds(20,50,100,150);
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        add(b);
        setTitle("Awt Example");
        
    }
    
    public static void main(String[] args)
    {
        awt1 a1=new awt1();
        
    }
}

