package faces;
//********************************************************************
//  HappyFace.java       Author: Mr. M
//
//  Demonstrates a yellow smiley face
//********************************************************************

import javax.swing.JApplet;
import java.awt.*;
//import java.awt.

public class HappyRobo extends JApplet
{
   
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int xPos;
  private int yPos;
  private int size;
  private Color faceColor;
  private Color eyeColor;
  private Color mouthColor;
  
  public HappyRobo (int x, int y, int s, Color face, Color eyes, Color mouth)
  {
    xPos = x;
    yPos = y;
    size = s;
    faceColor = face;
    eyeColor = eyes;
    mouthColor = mouth;
  }
  
   //-----------------------------------------------------------------
   //  
   //-----------------------------------------------------------------
   public void draw (Graphics page)
   {
     int rightEyeX, leftEyeX; // the center of each eye on the horizontal plane
     int eyeY; // the center of both eyes on the vertical plane
     
      page.setColor (faceColor);
      page.fillRect (xPos, yPos, size, size);    // circle
      
      
      page.setColor (eyeColor);
      
      rightEyeX = xPos + (size / 3) - 1;
      leftEyeX = xPos + (2 * size /3) - 1;
      
      eyeY = yPos + (size / 3);
      
      page.fillOval (rightEyeX, eyeY, 3, 3); // the right eye
      page.fillOval (leftEyeX, eyeY, 3, 3); // the left eye
      
      page.setColor (mouthColor);
      
      int mouthX = rightEyeX - 5;
      int mouthLength = 5 + (size / 3) + 5;
      
      int mouthY = yPos + size / 2;
      int mouthHeight = size / 4;
      
      page.drawArc (mouthX, mouthY, mouthLength, mouthHeight, 180, 180);
      
   }
}
