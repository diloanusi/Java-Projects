import java.util.Scanner; //needed for scanner class

public class SumofNumbers 
{
   public static void main(String[] args)
   {
      int maxValue; //maximum value to display 
      int sumofNumbers = 0; //accumulator 
      
      //create a scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //get the maximum value to sum 
      System.out.print("Enter a positive nonzero integer: ");
      maxValue = keyboard.nextInt();
      
      for (int number = 1; number <= maxValue; number++)
      {
         sumofNumbers += number;
      }
         
         System.out.println("The sum of all integers from 1 to " + maxValue + " is " + sumofNumbers);
   }
            
}