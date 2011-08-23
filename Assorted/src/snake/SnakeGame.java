package snake;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
/**
 * This is a clone of the classic Snake game (a.k.a. Nibbles).
 * The GUI is the standard for GridWorld and the snake
 * is controlled by the arrow keys on the keyboard.
 * (the code is provided for KeyEvent handling in the main)
 */
public class SnakeGame {
  /**
   * ActorWorld variable used for GUI...
   * Initialized to 19x19 Grid for aesthetic viewing.
   */
  public static ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(19, 19));
  /**
   * The only Actor that actually moves in the game.
   * Its direction is controlled by the keyboard arrow keys.
   */
  public static SnakeBug head = new SnakeBug();
  /**
   * Handles game simulation with one bug whose moves
   * NOTE: YOU DO NOT NEED TO WRITE ANY CODE IN THE main
   */
  public static void main(String[] args) {
    head.setDirection(0);//facing North
    world.add(new Location(17, 9), head); //bottom middle of grid
    head.newFlower();//<==UNCOMMENT AFTER newFlower HAS BEEN WRITTEN!
    java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager()
      .addKeyEventDispatcher(new java.awt.KeyEventDispatcher() {
      public boolean dispatchKeyEvent(java.awt.event.KeyEvent event) {
        String key = javax.swing.KeyStroke.getKeyStrokeForEvent(event).toString();
        if (key.equals("pressed UP"))
          head.setDirection(0);
        if (key.equals("pressed RIGHT"))
          head.setDirection(90);
        if (key.equals("pressed DOWN"))
          head.setDirection(180);
        if (key.equals("pressed LEFT"))
          head.setDirection(270);
        return true;
      }
    });
    world.show();
  }
}