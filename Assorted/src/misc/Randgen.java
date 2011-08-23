package misc;
import java.util.Random;
import java.util.Scanner;

public class Randgen {
  public static void main(String[] args){
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    try {
      System.out.print("Pick a minimum integer:");
      int min = input.nextInt();
      System.out.print("Pick a maximum integer:");
      int max = input.nextInt();
      System.out.println(String.format("Here is a random number between %d and %d: %d", min, max, rand.nextInt(max-min+1)+min));
    }
    catch(java.util.InputMismatchException e){
      System.out.println("BOOO! YOU TRIED TO BREAK MY PROGRAM! BYE BYE!");
      System.exit(0);
    }
  }
}
