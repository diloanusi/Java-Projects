import javax.swing.JOptionPane;

/* 
This program prompts the user to enter the medium and distance sound travels
and then calculate the time it takes
*/
public class SpeedofSound 
{

   public static void main(String[] args) 
   {
      
      String medium; 
      String inputString = JOptionPane.showInputDialog("Enter the medium (air, water, steel)" +
                                                                " that sound travels through: ");
      medium = inputString;
      
      int distance; //in feet
      inputString = JOptionPane.showInputDialog("Enter the distance travelled: ");
      distance = Integer.parseInt(inputString);
      
      int time; //in seconds 
      
      if (medium.equalsIgnoreCase("Air"))
      {
            time = distance/1100; 
            JOptionPane.showMessageDialog(null, "Time it takes for sound to travel " + distance + " through air is " + time + " second(s)");
      }
           
      else if (medium.equalsIgnoreCase("Water"))
      {      
            time = distance/4900;
            JOptionPane.showMessageDialog(null, "Time it takes for sound to travel " + distance + " through water is " + time + " second(s)");
      }
            
      else if (medium.equalsIgnoreCase("Steel"))
      {
            time = distance/16400;
            JOptionPane.showMessageDialog(null, "Time it takes for sound to travel " + distance + " through steel is " + time + " second(s)");
      }
      else
        JOptionPane.showMessageDialog(null, "Please enter a valid medium");

      System.exit(0);
    
    }
    
}      