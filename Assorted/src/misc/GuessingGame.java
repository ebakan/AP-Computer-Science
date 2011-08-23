package misc;
/*Guessing Game project
 * by 212014
 * DOM 10/28/09 */


import java.util.Random;
import java.util.Scanner;

//Has functions for a computer generating a random number and the player guessing
//and the player entering a number and the computer guessing
public class GuessingGame {
  private static Random rand = new Random();
  private static Scanner input = new Scanner(System.in);
  
  public static void playerGuess () {
    int numbah = rand.nextInt(100)+1;
    
    System.out.println("I have a number between 1 and 100.\nCan you guess my number?\nPlease type your first guess.");
    int guess = input.nextInt();
    int count = 1;
    while (guess!=numbah) {
      if (guess>numbah) {
        System.out.println("Too high. Try again.");
      } else {
        System.out.println("Too low. Try again.");
      }
      count++;
      guess = input.nextInt();
    }
    System.out.println("Excellent! You guessed the number in "+count+" tries!");
    int avg = 7;
    if (count==avg) {
      System.out.print("You did average!");
    } else if (count>avg) {
      System.out.print("You did worse than the average!");
    } else {
      System.out.print("You did better than the average!");
    }
  }
  
  public static void compGuess() {
    System.out.println("What is your magic number between 1 and 100?");
    int numbah = input.nextInt();
    while (numbah<1 || numbah>100) {
      System.out.println("That is not a valid number. Please choose a number between 1 and 100.");
      numbah = input.nextInt();
    }
    int count = 0;
    int min = 0, max = 100;
    int guess = -1;
    while (guess!=numbah);
      guess = (min+max)/2;
      System.out.println("I am going to guess "+guess);
      boolean truth = false;
      while (!truth) {
        System.out.println("Is my number too low, correct, or too high? (l/c/h)");
        String choice = input.next();
        System.out.println(choice);
        while (!choice.equals("l") && !choice.equals("c") && !choice.equals("h")) {
          System.out.println("That is not a valid choice. Please enter \"l\" if my guess is too low, \"c\" if it is correct, or \"h\" if it is too high.");
          choice = input.next();
        }
        if (choice.equals("l")) {
          if (guess<numbah) {
            System.out.println("Good job telling the truth.");
            min = guess;
            truth = true;
          }
          else {
            System.out.println("Lies!");
          }
        } else if (choice.equals("h")) {
          if (guess>numbah) {
            System.out.println("Good job telling the truth.");
            max = guess;
            truth = true;
          }
          else {
            System.out.println("Lies!");
          }
        } else {
          if (guess==numbah) {
            System.out.println("Good job telling the truth.");
            truth = true;
          }
          else {
            System.out.println("Lies!");
          }
        }
      }
      count++;
      System.out.println("Hurray, I won the game in "+count+" tries!");
    }
  public static void main (String[] args) {
    while (true) {
      System.out.println("Would you like the computer or the player to input the magic number? (c/p)");
      String inp = input.next();
      if (inp.equals("c")) {
        playerGuess();
        break;
      } else if (inp.equals("p")) {
        compGuess();
        break;
      } else {
        System.out.println("Incorrect input. Please enter either a \"c\" or a \"p\".");
      }
    }
  }
}
//It can be guessed by picking the median between two points determined by logic.
//For example, one must choose the median between 0 and 100 (50) to determine whether the actual number is above or below that median.
//Then, if the number is less than 50, the user must choose the median between 0 and 50 (25) or likewise if it is greater than 50.
//Repeating this should result in an average of 7 guesses per try to guess the acutal number.
//Greater than 7 tries represents the use of either a different method or random guessing, whereas below average scores show extreme luck.