import javax.swing.*;
import java.awt.event.*;

public class awt16 {
    public static void main(String[] args) {
        JFrame f1 = new JFrame();

        JMenuBar menubar = new JMenuBar();
        JMenu filemenu = new JMenu("File");

        JMenuItem newItem = new JMenuItem("New");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f1, "New File Created!");
            }
        });

        saveItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f1, "File Saved!");
            }
        });

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f1, "Closing...");
                System.exit(0); // Actually exit the program
            }
        });

        filemenu.add(newItem);
        filemenu.add(saveItem);
        filemenu.add(exitItem);

        menubar.add(filemenu);
        f1.setJMenuBar(menubar);

        f1.setSize(400, 300);
        f1.setTitle("New, Save and Exit Menu");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }
}
