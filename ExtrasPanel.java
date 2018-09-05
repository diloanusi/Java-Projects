//ExtrasPane1 - Ch12, #6 Joe's Automotive, p.847
import java.awt.*;
import javax.swing.*;

public class ExtrasPanel extends JPanel
{
   //named constants 
   private final double HOUR_RATE = 20.0;
   //JTextField, p.771
   private JTextField parts; 
   private JTextField hours;
   
   //Constructor
   public ExtrasPanel()
   {
      //JLabel, p.771
      JLabel partsTxt = new JLabel("Parts Charges:");
      JLabel hoursTxt = new JLabel("Hours of Labor:");
      parts = new JTextField(10);
      hours = new JTextField(10);
      
      //initialize text fields to zero
      parts.setText("0");
      hours.setText("0");
      
      //set Layout
      setLayout(new GridLayout(2,2));
      setBorder(BorderFactory.createTitledBorder("Extras"));
      add(partsTxt);
      add(parts);
      add(hoursTxt);
      add(hours);
   }
   
   //getCharges calculate extra charges
   public double getCharges()
   {
      double charges = Double.parseDouble(parts.getText()) + (Double.parseDouble(hours.getText()) * HOUR_RATE);
      
      return charges;
   }
}