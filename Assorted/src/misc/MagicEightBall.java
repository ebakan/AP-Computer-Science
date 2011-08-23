package misc;
/*Magic Eight Ball
 * by 212014 P2
 * DOM 10/19/09 */

import java.util.Random;
import java.util.Scanner;

public class MagicEightBall {
  
  //receives a question and generates a random answer
  public static void main(String[] args) {
    
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    
    //question
    System.out.println("What do you ask of the great magic eight ball?");
    input.next();
    
    //possible answers
    switch (rand.nextInt(10)) {
      case 0:
        System.out.println("Affirmative.");
        break;
      case 1:
        System.out.println("Negatory.");
        break;
      case 2:
        System.out.println("If you ask nicely.");
        break;
      case 3:
        System.out.println("Aren't I the greatest? Oh, you asked a question. Um..... If you believe in yourself, I guess anything's possible!");
        break;
      case 4:
        System.out.println("It will cost you 20 bucks.");
        break;
      case 5:
        System.out.println("DOES NOT COMPUTE. ERROR. ERROR.");
        break;
      case 6:
        System.out.println("Provided you have an adequate supply of chloroform.");
        break;
      case 7:
        System.out.println("Today is your lucky day!");
        break;
      case 8:
        System.out.println("What an absurd question! Of course not! Such blasphemy is preposterous!");
        break;
      default:
        System.out.println("Eh, I tire of this. Go away, leave me be.");
        break;
    }
  }
}
        