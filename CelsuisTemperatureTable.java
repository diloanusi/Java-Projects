public class CelsuisTemperatureTable
{
   public static void main(String[] args)
   {
      System.out.println("Fahrenheit\tCelsius");
      System.out.println("===================");
      
      for (int F = 0; F<= 20; F++)
      {
         System.out.printf("%2d \t\t %6.1f\n", F, celsuis(F)); 
      }
   }
   public static double celsuis(double F)
   {
      return ((5.0/9.0)*(F-32));
   }
}