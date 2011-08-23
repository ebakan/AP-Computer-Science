package adventurers;
import implemented.*;

public class Fighter extends Adventurer {
  private int defense;
  
  public Fighter() {
    super();
    System.out.println("Filling Defense...\n");
    defense=ScoreGenerator.generate();
  }
  
  public void display() {
    super.display();
    System.out.println(String.format("DEF: %d", defense));
  }
  
  public String attack() {
    return String.format("%s swings his weapon", name);
  }
  
  public String defend() {
    return String.format("%s raises his shield", name);
  }
  
}