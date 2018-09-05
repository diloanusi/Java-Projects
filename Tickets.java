//Dabeluchukwu 

public class Tickets 
{  
   //Field
   
   //Number of tickets available for each showtime 
   private final int TICKETS = 50;
   private int[] seats1 = new int[TICKETS];
   private int[] seats2 = new int[TICKETS];
   private int[] seats3 = new int[TICKETS];
   private int[] seats4 = new int[TICKETS];
   private int tickets1, tickets2, tickets3, tickets4;
  
   //Display what option one holds 
   public String option1()
   {
      return "You chose 1:20PM showtime";  
   } 
   
   //Display what option two holds
   public String option2()
   {
      return "You chose 3:40PM showtime";
   }
   
   public String option3()
   {
      return "You chose 6:00PM showtime";
   }
   
   public String option4()
   {
      return "You chose 8:20PM ahowtime";
   }
   
   //Stores how many tickets user wants 
   public void setTickets1(int t1)
   {
      tickets1 = t1;
   }
   
   public void setTickets2(int t2)
   {
      tickets2 = t2;
   }
  
   public void setTickets3(int t3)
   {
      tickets3 = t3;
   }
   
   public void setTickets4(int t4)
   {
      tickets4 = t4;
   }
   
   //Return how many tickets the user wants 
   public int getTickets1()
   {
      return tickets1;
   }
   
   public int getTickets2()
   {
      return tickets2;
   }
   
   public int getTickets3()
   {
      return tickets3;
   }
   
   public int getTickets4()
   {
      return tickets4;
   }

   
   //Subtract the number of seats the user has chosen from the seats available 
   public int calculateSeats1(int tickets1)
   {
      int count = 0;
      for(int i = 0; i < 51; i++)
      {
        count = i; 
      }
      return count - tickets1;
   }
   
   public int calculateSeats2(int tickets2)
   {
      int count = 0;
      for(int i = 0; i < 51; i++)
      {
         count = i; 
      }
      return count - tickets2;
   }
   
   public int calculateSeats3(int tickets3)
   {
      int count = 0;
      for(int i = 0; i < 51; i++)
      {
         count = i;
      }
      return count - tickets3;
   }
   
   public int calculateSeats4(int tickets4)
   {
      int count = 0;
      for(int i = 0; i < 51; i++)
      {
         count = i;
      }
      return count - tickets4;
   }

   
   //Menu for the user to choose a showtime from 
   public void menu()
   {
      System.out.println("Choose an option below: \n" +
                         "1. 1:20PM \n" + 
                         "2. 3:40PM \n" +
                         "3. 6:00PM \n" +
                         "4. 8:20PM \n" +
                         "5. Quit. If you're good to go \n" +
                         "6. No more showtimes");
      System.out.println();                   
   }
   
   public void menu2()
   {
      System.out.println("1. Yes" + "\n" +
                         "2. No");
      System.out.println();                   
   }
}