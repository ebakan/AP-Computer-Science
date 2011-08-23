package faces;
//********************************************************************
//  Faces.java       Author: Mr. M
//
//  Demonstrates a basic applet.
//********************************************************************

import javax.swing.JApplet;



import java.awt.*;
//import java.awt.
import java.util.Random;

public class Faces extends JApplet
{
   //-----------------------------------------------------------------
   //  Draws a variety of HappyFaces
   //-----------------------------------------------------------------
  
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void paint (Graphics page)
   {
     final int X_DIMENSION = 200;
     final int Y_DIMENSION = 200;
     final int SIZE = 60;
     final int HAPPY_COUNT = 1;
     final boolean COLOR_ARRAY = true; /*Set false to randomly select a color from an array of
     *                                   preset colors or true to generate random RBG values */
     final Color[] colors = {Color.black, Color.blue, Color.cyan, Color.darkGray, Color.gray, Color.green,
       Color.lightGray, Color.magenta, Color.orange, Color.pink, Color.red, Color.white, Color.yellow};

     Random rand = new Random();
     
     HappyFace[] happyArray = new HappyFace[HAPPY_COUNT];
     
     //Generate happy faces
     if (COLOR_ARRAY) {
       for (int i=0;i<happyArray.length;i++) {
         happyArray[i]=new HappyFace(rand.nextInt(X_DIMENSION),rand.nextInt(Y_DIMENSION), SIZE,
                                     colors[rand.nextInt(colors.length)], colors[rand.nextInt(colors.length)],
                                     colors[rand.nextInt(colors.length)]);
                                     
       }
     } else {
       for (int i=0;i<happyArray.length;i++) {
         happyArray[i]=new HappyFace(rand.nextInt(X_DIMENSION),rand.nextInt(Y_DIMENSION), SIZE, 
                                     new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)),
                                     new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)),
                                     new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255)));
                                     
       }
     }
     
     setBackground (Color.black);
     
     //Draw happy faces     
     for (int i=0;i<happyArray.length;i++) {
       happyArray[i].draw(page);
     }
   }
}
