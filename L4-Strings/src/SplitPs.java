import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
    1.get input-words wit P's and letters
    2.isolate P
    3.isolate next three letters
    4.combine
    5.display results
     */
    public static void main(String[] args) {
    String word= JOptionPane.showInputDialog("Enter a word that has  p and three letters after it or else:");

    JOptionPane.showMessageDialog(null, splitP(word));
    System.exit(0);

    }

    public static String splitP(String word) {
    int pIndex=word.indexOf('p');

    String split = word.substring(pIndex, pIndex+4);

    return split;


    }
}
