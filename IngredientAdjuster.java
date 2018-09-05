//This program demostrates using dialogs with JOptionPane 

import javax.swing.JOptionPane;

public class IngredientAdjuster
{

  public static void main (String[] args)
  {
     String inputString; //For reading input
     final double CUPS_OF_SUGAR = 1.5;
     final int CUP_OF_BUTTER = 1;
     final double CUPS_OF_FLOUR = 2.75;
     final int RECIPE = 48;
     
     int cookieBatch;
     inputString = JOptionPane.showInputDialog("How many cookies " + "do you want to make? ");
     
     cookieBatch = Integer.parseInt(inputString);
     double totalCupsofSugar, totalCupofButter, totalCupsofFlour;
     totalCupsofSugar = ((CUPS_OF_SUGAR * cookieBatch)/RECIPE);
     totalCupofButter = ((CUP_OF_BUTTER * cookieBatch)/RECIPE);
     totalCupsofFlour = ((CUPS_OF_FLOUR * cookieBatch)/RECIPE); 
     
     //Display results 
     JOptionPane.showMessageDialog(null, "Hello " + "Ingredients needed: Cups of Sugar: " + totalCupsofSugar + " Cup(s) of Butter: " + totalCupofButter + " Cups of Flour: " + totalCupsofFlour);
     
     //End the program
     System.exit(0);
   }
   
 }    