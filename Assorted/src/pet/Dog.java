package pet;
public class Dog extends Pet {
  private int weight;
  public Dog(String name, int weight) {
    super(name);
    this.weight=weight;
  }
  public int getWeight() {
    return weight;
  }
  public String toString() {
    return String.format("Dog %s weighs %d pounds", getName(), weight);
  }
  public String speak() {
    return "WOOF WOOF";
  }
  public String move() {
    return "Waddles along";
  }
}