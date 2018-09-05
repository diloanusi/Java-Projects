import javax.swing.JOptionPane;
public class DemoTemperature
{
   public static void main(String[] args)
   {  
      double ftemp;
      
      //ask user for input 
      String input;
      input = JOptionPane.showInputDialog("Enter Radius:");
      ftemp = Double.parseDouble(input);
       
      Temperature weather = new Temperature(ftemp);
      
      
      JOptionPane.showMessageDialog(null, "Fahrenheit: " + weather.getFahrenheit() + "\n" +
                                          "Celsius: " + weather.getCelsius() + "\n" +
                                          "Kelvin: " + weather.getKelvin());
                                         
                                          
    System.exit(0);
   }
}   