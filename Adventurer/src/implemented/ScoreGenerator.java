package implemented;

import java.util.Random;
import java.util.Arrays;

public class ScoreGenerator {
  
  public static int generate() {
    return generate(true);
  }
  
  public static int generate(boolean bool) {
    Random rand = new Random();
    int[] rolls = new int[4];
    for (int i=0;i<4;i++) {
      rolls[i]=rand.nextInt(6)+1;
      if (bool) System.out.println(String.format("Die %d: %d", i+1, rolls[i]));
    }
    System.out.println();
    Arrays.sort(rolls);
    System.out.println("The dice, sorted:");
    for (int i=0;i<4;i++) {
      rolls[i]=rand.nextInt(6)+1;
      if (bool) System.out.println(String.format("Die %d: %d", i+1, rolls[i]));
    } 
    if (bool) System.out.println(String.format("%d eliminated.\nSum of remaining 3 rolls: %d", rolls[0], rolls[1]+rolls[2]+rolls[3]));
    return rolls[1]+rolls[2]+rolls[3];
  }
}