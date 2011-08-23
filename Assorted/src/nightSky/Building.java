package nightSky;
import javax.swing.JApplet;
import java.awt.*;
import java.util.Random;

public class Building extends JApplet {

	private static final long serialVersionUID = 1L;
	private int xpos;
	private int ypos;
	private int xdim;
	private int ydim;
	private int windowdim;
	private double windowchance;
	private Color bordercolor;
	private Color buildingcolor;

	public Building (int x, int y, int width, int height, int wdim, double wchance, Color border, Color building) {
		xpos=x;
		ypos=y;
		xdim=width;
		ydim=height;
		windowdim=wdim;
		windowchance=wchance;
		bordercolor=border;
		buildingcolor=building;
	}

	public void draw (Graphics page)
	{
		Random rand = new Random();

		//draw rectangle
		page.setColor(buildingcolor);
		page.fillRect(xpos,ypos,xdim,ydim);
		page.setColor(bordercolor);
		page.drawRect(xpos,ypos,xdim,ydim);

		//draw windows
		for (int column=0;column<xdim/windowdim/2;column++) {
			for (int row=0;row<ydim/windowdim/2;row++) {
				if (rand.nextDouble()<=windowchance) {
					page.setColor(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
					page.fillRoundRect(xpos+column*windowdim*2+windowdim/2,ypos+row*windowdim*2+windowdim/2,windowdim,windowdim,windowdim/5,windowdim/5);
				}
			}
		}

	}
}
