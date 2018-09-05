import javax.swing.JOptionPane; 
public class Conversion
{
   public static void main(String args[])
   {
      String input;
      double distance; //meters
      int option;
      
      input = JOptionPane.showInputDialog("Enter a Distance: ");
      distance = Double.parseDouble(input);
      
      do 
      {
         //Display the menu and ask the user to select an option 
         menu();
         input = JOptionPane.showInputDialog("Retype your option option");
         option = Integer.parseInt(input);
         
         //make sure the user makes a valid choice 
         while(option < 1 || option > 4)
         {
            input = JOptionPane.showInputDialog("Please choose a valid option:");
            option = Integer.parseInt(input);
         }
         
         //Option to choose from 
         switch(option)
         {
            case 1: JOptionPane.showMessageDialog(null, showKilometer(distance));
               break;
            case 2: JOptionPane.showMessageDialog(null, showInches(distance));
               break;
            case 3: JOptionPane.showMessageDialog(null, showFeet(distance));
               break;
            case 4: JOptionPane.showMessageDialog(null, "This is the end of the program");
               break;   
         }
         
      }while (option != 4);
      
   }
   
   public static double showKilometer(double distance)
   {
      return(distance * 0.001);
   }
   
   public static double showInches(double distance)
   {
      return(distance * 39.37);
   }
   
   public static double showFeet(double distance)
   {
      return(distance * 3.281);
   }
   
   public static void menu()
   {
      JOptionPane.showInputDialog("Choose an option below:\n" +
                                    "1. Convert to kilometers\n" + 
                                    "2. Convert to Inches\n" +
                                    "3. Convert to Feet\n" +
                                    "4. Quit program");
   }
 
}