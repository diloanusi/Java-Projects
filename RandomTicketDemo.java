// Dabeluchukwu 

import javax.swing.JOptionPane;
import java.util.Scanner; 
import java.util.Random; 

public class RandomTicketDemo
{
   public static main(String[] args)
   {
      int[] showTime1, showTime2, showTime3, showTime4;
      String input;
      
      //Generate a random number. This number will be how many seats available 
      Random randomTimes = new Random();
      showTime1 = randomTimes.nextint(51); //Any random number from 0 - 50
      showTime2 = randomTimes.nextint(51);
      showTime3 = randomTimes.nextint(51);
      showTime4 = randomTimes.nextint(51); 
      
      //Since showTime1 is an array, we need to loop through it to get an actually number of space 
      for(int i = 0; i < showTime1.length; i++)
         int number1 = i;
      
      for(int i = 0; i < showTime2.length; i++)
         int number2 = i;
         
      for(int i = 0; i < showTime3.length; i++)
         int number3 = i;
      
      for(int i = 0; i < showTime4.length; i++)
         int number4 = i;          
      
      //Display showtime and seats for user to pick from 
      input = JOptionPane.showInputMessage("These are the seats available for each showtime" + "\n"
                                           "1:20pm - " + number1 + " seats available." + "\n"
                                           "3:40pm - " + number2 + " seats available." + "\n"
                                           "6:00pm - " + number3 + " seats available." + "\n" 
                                           "8:20pm - " + number4 + " seats available." + "\n"
                                           "Select a showtime."); 
      
      //make sure input is valid 
      while(input != "1:20pm" || input != "3:40pm" || input != "6:00pm" || input != "8:20pm")
      {
        input = JOptionPane.showInputMessage("Please select a valid showtime" + "\n"
                                             "1:20pm - " + number1 + " tickets available." + "\n"
                                             "3:40pm - " + number2 + " tickets available." + "\n"
                                             "6:00pm - " + number3 + " tickets available." + "\n" 
                                             "8:20pm - " + number4 + " tickets available." + "\n"
                                             "Select a showtime.");       
      } //end of validility loop 
      
      //ask user for the number of tickets they need
      String input1, input2, input3, input4;
      int numOfTickets1, numOfTickets2, numOfTickets3, numOfTickets4;
       
      if(input == "1:20pm" && number1 != 0)
      {
        input1 = JOptionPane.showInputMessage("There are " + number1 + " tickets available" + "\n"
                                              "How many tickets do you want? ");
        numOfTickets1 = Integer.parseInt(input1);                                        
                                                       
      }
      
      else if(input == "3:40pm" && number2 != 0)
      {
         input2 = JOptionPane.showInputMessage("There are " + number2 + " tickets available" + "\n"
                                              "How many tickets do you want? ");
         numOfTickets2 = Integer.parseInt(input2);
      }
      
      else if (input == "6:00pm" && number3 != 0)
      {
        input3 = JOptionPane.showInputMessage("There are " + number3 + " tickets available" + "\n"
                                              "How many tickets do you want? ");
        numOfTickets3 = Integer.parseInt(input3); 
      }
      
      else if (input == "8:20" && number4 != 0)
      {
        input4 = JOptionPane.showInputMessage("There are " + number4 + " tickets available" + "\n"
                                              "How many tickets do you want? ");
        numOfTickets4 = Integer.parseInt(input4); 
      }
                                                                         
   }
}