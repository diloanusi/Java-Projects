public class GradeBook
{
   private final int NUM_STUDENTS = 5;
   private final int NUM_TESTS = 4;
   private String[] names = new String[NUM_STUDENTS];
   private char[] grades = new char[NUM_STUDENTS];
   private double[] scores1 = new double[NUM_TESTS];
   private double[] scores2 = new double[NUM_TESTS];
   private double[] scores3 = new double[NUM_TESTS];
   private double[] scores4 = new double[NUM_TESTS];
   private double[] scores5 = new double[NUM_TESTS];

   //assign student name to student number
   public void setName(int studentNumber, String name)
   {
      names[studentNumber-1] = name;
   }

   //set test scores to student 
   public void setScores(int studentNumber, double[] scores)
   {
          switch(studentNumber)
          {
              case 1:copyArray(scores1,scores); 
                  break;
              case 2:copyArray(scores2,scores); 
                  break;
              case 3:copyArray(scores3,scores); 
                  break;
              case 4:copyArray(scores4,scores); 
                  break;
              case 5:copyArray(scores5,scores); 
                  break;
              default:
                  break;
          }
   }
   
   public String getName(int studentNumber)
   {
       return names[studentNumber-1];
   }

   public double getAverage(int studentNumber)
   {
       double avg = 0.0;
       switch(studentNumber)
          {
              case 1:avg = calcAverage(scores1);
                  break;
              case 2:avg = calcAverage(scores2); 
                  break;
              case 3:avg = calcAverage(scores3); 
                  break;
              case 4:avg = calcAverage(scores4); 
                  break;
              case 5:avg = calcAverage(scores5); 
                  break;
              default:
                  break;
          }
       return avg;
   }

   public char getLetterGrade(int studentNumber)
   {
       char lettergrade;
       if(getAverage(studentNumber) < 101)
           lettergrade = 'A';
           
           else if(getAverage(studentNumber) < 90)
           lettergrade = 'B';
           
           else if(getAverage(studentNumber) < 80)
           lettergrade = 'C';
           
           else if(getAverage(studentNumber) < 70)
           lettergrade = 'D';
           
           else
               lettergrade = 'F';
               
           return lettergrade;
   }

   //copy content from one array to another
   public void copyArray(double[] to, double[] from)
   {
        System.arraycopy(from, 0, to, 0, from.length);
   }

   //calculate average of the scores in the array
   public double calcAverage(double[] scores)
   {
       double sum=0;
       for(int i=0; i<scores.length; i++)
           sum+=scores[i];
       return sum/scores.length;  
   }

   //Determine the letter grade and assign it to the student in the argument
   public void assignGrade(int studentNumber)
   {
      grades[studentNumber-1] = getLetterGrade(studentNumber);      
   }
   
   //Determine the letter grade and return the value
   public char determineGrade(double average)
   {
            
        char lettergrade; 
       if(average < 101)
           lettergrade = 'A';
           
       else if(average < 90)
           lettergrade = 'B';
           
       else if(average < 80)
           lettergrade = 'C';
           
       else if(average < 70)
           lettergrade = 'D';
       else
           lettergrade = 'F';
       
       return lettergrade;
   }
}   