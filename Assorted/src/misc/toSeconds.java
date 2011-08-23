package misc;
import java.util.Scanner;
public class toSeconds {
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] keys={"Hours","Minutes","Seconds"};
    int secs=0;
    for(int i=0;i<keys.length;i++){
      System.out.print(String.format("How many %s?",keys[i]));
      try {
      secs+=scan.nextInt()*Math.pow(60,(keys.length-1)-i);
      }
      catch(java.util.InputMismatchException e){
      System.out.println("BOOO! YOU TRIED TO BREAK MY PROGRAM! BYE BYE!");
      System.exit(0);
      }
    }
    System.out.println(String.format("That equates to %d seconds.",secs));
  }
}