package craps;

import dice.PairOfDice;

//by 212014 P3 1/27/10
//simulates a game of craps
public class Craps {
  
  private PairOfDice dice = new PairOfDice(6);
  
  public int play() {
    int point = roll();
    int state = 0;
    int numrolls=1;
    if (point ==  7 || point == 11) {
      state = 1;
    } else if (point == 2 || point == 3 || point == 12) {
      state = -1;
    } else {
      int roll = 0;
      do {
        roll = roll();
        if (roll == point) {
          state = 1;
        } else if (roll == 7) {
          state = -1;
        }
        numrolls++;
      } while (roll!= point && roll!=7);
    }
    return state*numrolls;
  }
  
  private int roll() {
    int[] rolls = dice.roll();
    return rolls[0]+rolls[1];
  }
}