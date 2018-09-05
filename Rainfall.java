
public class Rainfall 
{
   private double[] rainfall;
   
   public Rainfall(double[] r)
   {
      //create an array as large as r 
      rainfall = new double[r.length];
      
      //copy the element from r to rainfall 
      for(int index = 0; index < r.length; index++)
         rainfall[index] = r[index];
   }
   
   public double getTotal()
   {
      double total = 0.0; //Accumulator 
      
      for(int index = 0; index < rainfall.length; index++)
         total += rainfall[index];
      return total;
   }
   
   public double getAverage()
   {
      return getTotal()/rainfall.length;
   }
   
   public double getHighest()
   {
      double highest = rainfall[0];
      
      for(int index = 1; index < rainfall.length; index++)
      {
         if(rainfall[index] > highest)
            highest = rainfall[index];
      }
      return highest;
   }
   
   public double getLowest()
   {
      double lowest = rainfall[0];
      
      for(int index = 1; index < rainfall.length; index++)
      {
         if(rainfall[index] < lowest)
            lowest = rainfall[index];
      }
      return lowest;
   }

}