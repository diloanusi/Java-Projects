//This program demostrates using dialogs with JOptionPane 

import javax.swing.JOptionPane;

public class CookieCalories
{

  public static void main (String[] args)
  {
     String inputString; //For reading input
     final int COOKIES_PER_BAG = 40;
     final int SERVINGS_PER_BAG = 10;
     final int CALORIES_PER_BAG = 300;
     
     final int COOKIES_PER_SERVING = COOKIES_PER_BAG / SERVINGS_PER_BAG;
     final int CALORIES_PER_COOKIE = CALORIES_PER_SERVING / COOKIES_PER_SERVING;
     
     int cookiesEaten;
     int totalCalories;
     inputString = JOptionPane.showInputDialog("How many cookies " + "did you eat? ");
     
     cookiesEaten = Integer.parseInt(inputString);
     totalCalories = cookiesEaten * CALORIES_PER_COOKIE;
     
     //Display results 
     JOptionPane.showMessageDialog(null, "Hello " + "YOur total calories consumed is " + totalCalories);
     
     //End the program
     System.exit(0)
  }
  
}