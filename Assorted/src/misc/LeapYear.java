package misc;
/* Leap Year Project
 * by 212014 P2
 * Last Edited 8/13/09 */



import java.util.Scanner;

public class LeapYear {
  /*Takes an inputted year and evaluates whether it is a leap year
   * based on the conditions defined in the book.*/
  
  
  //returns -1 if yr is less thatn 1582, 1 if yr is a leap year, or 0 if yr is not a leap year
  public static int evaluateYear (int yr) {
    if (yr<1582) {
      return -1;
    } else if (yr%400==0) {
      return 1;
    } else if (yr%100==0) {
      return 0;
    } else if (yr%4==0) {
      return 1;
    } else {
      return 0;
    }
  }
  
  public static void main (String[] args) {
    
    Scanner input = new Scanner(System.in);

    for(;;){
    System.out.println("Input a year:");
    int year = input.nextInt();
    
    //determine whether year is a leap year or not
    int val = evaluateYear(year);
    
    //print different statements depending on year's condition as a leap year
    System.out.print("The year "+year);
    if (val==-1) {
      System.out.println(" is before 1582, when the Gregorian calendar was adopted.");
    } else if (val==1) {
      System.out.println(" is a leap year.");
    } else {
      System.out.println(" is not a leap year.");
    }
    }
  }
}