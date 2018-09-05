import javax.swing.JOptionPane;

/* 
This program prompts the user to enter test scores, find the average and show a letter grade  
*/
public class GradeAverage 
{

   public static void main(String[] args) 
   {
   
   
      int number1; //testscore 1
      int number2; //testscore 2
      int number3; //testscore 3
      
      String inputString = JOptionPane.showInputDialog("Enter test score 1: ");
      number1 = Integer.parseInt(inputString);
      
      
      inputString = JOptionPane.showInputDialog("Enter test score 2: ");
      number2 = Integer.parseInt(inputString);
      
      
      inputString = JOptionPane.showInputDialog("Enter test score 3: ");
      number3 = Integer.parseInt(inputString);
   
      
      int average = ((number1 + number2 + number3)/3);
      int x = average; 
      
      if (x < 60)
       JOptionPane.showMessageDialog(null, "Your average is F!");
       
      else if (x < 70)
       JOptionPane.showMessageDialog(null, "Your average is D!");
      
      else if (x < 80)
       JOptionPane.showMessageDialog(null, "Your average is C!");
       
      else if (x < 90)
       JOptionPane.showMessageDialog(null, "Your avergae is B!");
      
      else 
       JOptionPane.showMessageDialog(null, "Your average is A!");


      System.exit(0);
    
    }
    
}      