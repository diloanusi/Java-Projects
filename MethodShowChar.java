/* Write a method named showChar. The method should accept two arguments:
a reference to a string object and an integer. The integer argument is a character positon within the string,
with the first character being at postion 0. When the method executes, it should display the character at that 
character positon. Here is an example of a call to method: showChar("New York", 2);
In this call, the method wull display the character 'w' because it is in positon 2. 
Demonstrate the method in a complete program
*/
import java.util.*; //used for keyboard
 
public class MethodShowChar
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      //user city and desired character postion 
      System.out.print("Please enter a city: ");
      String city = keyboard.nextLine();
      System.out.print("Enter desired charcater positon: ");
      int charPos = keyboard.nextInt();
      showChar(city, charPos);
   }  
   
   public static void showChar(String city, int pos)
   {
      char x = city.charAt(pos);
      System.out.println("in " + city + ", the character position: " + pos + " is: " + x);
   }  
}