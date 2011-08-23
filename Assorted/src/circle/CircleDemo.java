package circle;
/**
 * @(#)Circles.java
 *
 * CircleDemo Applet application
 *
 * @author 
 * @version 1.00 2008/11/17
 */

import java.awt.*;
import java.applet.*;

public class CircleDemo extends Applet {
  
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Circle c1, c2, c3, c4;
  
  public void init() {
    c1 = new Circle (25, Color.red, 25, 25);
    c2 = new Circle (35, Color.blue, 100, 50);
    c3 = new Circle (45, Color.green, 150, 150);
    c4 = new Circle (10, Color.black, 175, 30);
    // (int size, Color shade, int upperX, int upperY)
  }
  
  public void paint(Graphics g) {
    
    setBackground(Color.yellow);
    c1.draw(g);
    c2.draw(g);
    c3.draw(g);
    c4.draw(g);    
  }
}