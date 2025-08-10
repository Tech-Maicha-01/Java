import javax.swing.*;
import java.awt.event.*;

public class KeyEventExample extends JFrame  implements KeyListener{
    JLabel label;

    public KeyEventExample()
    {
        label=new JLabel();

        label.setBounds(50,30,200,50);
        label.addKeyListener(this);
        add(label);
        setSize(300,200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }



    public void KeyPressed(KeyEvent e)
    {
        label.setText("Key Pressed:"+e.getKeyCode());
    }

    public void keyReleased(KeyEvent e)
    {
        label.setText("Key Released: "+e.getKeyCode());
    }

    public void KeyTyped(KeyEvent e )
    {
        label.setText("Key typed:"+e.getKeyChar());
    }

    public static void main(String[] args)
    {
         new KeyEventExample();
    }
} 