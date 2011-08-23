package redditAlien;
//Eric Bakan's Reddit Alien Applet
//Last Edited 9/28/09
import javax.swing.JApplet;
import java.awt.*;
import java.util.Random;

public class Reddit extends JApplet
{
	private static final long serialVersionUID = 1L;

	public void paint (Graphics page)
	{
		final int X_DIMENSION = 600;
		final int Y_DIMENSION = 600;
		final int REDDIT_COUNT = 10;
		final boolean RAINBOW = true; //Set true to pick random face colors or false to use white

		Random rand = new Random();

		RedditAlien[] redditArray = new RedditAlien[REDDIT_COUNT];

		for(int i=0;i<redditArray.length;i++){
			Color col;
			if (RAINBOW) {
				col=new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
			} else {
				col = new Color(255,255,255);
			}
			redditArray[i]=new RedditAlien(rand.nextInt(X_DIMENSION-64),rand.nextInt(X_DIMENSION-64), col);
		}

		page.setColor(new Color(198,221,246));
		page.fillRect(0,0,X_DIMENSION,Y_DIMENSION);

		for(int i=0;i<redditArray.length;i++){
			redditArray[i].draw(page);
		}
	}
}
