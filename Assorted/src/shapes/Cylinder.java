package shapes;
import java.text.DecimalFormat;

public class Cylinder implements Solid, Comparable<Solid> {
  private double h;
  private double r;
  
  public Cylinder(double h, double r) {
    this.h=h;
    this.r=r;
  }
  public double volume() {
    return Math.PI*Math.pow(r,2)*h;
  }
  public double surfaceArea() {
    return 2*Math.PI*Math.pow(r,2)+2*Math.PI*r*h;
  }
  public void displayDimensions() {
    DecimalFormat dec = new DecimalFormat("0.00");
    System.out.println(String.format("Radius: %s",dec.format(r)));
    System.out.println(String.format("Height: %s",dec.format(h)));
  }
  public int compareTo(Solid s) {
    if (Math.abs(volume()-s.volume())<.000001) return 0;
    if (volume()>s.volume()) return 1;
    return -1;
  }
}