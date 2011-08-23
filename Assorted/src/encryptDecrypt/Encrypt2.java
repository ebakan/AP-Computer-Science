package encryptDecrypt;
/* Basic Encryption Project
 * by Eric Bakan
 * ID 212014 P2 */


import java.util.Scanner;

public class Encrypt2 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Input
    System.out.println("Input a string:");
    String str = input.nextLine();
    System.out.println("Input the rotation value:");
    int rotate = input.nextInt();
    
    //Get Digits in an Array
    String output = "";
    for (int i=0;i<str.length();i++) {
      output+=(char) (((((int) str.charAt(i))+rotate-32)%95)+32);
    }

    System.out.println(output);
  }
}