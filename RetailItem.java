
public class RetailItem
{
   //Fields 
   private String description;
   private int unitsOnHand;
   private double price;
   
   //Constructor 
   public RetailItem(String des, int onHand, double p)
   {
      description = des;
      unitsOnHand = onHand;
      price = p;
   }
   
   public void setDescription(String des)
   {
      description = des; 
   }
   
   public void setUnitsOnHand(int onHand)
   {
      unitsOnHand = onHand;
   }
   
   public void setPrice(double p)
   {
      price = p;
   }
   
   public String getDescription()
   {
      return description;
   }
   
   public int getUnitsOnHand()
   {
      return unitsOnHand;
   }
    
   public double getPrice()
   {
      return price;
   } 
   
  /* public static void main(String[] args)
   {
      //Create item1 info 
      RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
      
      //Create item2 info
      RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
      
      //Create item3 info
      RetailItem item3 = new RetailItem("Shirt", 20, 24.95);   
      
   }  */   
}