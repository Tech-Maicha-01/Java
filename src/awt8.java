import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class awt8 {
    JFrame f1;

    awt8() {
        f1 = new JFrame("Popup Menu");
        f1.setLayout(new FlowLayout());
        f1.setSize(400, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Right click here to see popup menu");
        label.setPreferredSize(new Dimension(300, 100));

        JPopupMenu popMenu = new JPopupMenu();

        JMenuItem cut = new JMenuItem("cut");
        JMenuItem copy = new JMenuItem("copy");
        JMenuItem paste = new JMenuItem("paste");

        popMenu.add(cut);
        popMenu.add(copy);
        popMenu.add(paste);

        // Add mouse listener to label to show the popup on right-click
        label.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                showPopup(e);
            }

            public void mouseReleased(MouseEvent e) {
                showPopup(e);
            }

            private void showPopup(MouseEvent e) {
                if (e.isPopupTrigger()) { // Checks for right-click (OS-dependent)
                    popMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        f1.add(label);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        new awt8();
    }
}
