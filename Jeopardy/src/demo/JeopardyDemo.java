package demo;

import java.awt.*;
import javax.swing.*;

public class JeopardyDemo
{
	public static void main (String [] args)
	{
		final Dimension SIZE = new Dimension(200, 100);
		final String[] titles = {"Column One", "Column Two", "Column Three", "Column Four", "Column Five"};
		
		JFrame frame = new JFrame ("Jeopardy Demo");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		JPanel base = new JPanel();
		base.setLayout(new GridLayout(6,5));

		JLabel[] labels = new JLabel[titles.length];
		for (int i=0;i<labels.length;i++) {
			labels[i]=new JLabel(titles[i]);
			labels[i].setHorizontalAlignment(SwingConstants.CENTER);
			labels[i].setPreferredSize(SIZE);
			labels[i].setBorder(BorderFactory.createRaisedBevelBorder());
			base.add(labels[i]);
		}

		JButton[] buttons = new JButton[25];
		for (int i=0;i<buttons.length;i++) {
			buttons[i]=new JButton(String.format("Button %d", i+1));
			buttons[i].setPreferredSize(SIZE);
			base.add(buttons[i]);
		}

		frame.add(base);
		frame.pack();
		frame.setVisible(true);


	}

}



