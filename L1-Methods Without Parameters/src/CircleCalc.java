import javax.swing.*;
import java.text.DecimalFormat;
public class CircleCalc {


    public static void main(String[] args) {
        area();
        circumference();
            System.exit(0);
        //call the area method

        //call the circumference method

    }
    //write a method to calculate a circle's area
    public static void area() {
      DecimalFormat round= new DecimalFormat("#.##");
      double radius= Double.parseDouble(JOptionPane.showInputDialog("What is the circles radius?"));
      double area=Math.pow(radius, 2)*Math.PI;
      JOptionPane.showMessageDialog(null, "The circles area is " + round.format(area));
    }
    //write a method to calculate a circle's circumference
    public static void circumference() {
        DecimalFormat round= new DecimalFormat("#.##");
        double radius= Double.parseDouble(JOptionPane.showInputDialog("What is the circles radius?"));
        double  circumference=2*Math.PI*radius;

        JOptionPane.showMessageDialog(null, "The circles  circumference is " + round.format(circumference));
    }





}
