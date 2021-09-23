import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */

    public static void main(String[] args) {
    String word1= JOptionPane.showInputDialog("Enter word one");
    String word2= JOptionPane.showInputDialog("Enter word two");
    String word3= JOptionPane.showInputDialog("Enter word three");

    String output=lastThree(word1)+ lastThree(word2)+lastThree(word3);

    JOptionPane.showMessageDialog(null,output);


    System.exit(0);


    }
        public static String lastThree(String word){

     /*  String newword;
       if(word.length()<=3){
           newword=word;
       }else{
           newword=word.substring(word.length()-3);
           return newword;*/

      return word.substring(word.length()-3);











    }
}