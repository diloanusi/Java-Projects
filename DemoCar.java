
public class DemoCar
{
   public static void main(String[] args)
   {
      Car jeep = new Car(2015, "Wrangler");
      
      System.out.println("Car is accelerating");
      for(int x = 1; x < 6; x++)
      {
         jeep.accelerate();
         System.out.println("Current Speed: " + jeep.getSpeed());
      }
      
      System.out.println("Car is braking");
      for(int x = 1; x < 6; x++)
      {
         jeep.brake();
         System.out.println("Current Speed: " + jeep.getSpeed());
      }
   }   
}