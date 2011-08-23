package misc;
/* Text Analysis Project
 * by 212014 P2
 * DOM 11/3/09 */

import java.util.Scanner;
import java.lang.Character;
import java.util.Arrays;

public class textanalysis {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    Character character;
    System.out.println("Input a string:");
    String orig = input.nextLine();
    String in = "";
    for (int i=0;i<orig.length();i++) {
      character = orig.charAt(i);
      if (character.equals(orig.charAt(i)) || character==' ' || character=='‘' || character=='\'' || character=='"')
        in+= character;
    }
    in=in.toLowerCase();
    System.out.println(in);
    
    String choice;
    do {
      System.out.println("Letter count or word length? (c/l)");
      choice = input.nextLine();
      if (!(choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("l"))) {
        System.out.println("That is not a correct choice.");
      }
    } while (!(choice.equalsIgnoreCase("c") || choice.equalsIgnoreCase("l")));
    
    if (choice.equalsIgnoreCase("c")) {
      char[] letters = new char[26];
      int[] count = new int[26];
      for (int i=0;i<count.length;i++) count[i]=0;
      for (int i=97;i<123;i++) letters[i-97] = (char) i;
      for (int i=0;i<count.length;i++) {
        for (int j=0;j<in.length();j++) {
          if (in.charAt(j)==letters[i])
            count[i]+=1;
        }
      }
      for (int i=0;i<letters.length;i++) {
        System.out.println(letters[i]+": "+count[i]);
      }
            
    } else {
      String[] words = in.split(" ");
      int[] lengths = new int[words.length];
      
      for (int i=0;i<words.length;i++) {
        lengths[i]=words[i].length();
      }
      Arrays.sort(lengths);
      int[] count = new int[lengths[lengths.length-1]];
      for (int i=0;i<words.length;i++) {
        for (int j=0;j<lengths.length;j++) {
          if (lengths[i]==j+1) count[j]+=1;
        }
      }
      System.out.println("Word length\tOccurrences");
      for (int i=0;i<count.length;i++) {
        System.out.println((i+1)+"\t\t"+count[i]);
      }
    }
  }
}