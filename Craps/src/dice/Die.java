package dice;
import java.util.Random;

public class Die {
  
  private Random rand = new Random();
  private int sides;
  
  public Die (int sides) {
    this.sides=sides;
  }
  
  public Die () {
    this.sides=6;
  }
  
  public int roll() {
    return rand.nextInt(sides)+1;
  }
}