import java.awt.*; //used to import Frame and BorderLayout for arranging components
import javax.swing.*;//used to import JFrame and JButton needed to create Gui
public class BorderLayoutWithFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("BorderLayout Example"); //Create a new Frame with title "BorderLayout Example"

        frame.setLayout(new BorderLayout()); //set the Windows layout to BorderLayout

        // Correct: use BorderLayout.NORTH, etc.
        frame.add(new Button("North"), BorderLayout.NORTH);//Add a button labeled to the North region of the layout
        frame.add(new Button("South"), BorderLayout.SOUTH);//Add a button to the South region of the layout
        frame.add(new Button("East"), BorderLayout.EAST);//Add a button to the East region of the layout
        frame.add(new Button("West"), BorderLayout.WEST);
        frame.add(new Button("Center"), BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
