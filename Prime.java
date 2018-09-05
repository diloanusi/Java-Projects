import javax.swing.JOptionPane;
public class Prime 
{
   public static void main(String arg[])
   {
      int number;
      String input;
      
      //ask user to input a number 
      input = JOptionPane.showInputDialog("Enter a positive integer:");
      number = Integer.parseInt(input);
      
      while(number < 0)
      {
         input = JOptionPane.showInputDialog("Please enter a positive integer. Hint: Greater than 0");
         number = Integer.parseInt(input); 
      }
      
      if(isPrime(number))
         JOptionPane.showMessageDialog(null, "This is a prime number");
    
      else 
         JOptionPane.showMessageDialog(null, "This is not a prime number");
         
      System.exit(0);
   }
          
   public static boolean isPrime(int number)
   { 
      if(number <= 1) return false;
      
      for(int x = 2; x < number; x++)
      {
         if(number % x == 0)
            return false;
      }
       return true;
   }
      
}