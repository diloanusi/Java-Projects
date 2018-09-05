//Dabeluchukwu 

import java.util.Scanner;

public class DriverProgram
{
   public static void main(String args[])
   {  
      int number;
      Scanner keyboard = new Scanner(System.in);
      //ask user for input 
      System.out.print("Enter an account number: ");
      number = keyboard.nextInt();
      
      //check to see input is a valid account number 
      if(ChargeAccountValidation.isValid(number) == true)
         System.out.println("Thats a valid account number.");
         
      else  
         System.out.println("Invalid account number.");   
   }
}