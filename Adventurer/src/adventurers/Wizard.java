package adventurers;
import implemented.*;
public class Wizard extends Adventurer {
  private int mana;
  
  public Wizard() {
    super();
    System.out.println("Filling Mana Power...\n");
    mana=ScoreGenerator.generate();
  }
  
  public void display() {
    super.display();
    System.out.println(String.format("MANA: %d", mana));
  }
  
  public String attack() {
    return String.format("%s casts a spell", name);
  }
  
  public String defend() {
    return String.format("%s casts a shield", name);
  }
  
}