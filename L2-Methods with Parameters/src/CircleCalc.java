import javax.swing.*;
import java.text.DecimalFormat;

public class CircleCalc {
    public static void main(String[] args) {
        double radius= Double.parseDouble(JOptionPane.showInputDialog("What is the circles radius?"));

        area(radius);
        circumference(radius);

        System.exit(0);

    }
    public static void area(double radius) {
        DecimalFormat round= new DecimalFormat("#.##");
        double area=Math.pow(radius, 2)*Math.PI;

        JOptionPane.showMessageDialog(null, "The circles area is " + round.format(area));
    }
    public static void circumference(double radius) {
        DecimalFormat round= new DecimalFormat("#.##");
        double  circumference=2*Math.PI*radius;

        JOptionPane.showMessageDialog(null, "The circles circumference is " + round.format(circumference));
    }
        }
