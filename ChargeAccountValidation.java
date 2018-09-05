//Dabeluchukwu

public class ChargeAccountValidation
{
   private static int[] valid = { 5658845, 4520125, 7895122, 8777541, 
                           8451277, 1302850, 8080152, 4562555,
                           5552012, 5050552, 7825877, 1250255,
                           1005231, 6545231, 3852085, 7576651,
                           7881200, 4581002 }; 
   //check to see validity of account number by comparison with valid numbers 
   public static boolean isValid(int number)
   {  
      //loop through the account to know the numbers on the account 
      for(int i = 0; i < valid.length; i++)
      {
          if(valid[i] == number)
            return true;  
      }
      
      return false;
   }                        
}