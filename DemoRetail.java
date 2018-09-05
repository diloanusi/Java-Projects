
public class DemoRetail
{
   public static void main(String[] args)
   {
      //Create item1 info 
      RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
      
      
      //Create item2 info
      RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
      
      //Create item3 info
      RetailItem item3 = new RetailItem("Shirt", 20, 24.95);   
        
      System.out.println("\t\t\t" + "Description |" + " UnitsonHand |" + " Price |");
      System.out.println("Item #1 |  " + item1.getDescription() + "\t\t| " + item1.getUnitsOnHand() + "\t\t\t| " + item1.getPrice() + "\t\t| ");
      System.out.println("Item #2 |  " + item2.getDescription() + "| " + item2.getUnitsOnHand() + "\t\t\t| " + item2.getPrice() + "\t\t| ");
      System.out.println("Item #3 |  " + item3.getDescription() + "\t\t| " + item3.getUnitsOnHand() + "\t\t\t| " + item3.getPrice() + "\t\t| "); 
   }
}