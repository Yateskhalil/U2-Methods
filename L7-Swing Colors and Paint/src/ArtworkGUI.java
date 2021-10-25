import javax.swing.*;
import java.awt.*;

public class ArtworkGUI {

    JFrame frame;
    Color blue = new Color(0, 164, 239);
    Color red = new Color(242, 80, 34);
    Color green = new Color(127, 186, 0);
    Color yellow= new Color(255,185,0);
    Color lightGray= new Color(115,115,115);

    public ArtworkGUI() {
        frame = new JFrame("Simple Drawing-Microsoft Logo");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //ADD THE PANEL TO THE FRAME
        JPanel panel = new MyDrawing();

        frame.add(panel);
        frame.setVisible(true);


    }

    private class MyDrawing extends JPanel {
        public MyDrawing() {
            //Set the background color
            setBackground(lightGray);
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(red);
            g.fillRect(90,90,100,100);
            g.drawRect(90,90,100,100);


            g.setColor(yellow);
            g.fillRect(200,200,100,100);
            g.drawRect(200,200,100,100);

            g.setColor(green);
            g.fillRect(200,90,100,100);
            g.drawRect(200,90,100,100);



           g.setColor(blue);
            g.fillRect(90,200,100,100);
            g.drawRect(90,200,100,100);
        }
    }
}
