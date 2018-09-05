//This program demostrates using dialogs with JOptionPane 

import javax.swing.JOptionPane;

public class SalesTax
{
  public static void main (String[] args)
  {
     String inputString; //For reading input
     final double STATE_TAX = 0.04, COUNTY_TAX = 0.02, TOTAL_TAX = 0.06;
     double purchase;
     
     inputString = JOptionPane.showInputDialog("What's the amount of purchase? ");
     purchase = Double.parseDouble(inputString);
     
     double totalStateTax = purchase * STATE_TAX;
     double totalCountyTax = purchase * COUNTY_TAX;
     double totalSalesTax = purchase * TOTAL_TAX;
     double totalSale = purchase + totalSalesTax;
    
     
     
     
     
     //Display results 
     JOptionPane.showMessageDialog(null, "Hello " + "your purchase is " + purchase + " State tax is " + totalStateTax + " County Tax is " + totalCountyTax + " Total sale " + totalSale);
     
     //End the program
     System.exit(0);
  }
  
}