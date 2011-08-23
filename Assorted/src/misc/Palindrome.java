package misc;
/* Palindrome Project
 * by 212014 P2
 * DOM 11/3/09 */

import java.lang.Character;
import java.util.Scanner;

//checks if an inputted string is a palindrome
public class Palindrome {
  public static void main (String[] args) {
    Character character;
    Scanner input = new Scanner(System.in);
    
    //input
    System.out.println("What is your string?");
    String orig = input.nextLine();
    String in = ""; //string of letters
    
    //eliminates all the non-alpha chars
    for (int i=0;i<orig.length();i++) {
      character = orig.charAt(i);
      if (character.equals(orig.charAt(i)))
        in+= character;
    }
    
    //creates a reversed version of the string
    String out = ""; //reversed version of in
    for (int i=in.length()-1;i>=0;i--) {
      out += in.charAt(i);
    }
    
    //checks if the two strings are equal or not
    if (in.equalsIgnoreCase(out)) {
      System.out.println("That is a palindrome!");
    } else {
      System.out.println("That is not a palindrome!");
    }
    
  }
}