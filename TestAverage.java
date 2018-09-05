//This program demostrates using dialogs with JOptionPane 

import javax.swing.JOptionPane;

public class TestAverage
{
  public static void main (String[] args)
  {
     String inputString; //For reading input
     int testScores1;
     int testScores2;
     int testScores3;
     
     inputString = JOptionPane.showInputDialog("Enter 3 testscores " + "Test 1 ");
     testScores1 = Integer.parseInt(inputString);
     
     inputString = JOptionPane.showInputDialog("Test 2 ");
     testScores2 = Integer.parseInt(inputString);
     
     inputString = JOptionPane.showInputDialog("Test 3 ");
     testScores3 = Integer.parseInt(inputString);
     
     double average = ((testScores1 + testScores2 + testScores3)/3);
    
    
     //Display results 
     JOptionPane.showMessageDialog(null, "Hello " + "your test scores are " + testScores1 + " " + testScores2 + " " + testScores3 + " Your Average is " + average);
     
     //End the program
     System.exit(0);
  }
  
}