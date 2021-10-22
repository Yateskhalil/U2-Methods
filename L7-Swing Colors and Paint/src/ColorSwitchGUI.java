import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {
    JFrame window;
    JPanel panel;
    JButton colorChanger;
    JButton colorChanger2;
    JButton colorChanger3;

    Color black= new Color(0, 0, 0);
    Color newC= new Color(23, 98, 75);
    Color  foreground= new Color(255, 255, 255, 255);



    public ColorSwitchGUI(){

        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        colorChanger = new JButton("Change the Colors");
        colorChanger2= new JButton("Change the Colors");
        colorChanger3= new JButton("Change the Colors");


       colorChanger.addActionListener(new button1());
       colorChanger2.addActionListener(new button2());
       colorChanger3.addActionListener(new button3()  );


        panel.setBackground(black);
        colorChanger.setBackground(Color.gray);
        colorChanger.setForeground(Color.blue);
        colorChanger2.setForeground(Color.CYAN);
        colorChanger2.setBackground(Color.black);
        colorChanger3.setBackground(Color.pink);
        colorChanger3.setForeground(Color.white);
        panel.add(colorChanger);
        panel.add(colorChanger2);
        panel.add(colorChanger3);
        window.add(panel);

        window.setVisible(true);
    }


    private  class button1 implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(foreground);
            colorChanger.setForeground(black);
            colorChanger.setBackground(newC);
        }
    }
    private  class  button2 implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(black);
            colorChanger2.setForeground(newC);
            colorChanger2.setBackground(foreground);



        }
    }
    private  class  button3 implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {
            panel.setBackground(newC);
            colorChanger3.setForeground(foreground);
            colorChanger3.setBackground(black);



        }
    }

}