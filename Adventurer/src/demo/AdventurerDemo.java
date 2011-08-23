/*
	Demonstrates the use of Adventurer and its subclasses
*/
package demo;
import adventurers.*;

public class AdventurerDemo{

	public static void main(String args[]) {
		
		Adventurer [ ] theParty = new Adventurer [2];
		
		Wizard Merlin = new Wizard();
	    Fighter Joe = new Fighter();
	    
	    theParty[0] = Merlin;
	    theParty[1] = Joe;
	    
	    System.out.println ();
	    System.out.println("DISPLAY OF THE PARTY");
	    for (int i = 0; i < theParty.length; i++)
	    	theParty[i].display();
	    
	    System.out.println ();
	    System.out.println("THE PARTY ATTACKS");
	    for (int i = 0; i < theParty.length; i++)
	    	System.out.println(theParty[i].attack());
	    	
	   	System.out.println ();
	    System.out.println("THE PARTY DEFENDS");
	    for (int i = 0; i < theParty.length; i++)
	    	System.out.println (theParty[i].defend());
	    	
	

	}
}
			
			
	
