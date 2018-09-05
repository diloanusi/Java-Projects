/* 
This program displays table of celsius temperature 0 through 20 and their fahrenheit equivalents 
Program must display the table 
*/

public class CelsiustoFahrenheit 
{

   public static void main(String[] args) 
   {
   
      double C; //celsius
            
      System.out.println("Celcius   Fahrenheit");
      System.out.println("--------------------");
      
      for (C = 0; C < 21; C++)
      { 
       
       double F = ((9.0/5.0)*C)+32.0; //fahrenheit
       
       //System.out.println(C + "\t\t\t" + F);
       System.out.printf("%.1f \t\t\t %.1f\n",C,F);
      }    
         
        
      System.exit(0);  
   }
}   