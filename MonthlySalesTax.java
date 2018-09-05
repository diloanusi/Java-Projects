
import javax.swing.*;
import java.awt.event.*;

public class MonthlySalesTax extends JFrame
{
	private JPanel panel;
	private JLabel messageLabelA;
	private JTextField MonthlySalesTaxTextField;
	private JButton calcButton;
   private final double COUNTY_TAX_RATE = 0.02;
   private final double STATE_TAX_RATE = 0.04;
	private final int WINDOW_WIDTH = 600;
	private final int WINDOW_HEIGHT = 100;

	public MonthlySalesTax()
	{
		setTitle("monthly sales tax");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}

	private void buildPanel()
	{
		messageLabelA = new JLabel("Enter total sales for the month");
		MonthlySalesTaxTextField = new JTextField(10);
		calcButton = new JButton ("Find Retail Price");
		calcButton.addActionListener(new CalcButtonListener());
		panel = new JPanel();
		panel.add(messageLabelA);
		panel.add(MonthlySalesTaxTextField);
		panel.add(calcButton);
	}

	private class CalcButtonListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{
			String input;
         double countyTax, stateTax, totalTax;
         
         input = MonthlySalesTaxTextField.getText();
      
         countyTax = Double.parseDouble(input) * COUNTY_TAX_RATE;
         stateTax = Double.parseDouble(input) * STATE_TAX_RATE;
         totalTax = countyTax + stateTax;
         
         JOptionPane.showMessageDialog(null, "County sales tax: " + countyTax +
               "\nState sales tax: " + stateTax + "\nTotal sales tax: " + totalTax);
         
      }
   }
}