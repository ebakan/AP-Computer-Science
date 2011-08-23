package visibleSearches;
//********************************************************************
//  Searches.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the linear and binary search algorithms.
//********************************************************************

public class VisibleSearches
{
	//-----------------------------------------------------------------
	//  Searches the array of integers for the specified element using
	//  a linear search. The index where the element was found is
	//  returned, or -1 if the element is not found.
	//-----------------------------------------------------------------
	public static int linearSearch (int[] numbers, int key)
	{
		int compares = 0;
		for (int index = 0; index < numbers.length; index++)
		{
			System.out.print ("Comparison # " + (index + 1) + ": ");
			System.out.println ("Comparing " + key + " to element " + index + " with value " + numbers [index]);
			compares++;
			if (key == numbers[index])
			{
				return index;
			}

		}
		return -1;
	}

	//-----------------------------------------------------------------
	//  Searches the array of integers for the specified element using
	//  a binary search. The index where the element was found is
	//  returned, or -1 if the element is not found.
	//  NOTE: The array must be sorted!
	//-----------------------------------------------------------------
	public static int binarySearch (int[] numbers, int key)
	{
		int low = 0, high = numbers.length-1, middle = (low + high) / 2;
		int compares = 0;

		while (numbers[middle] != key && low != high) {
			for (int i = low; i <= high; i++)
				System.out.print (numbers[i] + "\t");
			System.out.println();
			for (int i = low; i <= high; i++)
				System.out.print (i + "\t");
			System.out.println();
			for (int i = low; i <= high; i++)
			{
				compares++;
				if (i == low) System.out.print("l");       
				if (i== middle) System.out.print("m");        
				if (i == high) System.out.print("h");        
				System.out.print("\t");        
			}
			System.out.println(); 

			if (key < numbers[middle]) {
				high = middle - 1;
				System.out.println("Key is less than middle.");
			}
			else {
				low = middle + 1;
				System.out.println("Key is higher than middle.");
			}
			middle = (low + high) / 2;
		}
		if (numbers[middle] == key) return middle;
		else return -1;
	}
}
