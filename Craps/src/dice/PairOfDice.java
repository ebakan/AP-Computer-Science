package dice;

public class PairOfDice {
  
  private Die d1, d2;
  
  public PairOfDice (int sides) {
    d1 = new Die(sides);
    d2 = new Die(sides);
  }
  
  public int[] roll () {
    int[] out = {d1.roll(), d2.roll()};
    return out;
  }
  
}