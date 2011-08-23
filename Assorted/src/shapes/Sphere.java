package shapes;
import java.text.DecimalFormat;

public class Sphere implements Solid, Comparable<Solid> {
  private double r;
  public Sphere(double r) {
    this.r=r;
  }
  public double volume() {
    return Math.pow(r,3)*Math.PI*4/3;
  }
  public double surfaceArea() {
    return 4*Math.PI*Math.pow(r,2);
  }
  public void displayDimensions() {
    DecimalFormat dec = new DecimalFormat("0.00");
    System.out.println(String.format("Radius: %s",dec.format(r)));
  }
  public int compareTo(Solid s) {
    if (Math.abs(volume()-s.volume())<.000001) return 0;
    if (volume()>s.volume()) return 1;
    return -1;
  }
}