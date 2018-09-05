import javax.swing.JOptionPane;


/* 
This program prompts the user to enter the speed and time a car travels. 
Calculates the distance traveled and display distance travelled for each hour 
*/
public class DistanceTraveled 
{

   public static void main(String[] args) 
   {
      
      int speed; // miles per hour 
      String inputString = JOptionPane.showInputDialog("Enter speed of car: ");
      speed = Integer.parseInt(inputString);
      
      while (speed < 0) //speed cannot be less than zero
      {
         inputString = JOptionPane.showInputDialog("Please enter a valid speed. " + "Enter speed of car: ");
         speed = Integer.parseInt(inputString);
      }
      
      int time; //Hours  
      inputString = JOptionPane.showInputDialog("Enter the number of hours traveled: ");
      time = Integer.parseInt(inputString);
      
      while (time < 1) //time cannot be less than 1 
      {
         inputString = JOptionPane.showInputDialog("Please enter a valid time. " + "Enter the number of hours traveled: ");
         time = Integer.parseInt(inputString);
      }
      
      System.out.println("Hour Distance Traveled");
      System.out.println("-----------------------");
      
      int distance = speed * time;
      int y = speed;
      //y <= distance;
      
      for (int x = 1; x <= time; x++)
      {
         System.out.println(x + "\t\t\t" + y);
         y+= speed;
      }
      
      
      System.exit(0);
   }
}      