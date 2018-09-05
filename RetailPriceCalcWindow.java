
import javax.swing.*;
import java.awt.event.*;

public class RetailPriceCalcWindow extends JFrame
{
    private JPanel panel; //reference a panel
    private JLabel messageLabel1, messageLabel2; //reference a label
    private JTextField wholesaleTextField; //reference 1st text field
    private JTextField markupTextField; //reference 2nd text field
    private JButton calcButton; //reference button
    private final int WINDOW_WIDTH = 300; //window width
    private final int WINDOW_HEIGHT = 400; //window height
    
    //Constructor
    public  RetailPriceCalcWindow()
    {
        //Set window title
        setTitle("Retail Price Computation");
        //Set window size
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        //Close button
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Build panel and add frame
        buildPanel();
        //Add panel to frame's content pane.
        add(panel);
        //Display window.
        setVisible(true);
    }
 
    //Build panel method adds a label, text field & button to panel
    private void buildPanel()
    {
      
        //Create Label to display wholesale input
        messageLabel1 = new JLabel("Enter a wholesale cost: ");
        //Create Text field 10 characters wide
        wholesaleTextField = new JTextField(10);
        //Create Label to display markup input
        messageLabel2 = new JLabel("Enter markup as a percentage");
        //Create Text field 10 characters wide.
        markupTextField = new JTextField(5);
        //Create Button with caption "Calculate"
        calcButton = new JButton("Calculate");
        //Add action listener to the button
        calcButton.addActionListener(new CalcButtonListener());
        //Create a JPanel object and let the panel
        
        //field reference it.
        panel = new JPanel();
        //Add the label, text field & button components to panel
        panel.add(messageLabel1);
        panel.add(wholesaleTextField);
        panel.add(messageLabel2);
        panel.add(markupTextField);
        panel.add(calcButton);
    }
    
    /**
        CalcButtonListener is an action listener class for
        the Calculate button
    */
    private class CalcButtonListener implements ActionListener 
    {
     /**
         The actionPerformed method executes when the user
         clicks on the Calculate button
     */
      public void actionPerformed(ActionEvent e)
      {
         String input1, input2;
         double retail;
         //Get the text entered by the user into the text field
         input1 = wholesaleTextField.getText();
         input2 = markupTextField.getText();
         //calculate retail.
         retail = ((Double.parseDouble(input1) * (Double.parseDouble(input2)))/50);          
         //Display the result.
         JOptionPane.showMessageDialog(null, "Retail Price is $" + retail + ".");
      }
    }
}
