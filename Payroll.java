//Dabeluchukwu 

public class Payroll 
{  
   private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
   private final int EMPLOYEES = employeeId.length;
   private int[] hours = new int[EMPLOYEES];
   private double[] payRate = new double[EMPLOYEES];
   private double[] wages = new double[EMPLOYEES];
   
   //Method to accept the argument stored in employeeId field 
   public void setEmployeeID(int index, int employeeId)
   {
      this.employeeId[index] = employeeId;
   }
   
   public void setHours(int index, int hours)
   {
      this.hours[index] = hours;
   }
   
   public void setPayRate(int index, double payRate)
   {
      this.payRate[index] = payRate;
   }
   
  /* public void setWages(int index, double wages)
   {
      this.wages[index] = wages;
   }
      */
   public int getEmployeeID(int index)
   {
      return employeeId[index];
   }

   //returns the hours field
   public int getHours(int index)
   {
      return hours[index];
   }
   
   public double getPayRate(int index)
   {
      return payRate[index];
   }
   
   public double getWages(int index)
   {
      return wages[index];
   }

   //accept employeeId as argument to return gross pay
   public void GrossPay()
   {
      //double wages = 0;
      
      for(int index = 0; index < 7; index++)
      {
         wages[index] = hours[index] * payRate[index];
      }
      
      //return wages;
   }

}