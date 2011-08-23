package misc;
//********************************************************************
//  ScannerDemo.java       Author: McCullough
//
//  Demonstrates the difference between addition and concatenation
// and how Java chooses which to use
//********************************************************************

public class AdditionVersusConcatenation
{
   //-----------------------------------------------------------------
   //  Prints a string and various mutations of it.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
		int num1 = 23;
		int num2 = 45;
		
		System.out.println (num1 + num2); // just ints
		
		System.out.println ("88" + "99"); // just Strings
		
		System.out.println ("23" + num2); // a mixed-mode expression
		
		System.out.println ("" + num1 + num2);
		
		System.out.println ( num1 + num2 + "");


   }
}
