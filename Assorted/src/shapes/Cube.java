package shapes;
import java.text.DecimalFormat;

public class Cube implements Solid, Comparable<Solid> {
  private double side;
  
  public Cube(double side) {
    this.side=side;
  }
  public double volume() {
    return Math.pow(side,3);
  }
  public double surfaceArea() {
    return Math.pow(side,2)*6;
  }
  public void displayDimensions() {
    DecimalFormat dec = new DecimalFormat("0.00");
    System.out.println(String.format("Side: %s",dec.format(side)));
  }
  public int compareTo(Solid s) {
    if (Math.abs(volume()-s.volume())<.000001) return 0;
    if (volume()>s.volume()) return 1;
    return -1;
  }
}