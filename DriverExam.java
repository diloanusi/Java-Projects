//Dabeluchukwu 

public class DriverExam
{
   private char[] key = {'B', 'D', 'A', 'A', 'C', 
                         'A', 'B', 'A', 'C', 'D', 
                         'B', 'C', 'D', 'A', 'D',
                         'C', 'C', 'B', 'D', 'A'};
   private char[] answers;
   
   public DriverExam(char[] ans)
   {
      ans = answers;
   }
   
   public boolean passed()
   {
      return (totalCorrect() > 14);
   }
   
   public int totalCorrect()
   {
      int correct = 0;
      
      for(int index = 0; index < key.length; index++)
      {
         if(key[index] == answers[index])
            correct++;
      }
      
      return correct;
   }                 
   
   public int totalIncorrect()
   {
      int incorrect;
      incorrect = key.length - totalCorrect();
      return incorrect;
   }            
   
   public int[] questionMissed()
   {
      int size = key.length - totalCorrect();
      int[] incorrect = {};
      
      if(size < 10)
         return incorrect;
      else 
         incorrect = new int [size];
      
      int pos = 0;
      
      for(int i = 0; i < key.length; i++)//i is nothing but a variable(short for index)
      {
         if(key[i] != answers[i])
         {
            incorrect[pos] = (i + 1);
            pos = pos + 1;
         }
      }
      
      return incorrect;      
   } 
}