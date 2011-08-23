package redditAlien;
//Eric Bakan's Reddit Alien Project
//Last Edited 9/27/09

import javax.swing.JApplet;
import java.awt.*;

public class RedditAlien extends JApplet
{

	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private Color color;

	public RedditAlien (int xinp, int yinp, Color col)
	{
		x=xinp;
		y=yinp;
		color=col;
	}

	public void draw (Graphics page)
	{
		//draw ear ovals
		page.setColor (color);
		page.fillOval(x,y+22,19,19); // l ear
		page.fillOval(x+46,y+22,19,19); // r ear

		//draw ear outlines
		page.setColor (new Color(0,0,0));
		page.drawOval(x,y+22,18,18); // l ear
		page.drawOval(x+46,y+22,18,18); // r ear

		//draw face oval
		page.setColor (color);
		page.fillOval(x+4, y+22, 57, 37); // face

		//draw face outline
		page.setColor (new Color(0,0,0));
		page.drawOval(x+4, y+22, 56, 36); // face

		//draw ball oval
		page.setColor (color);
		page.fillOval(x+46,y+6,11,11); // ball

		//draw ball outline and lines
		page.setColor (new Color(0,0,0));
		page.drawLine(x+32,y+22,x+36,y+8); // line 1
		page.drawLine(x+36,y+8,x+46,y+10); //  line 2
		page.drawOval(x+46,y+6,10,10); // ball

		//draw mouth
		page.drawArc(x+20,y+36,24,14,220,100); // mouth

		//draw eyes
		page.setColor(new Color(255,0,0));
		page.fillOval(x+18,y+32,8,8); // l eye
		page.fillOval(x+39,y+32,8,8); // r eye
	}
}
