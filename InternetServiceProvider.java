import javax.swing.JOptionPane;

/* 
This program prompts the user to enter a package (A, B, or C) and then the total number of hours used.
Then it calculates the fee for the month
*/
public class InternetServiceProvider 
{

   public static void main(String[] args) 
   {
      
      String internetPackage; // A, B, or C
      String inputString = JOptionPane.showInputDialog("Enter the package choosen (A, B, or C): ");
      internetPackage = inputString;
      
      int hours; 
      inputString = JOptionPane.showInputDialog("Enter the number of hours used: ");
      hours = Integer.parseInt(inputString);
      
      double monthlyBill;
      double payment;
      int extraHours; 
      
      if (internetPackage.equalsIgnoreCase("A"))
      {
            payment = 9.95;
            extraHours = 0;
            
               if (hours > 10)
               {
                  extraHours = hours - 10;
                  monthlyBill = ((2.00 * extraHours) + payment);
               }
                  
               else 
                  monthlyBill = payment; 
                
            JOptionPane.showMessageDialog(null, "Your total charge for the month is " + monthlyBill + " including " 
                                          + extraHours + " hour(s)" + " (note $2.00 per hours for additional hours)");
      }
           
      else if (internetPackage.equalsIgnoreCase("B"))
      {      
            payment = 13.95;
            extraHours = 0;
            
               if (hours > 20)
               {
                  extraHours = hours - 20;
                  monthlyBill = ((1.00 * extraHours) + payment);
               }  
               
               else 
                  monthlyBill = payment; 

            JOptionPane.showMessageDialog(null, "Your total charge for the month is " + monthlyBill + " including " 
                                          + extraHours + " hour(s)" + " (note $1.00 per hour(s) for additional hours)");
      }
            
      else if (internetPackage.equalsIgnoreCase("C"))
      { 
            payment = 19.95;
            monthlyBill = payment;
            extraHours = 0;
                  
            JOptionPane.showMessageDialog(null, "Your total charge for the month is " + monthlyBill + " including " 
                                          + extraHours + " hour(s)" + " (note unlimited hours for you!)");
      }
      else
        JOptionPane.showMessageDialog(null, "Please enter a valid package");

      System.exit(0);
    
    }
    
}      