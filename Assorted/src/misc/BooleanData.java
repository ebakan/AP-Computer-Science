package misc;
/*
	Demonstrates use of boolean data type
*/

import java.util.Random;

public class BooleanData {

	public static void main(String args[]) {
		
		
		final int OURSCORE =  5;
		int playerScore;
		boolean isGreater;
		Random generator = new Random();
		
		playerScore = generator.nextInt(10);
		
		isGreater  =  playerScore > OURSCORE;
		
		System.out.println("Your score: " + playerScore);
		if (isGreater)
			System.out.println("Congratulations.  Your number is higher than the previous score.");
	
	}
}
