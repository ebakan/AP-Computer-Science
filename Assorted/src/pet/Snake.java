package pet;
public class Snake extends Pet {
  private int weight;
  public Snake(String name, int weight) {
    super(name);
    this.weight=weight;
  }
  public int getWeight() {
    return weight;
  }
  public String toString() {
    return String.format("Snake %s weighs %d pounds", getName(), weight);
  }
  public String speak() {
    return "HISSSSSSS";
  }
  public String move() {
    return "Slithers along";
  }
}