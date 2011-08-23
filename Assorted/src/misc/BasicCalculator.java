package misc;
/* Basic Calculator project
 * by 212014 P2
 * Last Edited 8/15/09 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class BasicCalculator {
  //Takes 2 operands and an operator and returns the result
  
  public static void main(String[] args) {
    //Objects
    Scanner input = new Scanner(System.in);
    DecimalFormat dec = new DecimalFormat("0.00");
    //Input
    System.out.println("Please enter the first operand:");
    double op1 = input.nextDouble();
    
    System.out.println("Please enter the second operand:");
    double op2 = input.nextDouble();
    
    System.out.println("Please choose the operator (+, -, *, /, %):");
    char operator = input.next().trim().charAt(0);
    
    //Check for errors
    if (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%') {
      System.out.println("Sorry, you inputted an invalid operator.");
    } else if (op2==0 && operator=='/') {
      System.out.println("Error: You cannot divide by zero.");
    } else {
      //Check for modulus
      if (operator=='%'){
        System.out.print("*** Calculating modulus result for "+(int)op1+" / "+(int)op2+" = ");
      } else {
        System.out.print("Your result is: ");
      }
      //Determining output
      switch (operator) {
        case '+' :
          System.out.println(dec.format(op1+op2));
          break;
        case '-' :
          System.out.println(dec.format(op1-op2));
          break;
        case '*' :
          System.out.println(dec.format(op1*op2));
          break;
        case '/' :
          System.out.println(dec.format(op1/op2));
          break;
        case '%' :
          System.out.println((int)op1%(int)op2);
          break;
      }
    }
  }
}