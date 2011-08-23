package misc;
//Democracy by 212014 P2
//DOM 1/6/10

import java.util.Scanner;
import java.text.DecimalFormat;

//Tallies votes for candidates and displays percentages
public class Democracy {
  
  public static void main(String[] args) {
    //objects
    Scanner input=new Scanner(System.in);
    DecimalFormat dec = new DecimalFormat("0.00"); 
    
    //gets minimum candidate number
    int min;
    do {
      System.out.println("Enter the minimum candidate number:");
      min = input.nextInt();
      if (min<1) System.out.println("The minimum candidate number must be greater than or equal to 1");
    } while (min<1);
    final int MIN = min;
    
    //gets maximum candidate number
    int max;
    do {
      System.out.println("Enter the maximum candidate number:");
      max = input.nextInt();
      if (max<min) System.out.println("The maximum candidate number must be greater or equal to than the minimum candiate number.");
    } while (max<min);
    final int MAX = max;
    
    //array of tallies for candidates
    int[] tally = new int[MAX-MIN+1];
    
    //gets votes
    int in, sum=0;
    do {
      System.out.println(String.format("Enter the candidate's number (%d - %d) (0 to quit)",MIN,MAX));
      in=input.nextInt();
      if (in>=MIN && in<=MAX) {
        tally[in-MIN]++;
        sum++;
      }
      else System.out.println(String.format("%d is not a valid candidate number.",in));
    } while (in!=0);
    
    System.out.println("Thank you. Summation of data:");
    
    System.out.println(String.format("Total entries: %d",sum));
    
    //output candidates' vote data
    for (int i=0;i<tally.length;i++) {
      System.out.println(String.format("Candidate #%d: %d\tpercentage: %s",i+MIN,tally[i],dec.format((double) tally[i]/sum*100)));
    }
  }
}