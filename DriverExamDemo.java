//Dabeluchukwu 

//import javax.swing.JOptionPane;
import java.util.Scanner;

public class DriverExamDemo
{
   public static void main(String[] args)
   {
      char[] answers = new char[20];
      Scanner keyboard = new Scanner(System.in);
      
      for(int i = 0; i < answers.length; i++)
      {
         char input;
         
         //use do while loop to get valid inputs  
         do
         {
            System.out.println(i + 1);
            input = Character.toUpperCase(keyboard.next().charAt(0));
            
         }while(input < 'A' || input > 'D');
            answers[i] = input; 
      }
      
      DriverExam grader = new DriverExam(answers){};
      System.out.println("Correct: " + grader.totalCorrect());
      System.out.println("Incorrect: " + grader.totalIncorrect());
      
      int[] incorrect = grader.questionMissed();
      if(incorrect.length > 0)
      {
         System.out.print("Questions missed: ");
         for(int i = 0; i < incorrect.length; i++)
            System.out.println(incorrect[i]); 
      }
   }
}