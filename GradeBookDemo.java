
import javax.swing.JOptionPane; 
 
public class GradeBookDemo
{
  public static void main(String[] args)
  { 
    String name1, name2, name3, name4, name5;
    String input1, input2, input3, input4;
    String input5, input6, input7, input8;
    String input9, input10, input11, input12; 
    String input13, input14, input15, input16;
    String input17, input18, input19, input20;
       
    name1 = JOptionPane.showInputDialog("Enter First name: ");
    name2 = JOptionPane.showInputDialog("Enter Second name: ");
    name3 = JOptionPane.showInputDialog("Enter Third name: ");
    name4 = JOptionPane.showInputDialog("Enter Fourth name: ");
    name5 = JOptionPane.showInputDialog("Enter Fifth name: ");
    
    //scores of first student 
    input1 = JOptionPane.showInputDialog("Enter First Score of student 1: ");
    int grade1 = Integer.parseInt(input1);
    input2 = JOptionPane.showInputDialog("Second Score: ");
    int grade2 = Integer.parseInt(input2);
    input3 = JOptionPane.showInputDialog("Third Score: ");
    int grade3 = Integer.parseInt(input3);
    input4 = JOptionPane.showInputDialog("Fourth Score: ");
    int grade4 = Integer.parseInt(input4);
    
    //scores of second student    
    input5 = JOptionPane.showInputDialog("Enter First Score of student 2: ");
    int grade5 = Integer.parseInt(input5);
    input6 = JOptionPane.showInputDialog("Second Score: ");
    int grade6 = Integer.parseInt(input6);
    input7 = JOptionPane.showInputDialog("Third Score: ");
    int grade7 = Integer.parseInt(input7);
    input8 = JOptionPane.showInputDialog("Fourth Score: ");
    int grade8 = Integer.parseInt(input8);
    
    //scores of third student    
    input9 = JOptionPane.showInputDialog("Enter First Score of student 3: ");
    int grade9 = Integer.parseInt(input9);
    input10 = JOptionPane.showInputDialog("Second Score: ");
    int grade10 = Integer.parseInt(input10);
    input11 = JOptionPane.showInputDialog("Third Score: ");
    int grade11 = Integer.parseInt(input11);
    input12 = JOptionPane.showInputDialog("Fourth Score: ");
    int grade12 = Integer.parseInt(input12);
    
    //scores of fourth student
    input13 = JOptionPane.showInputDialog("Enter First Score of student 4: ");
    int grade13 = Integer.parseInt(input13);
    input14 = JOptionPane.showInputDialog("Second Score: ");
    int grade14 = Integer.parseInt(input14);
    input15 = JOptionPane.showInputDialog("Third Score: ");
    int grade15 = Integer.parseInt(input15);
    input16 = JOptionPane.showInputDialog("Fourth Score: ");
    int grade16 = Integer.parseInt(input16);
    
    //scores of fifth student 
    input17 = JOptionPane.showInputDialog("Enter First Score of student 5: ");
    int grade17 = Integer.parseInt(input17);
    input18 = JOptionPane.showInputDialog("Second Score: ");
    int grade18 = Integer.parseInt(input18);
    input19 = JOptionPane.showInputDialog("Third Score: ");
    int grade19 = Integer.parseInt(input19);
    input20 = JOptionPane.showInputDialog("Fourth Score: ");
    int grade20 = Integer.parseInt(input20);;
    
    GradeBook GB = new GradeBook();
    GB.setName(1, name1);
    GB.setName(2, name2);
    GB.setName(3, name3);
    GB.setName(4, name4);
    GB.setName(5, name5);
    
    double[] scores1 = {grade1, grade2, grade3, grade4};
    GB.setScores(1, scores1);
    double[] scores2 = {grade5, grade6, grade7, grade8};
    GB.setScores(2, scores2);
    double[] scores3 = {grade9, grade10, grade11, grade12};
    GB.setScores(3, scores3);
    double[] scores4 = {grade13, grade14, grade15, grade16};
    GB.setScores(4, scores4);
    double[] scores5 = {grade17, grade18, grade19, grade20};
    GB.setScores(5, scores5);

    for(int i=1; i<6; i++)
    {
      System.out.println(GB.getName(i) + " Has got Average "+ GB.getAverage(i) + " and Grade is " + GB.determineGrade(GB.getAverage(i)) );
    }
  }
}        