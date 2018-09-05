import java.util.Scanner; //Needed for scanner class 
import java.io.*; //Needed for File class 

/**
This program reads the first 5 lines of a File.
If file is less than 5 lines, then it reads all of it.
*/

public class FileHeadDisplay 
{

   public static void main(String[] args) throws IOException
   {
   
      //create scanner object for keyboard input 
      Scanner keyboard = new Scanner(System.in);
      
      //get file name
      System.out.print("Enter the name of a file: ");
      String filename = keyboard.nextLine();
      
      int fileline = 1;
      
      //open file
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      
      //Read the first 5 lines from the file       
      while (inputFile.hasNext() && fileline < 6) 
      {
         String line = inputFile.nextLine();
         System.out.println(line);
         fileline ++;
      }
      
      //close file 
      inputFile.close();
   }

}