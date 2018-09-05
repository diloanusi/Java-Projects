//Iloanusi, Dabeluchukwu 

public class SavingsAccount
{
   //Fields 
   private double balance;
   private double annualInterest;
   private double withdrawal;
   private double deposit;
   private double monthlyInterest; 
   
   //Constructor 
   public SavingsAccount(double b)
   {
      balance = b; //starting balance 
   }
   
   public void withdrawal()
   {
      balance -= withdrawal;
   }
   
   public void deposit()
   {
      balance += deposit; 
   }
      
   public double getMonthlyInterest()
   {
      return (annualInterest/12.0);
   }
   
   public void monthlyInterest()
   {
      balance = (balance * monthlyInterest) + balance;
   }
   
   public double getBalance()
   {
      return balance;
   }
   public double getTotalInterest()
   {
      return balance * monthlyInterest;
   }
 
}