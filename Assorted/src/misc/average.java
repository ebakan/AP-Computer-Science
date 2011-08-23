package misc;
import java.util.Scanner;
public class average {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    int rng=3;
    long val=0;
    for(int i=0;i<rng;i++){
      System.out.print("Give me an integer:");
      try {
      val+=scan.nextInt();
      }
      catch(java.util.InputMismatchException e){
      System.out.println("BOOO! YOU TRIED TO BREAK MY PROGRAM! BYE BYE!");
      System.exit(0);
      }
    }
    float avg = (float) val/rng;
    System.out.println(String.format("The average of these numbers is %.2f.",avg));
  }
}