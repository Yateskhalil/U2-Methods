import javax.swing.*;
import java.awt.event.ActionEvent;
import  java.awt.event.ActionListener;
import java.text.DecimalFormat;


public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.
     */
    public static void main(String[] args) {
        JFrame window= new JFrame("Feet to Meters vice versa");
        JPanel panel = new JPanel();
        JButton button = new JButton("Feet to Meters");
        JButton button2= new JButton("Meters to Feet");

        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener2());

        panel.add(button);
        panel.add(button2);
        window.add(panel);

        window.setVisible(true);


    }
private static class ButtonListener implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        DecimalFormat round = new DecimalFormat("#.##");
    double feet= Double.parseDouble(JOptionPane.showInputDialog("Please enter the Feet measurement"));
    double meters=feet/3.281;
    JOptionPane.showMessageDialog(null,"The converted measurement is "+round.format(meters));
    }
}
    private static class ButtonListener2 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            DecimalFormat round = new DecimalFormat("#.##");
            double meters=Double.parseDouble(JOptionPane.showInputDialog("Please enter the Meters measurement"));
            double feet=meters*3.281;
            JOptionPane.showMessageDialog(null,"The converted measurement is"+round.format(feet));
        }
    }

}
