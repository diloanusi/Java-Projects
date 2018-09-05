import javax.swing.JOptionPane;

/* 
This program lets th user enter a series of integers. Once the user enters -99 it ends it 
After all numbers have been entered, program displays largest and smallest numbers
*/
public class LargestandSmallest 
{

   public static void main(String[] args) 
   {
      int number; // integers only 
      int smallest = 2147483647;
      int largest = -2147483647; 
      
      String inputString = JOptionPane.showInputDialog("Enter an integer: ");
      number = Integer.parseInt(inputString);
      
      while (number != -99) //User enters -99 to end program 
      {
         inputString = JOptionPane.showInputDialog("Enter an integer: ");
         number = Integer.parseInt(inputString);
         
         if (number < smallest)
            smallest = number;
         else if (number > largest)
            largest = number;
      }
      
      System.out.println("Largest = " + largest);
      System.out.println("Smallest = " + smallest);
      
     System.exit(0);
   }
}   