package jumper;
import snake.SnakeBug;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
public class JumperRunner {
  public static Jumper jumper = new Jumper();
  public static SnakeBug snake1 = new SnakeBug();
  public static SnakeBug snake2 = new SnakeBug();
  public static SnakeBug snake3 = new SnakeBug();
  public static SnakeBug snake4 = new SnakeBug();
  public static ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(19, 19));
  public static void main (String[] args) {
    world.add(new Location(9,9), jumper);
    world.add(new Location(18,18), snake1);
    world.add(new Location(18,0), snake2);
    world.add(new Location(17,17), snake3);
    world.add(new Location(17,1), snake4);
    world.show();
    java.awt.KeyboardFocusManager.getCurrentKeyboardFocusManager()
      .addKeyEventDispatcher(new java.awt.KeyEventDispatcher() {
      public boolean dispatchKeyEvent(java.awt.event.KeyEvent event) {
        String key = javax.swing.KeyStroke.getKeyStrokeForEvent(event).toString();
        if (key.equals("pressed UP"))
          snake1.setDirection(0);
        if (key.equals("pressed RIGHT"))
          snake1.setDirection(90);
        if (key.equals("pressed DOWN"))
          snake1.setDirection(180);
        if (key.equals("pressed LEFT"))
          snake1.setDirection(270);
        if (key.equals("pressed W"))
          snake2.setDirection(0);
        if (key.equals("pressed D"))
          snake2.setDirection(90);
        if (key.equals("pressed S"))
          snake2.setDirection(180);
        if (key.equals("pressed A"))
          snake2.setDirection(270);
        if (key.equals("pressed I"))
          snake3.setDirection(0);
        if (key.equals("pressed L"))
          snake3.setDirection(90);
        if (key.equals("pressed K"))
          snake3.setDirection(180);
        if (key.equals("pressed J"))
          snake3.setDirection(270);
        if (key.equals("pressed T"))
          snake4.setDirection(0);
        if (key.equals("pressed H"))
          snake4.setDirection(90);
        if (key.equals("pressed G"))
          snake4.setDirection(180);
        if (key.equals("pressed F"))
          snake4.setDirection(270);
        return true;
      }
    });
  }
}