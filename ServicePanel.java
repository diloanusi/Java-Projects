//Dabeluchukwu 

//ServicePanel - ch12, #6 Joe's Automotive, p.847
import java.awt.*;
import javax.swing.*;

public class ServicePanel extends JPanel 
{
   //named constants 
   private final double OIL_CHANGE = 26.00;
   private final double LUBE_JOB = 18.00;
   private final double RADIATOR_FLUSH = 30.00;
   private final double TRANSMISSION_FLUSH = 80.00;
   private final double INSPECTION = 15.00;
   private final double MUFFLER_REPLACEMENT = 100.00;
   private final double TIRE_ROTATION = 20.00;
   
   private JCheckBox oilChange;
   private JCheckBox lubeJob;
   private JCheckBox radiatorFlush;
   private JCheckBox transmissionFlush;
   private JCheckBox inspection;
   private JCheckBox mufflerReplacement;
   private JCheckBox tireRotation;
   
   //constructor
   public ServicePanel()
   {
      //create checkboxes
      oilChange = new JCheckBox(String.format("Oil Change ($%.2f)", OIL_CHANGE));
      lubeJob = new JCheckBox(String.format("Lube Job ($%.2f)", LUBE_JOB));
      radiatorFlush = new JCheckBox(String.format("Radiator Flush ($%.2f)", RADIATOR_FLUSH));
      transmissionFlush = new JCheckBox(String.format("Transmission Flush ($%.2f)", TRANSMISSION_FLUSH));
      inspection = new JCheckBox(String.format("Inspection ($%.2f)", INSPECTION));
      mufflerReplacement = new JCheckBox(String.format("Muffler Replacement ($%.2f)", MUFFLER_REPLACEMENT));
      tireRotation = new JCheckBox(String.format("Tire Rotation ($%.2f)", TIRE_ROTATION));
      
      //set layout 
      setLayout(new GridLayout(7,1));
      setBorder(BorderFactory.createTitledBorder("Services"));
      
      //add check boxes to panel 
      add(oilChange);
      add(lubeJob);
      add(radiatorFlush);
      add(transmissionFlush);
      add(inspection);
      add(mufflerReplacement);
      add(tireRotation);
   } 
   
   //getCharges calculate service charges 
   public double getCharges()
   {
      double charges = 0;
      if(oilChange.isSelected())
         charges += OIL_CHANGE;
      if(lubeJob.isSelected())
         charges += LUBE_JOB;
      if(radiatorFlush.isSelected())
         charges += RADIATOR_FLUSH;
      if(transmissionFlush.isSelected())
         charges += TRANSMISSION_FLUSH;
      if(inspection.isSelected())
         charges += INSPECTION;
      if(mufflerReplacement.isSelected())
         charges += MUFFLER_REPLACEMENT;
      if(tireRotation.isSelected())
         charges += TIRE_ROTATION;
         
      return charges;               
   }
}