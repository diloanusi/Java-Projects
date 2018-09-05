public class Temperature
{
   //Fields 
   private double ftemp;
      
   //Constructor 
   public Temperature(double F)
   {
      ftemp = F;
   }
   
   public void setFahrenheit(double F)
   {
      ftemp = F;
   }
   
   public double getFahrenheit()
   {
      return ftemp;
   }
    
   public double getCelsius()
   {
      return ((5.0/9.0) * (ftemp - 32.0));
   } 
   
   public double getKelvin()
   {
      return (((5.0/9.0) * (ftemp - 32.0)) + 273.0);
   }
      
}