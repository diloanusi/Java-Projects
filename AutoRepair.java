//Dabeluchukwu 

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AutoRepair extends JFrame
{
   private ServicePanel services;
   private ExtrasPanel extras;
   private JPanel buttons;
   private JButton calcButton;
   private JButton exitButton; 
   
   private final int WINDOW_WIDTH = 310;
   private final int WINDOW_HEIGHT = 1200;
   
   //Constructor - Ref: ln 22, p. 833
   public AutoRepair()
   {
      setTitle("Auto Repair");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      
      //create custom panels 
      services = new ServicePanel();
      extras = new ExtrasPanel();
      buildButtonPanel();
      
      //add components to content pane - Ref. ln 45, p.833
      add(services, BorderLayout.NORTH);
      add(extras, BorderLayout.CENTER);
      add(buttons, BorderLayout.SOUTH);
      
      //pack contents & display - Ref. ln 52, p.833
      pack();
      setVisible(true);
   }
   
   private void buildButtonPanel()
   {
      //create panel for buttons - Ref. ln 63, p.833
      buttons = new JPanel();
      //create buttons 
      calcButton = new JButton("Calculate Charges");
      exitButton = new JButton("Exit");
      //register action listeners
      calcButton.addActionListener(new CalcButtonListener());
      exitButton.addActionListener(new ExitButtonListener());
      //Add buttons to button panel
      buttons.add(calcButton);
      buttons.add(exitButton); 
   }
   
   private class CalcButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         double totalCharges; 
         totalCharges = services.getCharges() + extras.getCharges();
         JOptionPane.showMessageDialog(null, String.format("Total Charges: $%.2f", totalCharges)); 
      }
   }
   
   private class ExitButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   }
   
   public static void main(String[] args)
   {
      AutoRepair ar = new AutoRepair();
   }
}