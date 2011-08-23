package actors;
import info.gridworld.actor.*;

public class Fire extends Actor {
  private int intensity;
  public final double DARKENING_FACTOR=.05;
  
  public Fire() {
    intensity=5;
  }
  
  @Override
public void act() {
    if (intensity--==0) removeSelfFromGrid();
    else setColor(getColor().darker());
  }
}
