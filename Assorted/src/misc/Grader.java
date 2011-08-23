package misc;
/* Grading Project
 * by Eric Bakan
 * ID 212014 P2 */

import java.util.Scanner;
import java.util.Arrays;

public class Grader {
  public static char getLetter (double avg) {
    if (avg >=90) {
        return 'A';
      } else if (avg>=80) {
        return 'B';
      } else if (avg>=70) {
        return 'C';
      } else if (avg>=60) {
        return 'D';
      } else {
        return 'F';}
  }
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    String answer = "y";
    while (answer.equalsIgnoreCase("y")) {
      System.out.println("Would you like to calculate a grade?");
      answer=input.next();
      
      if (answer.equalsIgnoreCase("n")) {
        System.out.println("Thank you. Goodbye.");
        break;
      } else if (!answer.equalsIgnoreCase("y")){
        System.out.println("Invalid input. Please enter either a \"y\" or an \"n\".");
        answer="y";
        continue;       
      }
      
      int numGrades=5;
      double[] grades = new double[numGrades];
      double avg=0;
      
      System.out.print("Please enter ");
      for(int i=0; i<5;i++) {
        System.out.println("grade "+(i+1)+":");
        grades[i]=input.nextDouble();
        avg+=grades[i];
      }
      
      avg=avg/grades.length;
      Arrays.sort(grades);
      
      System.out.println("The student's average is "+avg);
      System.out.println("His letter grade is a(n) "+getLetter(avg));
      
      String recalculate = "y";
      while (recalculate.equalsIgnoreCase("y")) {
        System.out.println("Would you like to drop the lowest grade and recalculate? (y or n)");
        recalculate = input.next();
        
        if (recalculate.equalsIgnoreCase("n")) {
          System.out.println("Okay.");
          break;
        } else if (!recalculate.equalsIgnoreCase("y")){
          System.out.println("Invalid input. Please enter either a \"y\" or an \"n\".");
          recalculate="y";
          continue;       
        }
        
        System.out.println("The lowest grade is a "+grades[0]+".  That grade has been dropped.");
        
        double newAvg=0;
        for(int i=1;i<grades.length;i++) {
          newAvg+=grades[i];
        }
        newAvg=newAvg/(grades.length-1);
        
        System.out.println("The student's average is "+newAvg);
        System.out.println("His letter grade is a(n) "+getLetter(newAvg));
        break;
      }
    }
  }
}