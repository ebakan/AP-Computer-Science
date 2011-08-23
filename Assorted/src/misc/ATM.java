package misc;
/* ATM Project
 * by 212014
 * DOM 10/29/09 */

import java.util.Scanner;
import java.text.DecimalFormat;

//Simulates an atm with appropriate functions
public class ATM {
  
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    DecimalFormat dec = new DecimalFormat("0.00");
  
    System.out.println("Welcome to the ATM Program!");
    double balance = -1;
    int answer;
    
    //account balance
    do {
      System.out.println("What is the balance in your account?");
      balance = input.nextDouble();
      if (balance<0) System.out.println("That's a negative number! Please enter a positive one!");
    } while (balance<0);
    
    System.out.println("The current balance is $"+dec.format(balance));
    
    //main loop
    do {
      System.out.println("1 Deposit\n"+
                         "2 Withdrawal\n" +
                         "3 Balance Inquiry\n" +
                         "4 Compute Interest\n" +
                         "5 Quit");
      answer = input.nextInt();
      if (answer != 1 && answer != 2 && answer != 3 && answer != 4 && answer != 5) {
        System.out.println("That's not a valid input! Please try again.");
        continue;
      }
      double money;
      switch (answer) {
        case 1:
          do {
            System.out.println("How much would you like to deposit?");
            money = input.nextDouble();
            if (money<0) System.out.println("That's a negative number! Please enter a positive one!");
          } while (money<0);
          balance+=money;
          System.out.println("The current balance is $"+dec.format(balance));
          break;
          
        case 2:
          do {
            System.out.println("How much would you like to withdraw?");
            money = input.nextDouble();
            if (money<0) System.out.println("That's a negative number! Please enter a positive one!");
            else if (money>balance) System.out.println("That's more money than you have! Please enter a number less than the amount you have!");
          } while (money<0 && money>balance);
          balance-=money;
          System.out.println("The current balance is $"+dec.format(balance));
          break;
          
        case 3:
          System.out.println("The current balance is $"+dec.format(balance));
          break;
          
        case 4:
          double interest;
          int years;
          int times;
          do {
            System.out.println("What is the interest rate?");
            interest = input.nextDouble();
            if (interest<0) System.out.println("That's a negative interest rate! Please enter a positive one!");
            else if (interest>100) System.out.println("That's more than 100% interest! Please enter one below 100!");
          } while (interest<0 && interest>100);
          
          do {
            System.out.println("How many times per year are you compounding interest?");
            times = input.nextInt();
            if (times<1) System.out.println("That's less than once per year! Please enter at least once per year!");
          } while (times<1);
          
          do {
            System.out.println("How many years are you compounding interest for?");
            years = input.nextInt();
            if (years<1) System.out.println("That's less than one year! Please enter at least one year!");
          } while (years<1);
          
          balance*=Math.pow(1+interest/100/times,years*times);
          System.out.println("The current balance is $"+dec.format(balance));
          break;
          
        default:
          System.out.println("Thanks for using the ATM Program\nGoodbye!");
          break;
      }
    } while (answer !=5);
  }
}