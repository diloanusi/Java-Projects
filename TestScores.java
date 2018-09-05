public class TestScores
{
   //Fields 
   private double testScore1;
   private double testScore2;
   private double testScore3;
   
   //Constructor 
   public TestScores(double test1, double test2, double test3)
   {
      testScore1 = test1;
      testScore2 = test2;
      testScore3 = test3;
   }
   
   public double getTest1()
   {
      return testScore1;
   }
   
   public double getTest2()
   {
      return testScore2;
   }
    
   public double getTest3()
   {
      return testScore3;
   } 
   
   public double getAverage(double test1, double test2, double test3)
   {
      return ((test1+test2+test3)/3);
   }
   
}