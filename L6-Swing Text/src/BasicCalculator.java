import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BasicCalculator {
    /* Create a calculator program with two text fields
    and 4 buttons, one for each of the arithmetic operations.

    The user will enter numbers, could be decimals, then click
    on one of the buttons and the answer will display on the calculator.

    NO POP-UPS*/
     static JTextField input, input2;
     static JLabel results;


    public static void main(String[] args) {
        JFrame window= new JFrame("Stupid Calculator");
        JPanel panel = new JPanel();
        input=new JTextField(15);
        input2=new JTextField(15);
        JLabel inputLabel=new JLabel("Enter number 1: ");
        JLabel inputLabel2=new JLabel("Enter number 2: ");

        JButton button = new JButton("+");
        JButton button2 = new JButton("-");
        JButton button3 =new JButton(" *");
        JButton button4 = new JButton("/");

        results= new JLabel("00.0");

        window.setSize(200, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        button.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener2());
        button3.addActionListener(new ButtonListener3());
        button4.addActionListener(new ButtonListener4());

        panel.add(inputLabel);
        panel.add(input);
        panel.add(inputLabel2);
        panel.add(input2);

        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(results);
        window.add(panel);
        window.setVisible(true);


    }

private static class ButtonListener implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        double num1=Double.parseDouble(input.getText());
        double num2=Double.parseDouble(input.getText());


        results.setText(String.valueOf(num1+num2));


    }
}
    private static class ButtonListener2 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
        double num1=Double.parseDouble(input.getText());
        double num2=Double.parseDouble(input.getText());


        results.setText(String.valueOf(num1-num2));
        }
    }
    private static class ButtonListener3 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            double num1=Double.parseDouble(input.getText());
            double num2=Double.parseDouble(input.getText());


            results.setText(String.valueOf(num1*num2));

        }
    }
    private static class ButtonListener4 implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            double num1=Double.parseDouble(input.getText());
            double num2=Double.parseDouble(input.getText());


            results.setText(String.valueOf(num1/num2));

        }
    }




}
