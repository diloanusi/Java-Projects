
import javax.swing.JOptionPane;

public class AreaRectangle
{
   public static void main(String[] args)
   {
      double length, width, area; 
      length = getLength(); //Get rectangle's length from the user 
      width = getWidth(); //Get rectangle's width from the user 
      area = getArea(length, width); //Get rectangle's area
      
      displayData(length, width, area); //Display the rectangle data 
      System.exit(0);
   }
   public static double getLength()
   {
      String input = JOptionPane.showInputDialog("Please enter the length of the rectangle");
      double length = Double.parseDouble(input);
      return length; 
   }
   public static double getWidth()
   {
      String input = JOptionPane.showInputDialog("Please enter the width of the rectangle");
      double width = Double.parseDouble(input);
      return width;
   }
   public static double getArea(double length, double width)
   {
      double area = length * width;
      return area;
   }
   public static void displayData(double length, double width, double area)
   {
      JOptionPane.showMessageDialog(null, "The length of the rectangle is: " + length  +
                                    ", the width is: " + width + " and the area is: " + area);
   }
}