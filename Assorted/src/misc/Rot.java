package misc;
import java.util.Scanner;

public class Rot {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    
    
    System.out.print("Input:");
    String in = input.nextLine();
    
    String output = "";
    for (int i=0;i<in.length();i++) {
      output+=in.charAt(i);
  }
  }
}