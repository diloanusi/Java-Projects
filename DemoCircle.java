import javax.swing.JOptionPane;
public class DemoCircle
{
   public static void main(String[] args)
   {  
      double radius;
      
      //ask user for input 
      String input;
      input = JOptionPane.showInputDialog("Enter Radius:");
      radius = Double.parseDouble(input);
     
      while(radius < 0)
      {
        input = JOptionPane.showInputDialog("Please enter a valid radius:");
        radius = Double.parseDouble(input);
      }
       
      Circle round = new Circle(radius);
      
      
      JOptionPane.showMessageDialog(null, "Radius: " + round.getRadius() + "\n" +
                                          "Area: " + round.getArea() + "\n" +
                                          "Diameter: " + round.getDiameter() + "\n" +
                                          "Circumference: " + round.getCircumference());
                                          
    System.exit(0);
   }
}   