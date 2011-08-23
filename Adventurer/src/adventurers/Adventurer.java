package adventurers;
import java.util.Scanner;
import implemented.*;
public class Adventurer implements Battler {
  protected int strength, intelligence, wisdom, dexterity, charisma, constitution;
  protected String name;
  protected Weapon weapon;
  
  public Adventurer() {
    Scanner strScan = new Scanner(System.in);
    Scanner intScan = new Scanner(System.in);
    
    System.out.println("Creating new Adventurer\n");
    
    System.out.println("Filling Strength...\n");
    strength=ScoreGenerator.generate();
    
    System.out.println("Filling Intelligence...\n");
    intelligence=ScoreGenerator.generate();
    
    System.out.println("Filling Wisdom...\n");
    wisdom=ScoreGenerator.generate();
    
    System.out.println("Filling Dexterity...\n");
    dexterity=ScoreGenerator.generate();
    
    System.out.println("Filling Charisma...\n");
    charisma=ScoreGenerator.generate();
    
    System.out.println("Filling Constitution...\n");
    constitution=ScoreGenerator.generate();
    
    System.out.println("What is the adventurer's name?");
    name = strScan.nextLine();
    
    System.out.println("What is the adventurer's weapon's name?");
    String weaponName = strScan.nextLine();
    
    System.out.println("What is the adventurer's weapon's damage?");
    int weaponDamage = intScan.nextInt();
    
    weapon = new Weapon(weaponName, weaponDamage);
    
    System.out.println();   
    display();
  }
  
  public int getSTR() {
    return strength;
  }
  
  public int getINT() {
    return intelligence;
  }
  
  public int getWIS() {
    return wisdom;
  }
  
  public int getDEX() {
    return dexterity;
  }
  
  public int getCHR() {
    return charisma;
  }
  
  public int getCON() {
    return constitution;
  }
  
  public String attack() {
    return String.format("%s attacks", name);
  }
  
  public String defend() {
    return String.format("%s defends", name);
  }
  
  public void display() {
    System.out.println(String.format("Adventurer %s", name));
    System.out.println(String.format("STR: %d", strength));
    System.out.println(String.format("INT: %d", intelligence));
    System.out.println(String.format("WIS: %d", wisdom));
    System.out.println(String.format("DEX: %d", dexterity));
    System.out.println(String.format("CHR: %d", charisma));
    System.out.println(String.format("CON: %d", constitution));
    System.out.println(String.format("Weapon: %s", weapon.getName()));
  }
}