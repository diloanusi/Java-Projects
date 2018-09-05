import javax.swing.JOptionPane;
import java.io.*; //To use the PrintWriter class

/* 
This program prompts the user to enter the speed and time a car travels. 
Calculates the distance traveled and display distance travelled for each hour
Then writes it in a file  
*/
public class DistanceFile
{

   public static void main(String[] args) throws IOException 
   {
      
      int speed; // miles per hour
      String inputString = JOptionPane.showInputDialog("Enter speed of car: ");
      speed = Integer.parseInt(inputString);
      
      int time; //Hours  
      inputString = JOptionPane.showInputDialog("Enter the number of hours traveled: ");
      time = Integer.parseInt(inputString);
      
      FileWriter fw = new FileWriter("DistanceTraveledFile.txt");
      PrintWriter outputFile = new PrintWriter(fw);
      outputFile.println("Hour  Distance Traveled");
      outputFile.println("-----------------------");
      
      int distance = speed * time;
      int y = speed;
      
      for (int x = 1; x <= time; x++)
      {
         outputFile.println(x + "\t\t" + y);
         y+= speed;
      }
      
      
      outputFile.close();
      System.out.println("Data written to file 'DistanceTraveledFile.txt' ");
   }
}      