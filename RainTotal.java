//Iloanusi, Dabeluchukwu

import java.util.Scanner;
import javax.swing.JOptionPane;
public class RainTotal
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      final int MONTHS = 12;
      double[] rainfall = new double[MONTHS];
      getValues(rainfall);
      Rainfall year = new Rainfall(rainfall);
      JOptionPane.showMessageDialog(null,
         String.format("The total rainfall was %,.2f\n" + 
                       "The average rainfall was %,.2f\n" +
                       "The highest rainfall was %,.2f\n" +
                       "The lowest rainfall was %,.2f\n",
                       year.getTotal(), year.getAverage(), year.getHighest(), year.getLowest()));
                       
      System.exit(0);                     
   }
      
   private static void getValues(double[] array)  
   {
      String input;//To hold the users input 
      
      //Get sales for each month of the year 
      for(int i = 0; i < array.length; i++)
      {
         input = JOptionPane.showInputDialog("Enter rainfall for month " + (i + 1) + ".");
         array[i] = Double.parseDouble(input);
      }
   }
}