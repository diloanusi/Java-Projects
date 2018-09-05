import javax.swing.JOptionPane;
public class DemoSavingsAccount
{
   public static void main(String[] args)
   {  
      double annualInterest, balance;
      int months;
      
      //ask user for input 
      String input1, input2, input3;
      input1 = JOptionPane.showInputDialog("Enter Annual Interest Rate: ");
      annualInterest = Double.parseDouble(input1);
      input2 = JOptionPane.showInputDialog("Enter starting balance: ");
      balance = Double.parseDouble(input2);
      input3 = JOptionPane.showInputDialog("Enter months account has been opened:");
      months = Integer.parseInt(input3);
      
      /*int i = 1;
      int count1 = i;
      int count2 = i;*/
      String input4, input5, input6;
      double monthlyInterest;
      double deposit, withdrawal;
      SavingsAccount account = new SavingsAccount(balance);
      
      for(int i = 1; i <= months; i++)
      {
         input4 = JOptionPane.showInputDialog("How much have you deposited: ");
         deposit = Double.parseDouble(input4);
         account.deposit();
         
         int count1 = i - 1;
         count1++;
         
         JOptionPane.showMessageDialog(null,"You deposited this many times: " + count1);

         //i++;
         //account.monthlyInterest();
         /*while(deposit > 0)
         {   
            count1 += i;
         }*/
      }
      
      for(int i = 1; i <= months; i++)
      {   
         input5 = JOptionPane.showInputDialog("How much have you withdrawn: ");
         withdrawal = Double.parseDouble(input5);
         account.withdrawal();
         
         int count2 = i - 1;
         count2++;
         JOptionPane.showMessageDialog(null,"You withdrew this many times: " + count2);
         //i++;
         //account.monthlyInterest();
         /*while(withdrawal > 0)
            count2 += i;*/     
      }
      
      
      JOptionPane.showMessageDialog(null, "Final Balance: " + account.getBalance() + "\n" +
                                          "Total Interest: " + account.getMonthlyInterest());
                                          
    System.exit(0);
   }
}   