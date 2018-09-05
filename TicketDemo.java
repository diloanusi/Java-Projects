//Dabeluhcukwu

//This is the revised version of main. The program earlier was having issues.
//This program asks for how many tickets user wants for each showtime and shows how many ticket is left 
//if ticket is empty user has the option to choose a different showtime to check if tickets are available 
//If theres no more ticket for everyshowtime user chooses the option that ends the program 


import java.util.Scanner; //Call the scanner method 
import java.io.*;

public class TicketDemo
{
   public static void main(String[] args)
   {  
      Tickets ticket = new Tickets();
      int option;
      int numLeft1, numLeft2, numLeft3, numLeft4;
      int numBought1, numBought2, numBought3, numBought4; 
      
      do 
      {
         //Display the menu and ask the user to select a movie time  
         ticket.menu();
         
         Scanner keyboard = new Scanner(System.in);
         option = keyboard.nextInt();

         //make sure the user makes a valid choice 
         while(option < 1 || option > 6)
         {  
            option = keyboard.nextInt();
         }
         
         //Option to choose from 
         switch(option)
         {
            case 1: 
              //Ask user how many tickets they want
              System.out.println("How many tickets do you want?");
              System.out.println();
              Scanner keyboard1 = new Scanner(System.in);
              int numTickets1 = keyboard1.nextInt();
              
              //Display how many tickets available
              
              //ask the user for how many tickets they want
              ticket.setTickets1(numTickets1);
              
              //Display what you have so far 
              System.out.println("You chose 1:30Pm showtime and " + " chose " + ticket.getTickets1() + " tickets");
              
              //Calculate how many tickets left and bought 
              numLeft1 = ticket.calculateSeats1(numTickets1);
              numBought1 = ticket.getTickets1();
              
              //Display remaining tickets and ask user if they want more 
              System.out.println("There are " + numLeft1 + " tickets left, " + "do you want more?");
              
              int option1;
              
              do
              {   
                 //Yes or no
                 ticket.menu2();
                 
                 Scanner keyOption1 = new Scanner(System.in);
                 option1 = keyOption1.nextInt();
                 
                 while(option1 < 1 || option1 > 2)
                {  
                  option1 = keyboard1.nextInt();
                }

              
                 switch(option1)
                 {
                   case 1:
                     int selection1;
                     Scanner selection5 = new Scanner(System.in); 
                     System.out.println("How many tickets do want? ");
                     System.out.println();
                     selection1 = selection5.nextInt();
                     ticket.setTickets1(selection1);
                     numBought1 += selection1;
                     numLeft1 -= selection1;
                     System.out.println("There are " + numLeft1 + " tickets left, " + "do you want more?");
                     System.out.println();
                      break;
                      
                   case 2: 
                     System.out.println("Enjoy your movie");
                     System.out.println();
                      break;
                 }
                 
               }while(option1 != 2);

               break;
               
            case 2: 
              //Ask user how many tickets they want
              System.out.println("How many tickets do you want?");
              System.out.println();
              Scanner keyboard2 = new Scanner(System.in);
              int numTickets2 = keyboard2.nextInt();
              
              //Display how many tickets available
              
              //ask the user for how many tickets they want
              ticket.setTickets2(numTickets2);
              
              //Display what you have so far 
              System.out.println("You chose 1:30Pm showtime and " + " chose " + ticket.getTickets2() + " tickets");
              
              //Calculate how many tickets left and BOught
              numLeft2 = ticket.calculateSeats2(numTickets2);
              numBought2 = ticket.getTickets2();
              
              //Display remaining tickets and ask user if they want more 
              System.out.println("There are " + numLeft2 + " tickets left, " + "do you want more?");
              System.out.println();
              int option2;
              
              do
              {   
                 //Yes or no
                 ticket.menu2();
                 
                 Scanner keyOption2 = new Scanner(System.in);
                 option2 = keyOption2.nextInt();
                 
                 while(option2 < 1 || option2 > 2)
                {  
                  option2 = keyboard2.nextInt();
                }

              
                 switch(option2)
                 {
                   case 1:
                     int selection2;
                     Scanner selection6 = new Scanner(System.in); 
                     System.out.println("How many tickets do want? ");
                     System.out.println();
                     selection2 = selection6.nextInt();
                     ticket.setTickets2(selection2);
                     numBought2 += selection2;
                     numLeft2 -= selection2;
                     System.out.println("There are " + numLeft2 + " tickets left, " + "do you want more?");
                     System.out.println();
                      break;
                      
                   case 2: 
                     System.out.println("Enjoy your movie");
                     System.out.println();
                      break;
                 }
                 
               }while(option2 != 2);
              break;
              
             case 3: 
              //Ask user how many tickets they want
              System.out.println("How many tickets do you want?");
              System.out.println();
              Scanner keyboard3 = new Scanner(System.in);
              int numTickets3 = keyboard3.nextInt();
              
              //Display how many tickets available
              
              //ask the user for how many tickets they want
              ticket.setTickets3(numTickets3);
              
              //Display what you have so far 
              System.out.println("You chose 1:30Pm showtime and " + " chose " + ticket.getTickets3() + " tickets");
              
              //Calculate how many tickets left and how many bought 
              numLeft3 = ticket.calculateSeats3(numTickets3);
              numBought3 = ticket.getTickets3();
              
              //Display remaining tickets and ask user if they want more 
              System.out.println("There are " + numLeft3 + " tickets left, " + "do you want more?");
              
              int option3;
              
              do
              {   
                 //Yes or no
                 ticket.menu2();
                 
                 Scanner keyOption3 = new Scanner(System.in);
                 option3 = keyOption3.nextInt();
                 
                 while(option3 < 1 || option3 > 2)
                {  
                  option3 = keyboard.nextInt();
                }

              
                 switch(option3)
                 {
                   case 1:
                     int selection3;
                     Scanner selection7 = new Scanner(System.in); 
                     System.out.println("How many tickets do want? ");
                     System.out.println();
                     selection3 = selection7.nextInt();
                     ticket.setTickets3(selection3);
                     numBought3 += selection3;
                     numLeft3 -= selection3;
                     System.out.println("There are " + numLeft3 + " tickets left, " + "do you want more?");
                     System.out.println();
                      break;
                   case 2: 
                     System.out.println("Enjoy your movie");
                     System.out.println();
                      break;
                 }
                 
               }while(option3 != 2); 
                      
              break;
              
            case 4: 
              //Ask user how many tickets they want
              System.out.println("How many tickets do you want?");
              System.out.println();
              Scanner keyboard4 = new Scanner(System.in);
              int numTickets4 = keyboard4.nextInt();
              
              //Display how many tickets available
              
              //ask the user for how many tickets they want
              ticket.setTickets4(numTickets4);
              
              //Display what you have so far 
              System.out.println("You chose 1:30Pm showtime and " + " chose " + ticket.getTickets4() + " tickets");
              
              //Calculate how many tickets left 
              numLeft4 = ticket.calculateSeats4(numTickets4);
              numBought4 = ticket.getTickets4();
              
              //Display remaining tickets and ask user if they want more 
              System.out.println("There are " + numLeft4 + " tickets left, " + "do you want more?");
              Scanner keyOption = new Scanner(System.in);
              int option4 = keyOption.nextInt();
              
              do
              {
                 switch(option4)
                 {
                   case 1:
                     int selection4;
                     Scanner selection8 = new Scanner(System.in); 
                     System.out.println("How many tickets do want? ");
                     System.out.println();
                     selection4 = selection8.nextInt();
                     ticket.setTickets4(selection4);
                     numBought4 += selection4;
                     numLeft4 -= selection4;
                     System.out.println("There are " + numLeft4 + " tickets left, " + "do you want more?");
                     System.out.println();
                      break;
                      
                   case 2: 
                     System.out.println("Enjoy your movie");
                     System.out.println();
                      break;
                 }
                 
              }while(option4 != 2);  
              
               break;
               
            case 5: System.out.println("Thank you and enjoy your movie!");
               break;
               
            case 6: System.out.println("Sorry we're sold out");
               break;         
         }
                  
      }while (option != 5 && option != 6);
      
    /*  //Report the whole Data to a file 
      FileWriter fw = new FileWriter("TicketFile.txt");
      PrintWriter outputFile = new PrintWriter(fw);
      outputFile.println("Showtime | Tickets Remaining | Tickets Bought");
      outputFile.println("---------------------------------------------");
      
      outputFile.println("1:20PM" + "\t\t" + numLeft1 + "\t\t" + numBought1);
      outputFile.println("3:40PM" + "\t\t" + numLeft2 + "\t\t" + numBought2);
      outputFile.println("6:00PM" + "\t\t" + numLeft3 + "\t\t" + numBought3);
      outputFile.println("8:20PM" + "\t\t" + numLeft4 + "\t\t" + numBought4);
      outputFile.close();
      System.out.println("Data written to file 'TicketFileFile.txt' "); */ //Still Trying to figure out why it says variables in file are not initialized
   }
}   