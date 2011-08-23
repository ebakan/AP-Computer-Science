package snake;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import java.util.ArrayList;
import java.util.Random;

public class SnakeBug extends Bug {
  private int grow;
  private ArrayList<Location> snake;
  
  public SnakeBug() {
    grow = 4;
    snake = new ArrayList<Location>();
  }
  public void newFlower() {
    Random rand =  new Random();
    //ArrayList<Location> foo = gr.getOccupiedLocations();
//    int asdf = gr.getNumRows();
//    int row = rand.nextInt(gr.getNumRows());
//    int col = rand.nextInt(gr.getNumCols());
//    Location loc = new Location(row,col);
    Location loc = new Location(rand.nextInt(getGrid().getNumRows()), rand.nextInt(getGrid().getNumCols()));
    while (getGrid().get(loc)!=null) {
      loc = new Location(rand.nextInt(getGrid().getNumRows()), rand.nextInt(getGrid().getNumCols()));
    }
    Flower flower = new Flower(getColor());
    flower.putSelfInGrid(getGrid(),loc);
  }
  public void addRockBehindHead(Location loc) {
    Rock rock = new Rock();
    rock.putSelfInGrid(getGrid(), loc);
    snake.add(0, loc);
  }
  public void eraseTail() {
    getGrid().get(snake.get(snake.size()-1)).removeSelfFromGrid();
    snake.remove(snake.size()-1);
  }
  public void act() {
    if (canMove()) {
      if (getGrid().get(getLocation().getAdjacentLocation(getDirection())) instanceof Flower) {
        grow+=3;
        getGrid().get(getLocation().getAdjacentLocation(getDirection())).removeSelfFromGrid();
        newFlower();
      }
      Location loc = getLocation();
      move();
      addRockBehindHead(loc);
      if (grow>0) grow--;
      else eraseTail();
    } else {
//      javax.swing.JOptionPane.showMessageDialog( null, "Score: " + snake.size(), "GAME OVER!", 0);
      removeSelfFromGrid();
    }
  }
}