
import javax.swing.JOptionPane;
public class DemoTestScore
{
   public static void main(String[] args)
   {  
      double testScore1, testScore2, testScore3;
      
      //ask user for input 
      String input1, input2, input3;
      input1 = JOptionPane.showInputDialog("Enter TestScore 1:");
      testScore1 = Double.parseDouble(input1);
      input2 = JOptionPane.showInputDialog("Enter TestScore 2:");
      testScore2 = Double.parseDouble(input2);
      input3 = JOptionPane.showInputDialog("Enter TestScore 3:");
      testScore3 = Double.parseDouble(input3);
      
      while(testScore1 < 0 && testScore1 > 100)
      {
        input1 = JOptionPane.showInputDialog("Please enter a valid testScore:");
        testScore1 = Double.parseDouble(input1);
      }
      while(testScore2 < 0 && testScore2 > 100)
      {
        input2 = JOptionPane.showInputDialog("Please enter a valid testScore:");
        testScore2 = Double.parseDouble(input2); 
      }
      while(testScore3 < 0 && testScore2 > 100)
      {
        input3 = JOptionPane.showInputDialog("Please enter a valid testScore:");
        testScore3 = Double.parseDouble(input3);
      }
      TestScores test = new TestScores(testScore1, testScore2, testScore3);
      
      
      JOptionPane.showMessageDialog(null, "Test Score 1: " + test.getTest1() + "\n" +
                                          "Test Score 3: " + test.getTest2() + "\n" +
                                          "Test Score 3: " + test.getTest3() + "\n" +
                                          "Test Average: " + test.getAverage(testScore1, testScore2, testScore3));
                                          
    System.exit(0);
   }
}   