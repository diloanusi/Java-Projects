//Program that computes tax and tip on restaurant bill 

import javax.swing.JOptionPane;

public class RestaurantBill
{
  public static void main (String[] args)
  {
     String inputString; //For reading input
     double mealPrice;
     final double TAX = 0.0675, TIP = 0.2;
  
     inputString = JOptionPane.showInputDialog("What is the meal price? ");
     mealPrice = Double.parseDouble(inputString);
     
     double totalTax = TAX * mealPrice;
     double totalMealPrice = mealPrice + totalTax;
     final double totalTip = (TIP * totalMealPrice);
     double totalBill = totalTip + totalMealPrice;
     String outputString = String.format("Hello, Meal price is $%.2f, Tax is $%.2f, Tip amount is $%.2f, Total bill is $%.2f", mealPrice, totalTax, totalTip, totalBill); 
     
     //Display results 
     JOptionPane.showMessageDialog(null, outputString); //"Hello " + "Meal price is " + mealPrice + " Tax is " + totalTax + " Tip amount is " + TIP + " Total bill is " + totalBill);
     
     //End the program
     System.exit(0);
  }
  
}