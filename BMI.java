import javax.swing.JOptionPane;

/* 
This program prompts the user to enter their wieght and height 
Then it calculates the body mass index and tells them if they are overweight, underweight or optimal 
*/
public class BMI
{

   public static void main(String[] args)
   {
   
      double height; // in inches 
      double weight; // in pounds 
      double bmi; //body mass index 
      String input; 
      
      input = JOptionPane.showInputDialog("Enter your height: ");
      height = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("Enter your weight: ");
      weight = Double.parseDouble(input);
      
      bmi = (weight * 703)/(height*height);
      
      // <18.5 = underweight; 18.5 to 25 = optimal; > 25 = overweight 
      
      if (bmi < 18.5)
         System.out.println("You're underweight");
         
      else if (bmi > 25)
         System.out.println("You're overweight");
      
      else
         System.out.println("You're optimal");
         
     
     
      System.exit(0);
   
   }

}