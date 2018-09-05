import javax.swing.JOptionPane;

/* This program prompts the user to enter a number within the range of 
   1 through 10 and display the Roman numeral version of that number.
*/

public class RomanNumerals 
{

   public static void main(String[] args) 
   
   
   
      int number; // User's input to convert to Roman Numeral
      
      String inputString = JOptionPane.showInputDialog("Enter a number between 1 and 10 ");
      number = Integer.parseInt(inputString);
      
      switch (number)
      {
         case 1:
         JOptionPane.showMessageDialog(null, "I");
         break;
         
         case 2:
         JOptionPane.showMessageDialog(null, "II");
         break;
         
         case 3:
         JOptionPane.showMessageDialog(null, "III");
         break;
         
         case 4:
         JOptionPane.showMessageDialog(null, "IV");
         break;
         
         case 5:
         JOptionPane.showMessageDialog(null, "V");
         break;
         
         case 6:
         JOptionPane.showMessageDialog(null, "VI");
         break;
         
         case 7:
         JOptionPane.showMessageDialog(null, "VII");
         break;
         
         case 8:
         JOptionPane.showMessageDialog(null, "VIII");
         break;
         
         case 9:
         JOptionPane.showMessageDialog(null, "IX");
         break;
         
         case 10:
         JOptionPane.showMessageDialog(null, "X");
         break;

         default:
         JOptionPane.showMessageDialog(null, "Invalid number");
         break;
      
      }
  
  
   }


}