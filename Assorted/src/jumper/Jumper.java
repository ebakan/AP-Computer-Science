package jumper;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
public class Jumper extends Bug {
  public Jumper() {
    super();
  }
  public void turn() {
    setDirection(getDirection() + Location.RIGHT);
  }
  public boolean canJump() {
    Grid<Actor> gr = getGrid();
    if (gr==null)
      return false;
    Location loc = getLocation();
    Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
    if (!gr.isValid(next))
      return false;
    Actor neighbor = gr.get(next);
    return (neighbor == null) || (neighbor instanceof Flower);
  }
  public void jump() {
    Grid<Actor> gr = getGrid();
    if (gr==null)
      return;
    Location loc = getLocation();
    Location next = loc.getAdjacentLocation(getDirection()).getAdjacentLocation(getDirection());
    if (gr.isValid(next))
      moveTo(next);
    else
      removeSelfFromGrid();
  }
  public void act() {
    if (canMove()) move();
    else if (canJump()) jump();
    else turn();
  }
      
}