import javax.swing.*;
import java.text.DecimalFormat;

public class TrianglePerimeter {
/*
1.get input-x1,y1,x2,y2,x3,y3
2.Calculate distances - 1,2; 2,3; 3,1;
3.Calculate perimeter
4.display rounded 2 decimal answer

 */


    public static void main(String[] args) {

    int x1= input ("Point 1, x-corrdianate ");
    int y1= input ("Point 1, y-corrdianate ");

    int x2= input ("Point 2, x-corrdianate ");
    int y2= input ("Point 2, y-corrdianate ");

    int x3= input("Point 3, x-corrdianate ") ;
    int y3= input ("Point 3, y-corrdianate ");

    double distance1= distance(x1, x2, y1,y2);
    double distance2= distance(x2,x3,y2,y3);
    double distance3= distance(x1,x3,y1,y3);

            double perimeter= triPerimeter(distance1, distance2, distance3);
    displayResults(perimeter);
    }
    public static int input(String message){
    return Integer.parseInt(JOptionPane.showInputDialog(message));


    }
    public static double distance(int x1,int x2,int x3, int y1,int y2, int y3){
    return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow((y2-y1, 2));



        }
    public static double triPerimeter(double side1, double side2, double side3){
    return  side1+side2+side3;






        }


        public static void displayResults(double perimeter){
        DecimalFormat round = new DecimalFormat("#,###.00");

    JOptionPane.showMessageDialog(null, "The perimeter is "+ round.format(perimeter));



    }

        }




/*
    Create a program which when given three coordinates of a triangle, calculates the perimeter.

    (2,3) , (5, 7) , (-2, 8) -> 18.47

    Program should round to 2 decimals and include two methods,
    one for returning the distance between two points and another
    for calculating the perimeter of a triangle.
     */