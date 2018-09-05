import javax.swing.JOptionPane; 

public class TestAverageAndGrade
{

  public static void main(String[] args)
  {
    double testScore1, testScore2, testScore3, testScore4, testScore5; 
    double testAverage;
    String letterGrade; 
    String input;
    
    input = JOptionPane.showInputDialog("Please enter the first test score");
    testScore1 = Double.parseDouble(input);
    input = JOptionPane.showInputDialog("Please enter the second test score");
    testScore2 = Double.parseDouble(input);
    input = JOptionPane.showInputDialog("Please enter the third test score");
    testScore3 = Double.parseDouble(input);
    input = JOptionPane.showInputDialog("Please enter the fourth test score");
    testScore4 = Double.parseDouble(input);
    input = JOptionPane.showInputDialog("Please enter the fifth test score");
    testScore5 = Double.parseDouble(input);
    
    testAverage = calcAverage(testScore1, testScore2, testScore3, testScore4, testScore5);
    letterGrade = determineGrade(testAverage);
    JOptionPane.showMessageDialog(null,
      "You scored: \n" + 
      "Test 1 grade: " + testScore1 + " : " + determineGrade(testScore1) + "\n" +
      "Test 2 grade: " + testScore2 + " : " + determineGrade(testScore2) + "\n" +
      "Test 3 grade: " + testScore3 + " : " + determineGrade(testScore3) + "\n" +
      "Test 4 grade: " + testScore4 + " : " + determineGrade(testScore4) + "\n" +
      "Test 5 grade: " + testScore5 + " : " + determineGrade(testScore5) + "\n" +
      "Average grade: " + testAverage + " : " + determineGrade(testAverage) + "\n");
      
    System.exit(0);
  }
  
  public static double calcAverage(double t1, double t2, double t3, double t4, double t5)
  {
    return ((t1+t2+t3+t4+t5)/5.0);
  }
  
  public static String determineGrade(double testScore)
  {
    String grade;
    if (testScore >= 90)
      grade = "A";
    else if (testScore >= 80)
      grade = "B";
    else if (testScore >= 70)
      grade = "C";
    else if (testScore >= 60)
      grade = "D";
    else 
      grade = "F";
    return grade;   
  }
}