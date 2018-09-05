//Dabeluchukwu 

import javax.swing.JOptionPane; 

public class PayrollDemo
{
   public static void main(String[] args)
   {
      int hours; 
      double payRate;
      String input;
      Payroll payroll = new Payroll();
      
      for(int index = 0; index < 7; index++)
      {
         //Get employeeId
         JOptionPane.showMessageDialog(null, "EmployeeID: " + payroll.getEmployeeID(index));
         
         //Get Hours worked 
         input = JOptionPane.showInputDialog("Enter the number of hours worked: ");
         hours = Integer.parseInt(input);
         payroll.setHours(index, hours);
         
         //validate input
         while(hours < 0)
         {
            input = JOptionPane.showInputDialog("Please enter a positive number: ");
            hours = Integer.parseInt(input);
            payroll.setHours(index, hours);
   
         }
         
         //Get hourly pay 
         input = JOptionPane.showInputDialog("Enter the hourly pay: ");
         payRate = Double.parseDouble(input);
         payroll.setPayRate(index, payRate);
         
         //validate input
         while(payRate < 0)
         {
            input = JOptionPane.showInputDialog("Please enter a positive number: ");
            payRate = Integer.parseInt(input);
            payroll.setPayRate(index, payRate);
   
         }

      }
      //call grosspay calculation 
      payroll.GrossPay();
      
      for(int index = 0; index < 7; index++)
         JOptionPane.showMessageDialog(null, "EmployeeID: " + payroll.getEmployeeID(index) + " Total Pay: " + payroll.getWages(index));
      
      System.exit(0);  
   }
}