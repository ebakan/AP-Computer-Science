package nightSky;
import javax.swing.JApplet;


import java.awt.*;
import java.util.Random;

public class NightSky extends JApplet
{
	private static final long serialVersionUID = 1L;

	public void paint (Graphics page) {

		final int X_DIMENSION = 900;
		final int Y_DIMENSION = 400;
		final int GROUND = 75;
		final int COUNT = 100;
		final int MINX = 100;
		final int MAXX = 300;
		final int MINY = 100;
		final int MAXY = 300;
		final int WINDOWDIM = 10;
		final double WINDOWCHANCE = .75;
		final Color SKYCOLOR = Color.blue;
		final Color GROUNDCOLOR = Color.gray;
		final Color BORDERCOLOR = Color.white;

		Building[] bArray = new Building[COUNT];
		Random rand = new Random();

		page.setColor(SKYCOLOR);
		page.fillRect(0,0,X_DIMENSION,Y_DIMENSION);

		page.setColor(GROUNDCOLOR);
		page.fillRect(0,Y_DIMENSION-GROUND, X_DIMENSION, GROUND);

		for (int i=0;i<COUNT;i++) {
			int width = rand.nextInt(MAXX-MINX)+MINX;
			int height = rand.nextInt(MAXY-MINY)+MINY;

			bArray[i]=new Building(rand.nextInt(X_DIMENSION-width),
					Y_DIMENSION-GROUND-height,
					width,height,
					WINDOWDIM,
					WINDOWCHANCE,
					BORDERCOLOR,
					new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
		}

		for (int i=0;i<COUNT;i++) {
			bArray[i].draw(page);
		}
	}
}