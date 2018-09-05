import java.util.Scanner; //Needed for Scanner class 

/*
This program is used to measure an object's mass and weight
*/

public class MassAndWeight
{

   public static void main(String[] args)
   {
   
      double mass; // mass in Kg
      double weight; //weight in Newtons 
      
      Scanner Keyboard = new Scanner(System.in);
      
      System.out.println("Please enter the object's mass ");
      mass = Keyboard.nextDouble();
      
      weight = mass * 9.8; 
      
      if (weight > 1000)
         System.out.print("The object is too heavy");
         
      else if (weight < 10) 
         System.out.print("The object is too light");
      
      else 
         System.out.print("Weight of object is " + weight + "N.");
   }

}