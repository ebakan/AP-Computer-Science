package visibleSearches;
//********************************************************************
//  VisibleSearchesDemo.java       Author: McCullough
//
//  Demonstrates use of VisibleSearches Class
//********************************************************************

public class VisibleSearchesDemo
{
                     
   //-----------------------------------------------------------------
   //  Creates an array, fills it with various integer values,
   //  modifies one value, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      int[] evenSizedList = {4, 6, 9, 15, 15, 17, 20, 40, 50, 100};
      int[] oddSizedList = {4, 6, 9, 15, 15, 17, 20, 40, 50};
      int testValue = 50; 
      	    
      System.out.println("LINEAR SEARCH" );
      int pos = VisibleSearches.linearSearch(evenSizedList, testValue);
      
      
      if (pos == -1)
      	System.out.println ("Value " + testValue + " is not found in the array" );
      else
      	System.out.println ("Value " + testValue + " is found at position " + pos + " of the array" );
      
      System.out.println("\n\nBINARY SEARCH, EVEN" );
      pos = VisibleSearches.binarySearch(evenSizedList, testValue);
      if (pos == -1)
      	System.out.println ("Value " + testValue + " is not found in the array" );
      else
      	System.out.println ("Value " + testValue + " is found at position " + pos + " of the array" );
      
      
      System.out.println("\n\nBINARY SEARCH, ODD" );
      pos = VisibleSearches.binarySearch(oddSizedList, testValue);
      if (pos == -1)
      	System.out.println ("Value " + testValue + " is not found in the array" );
      else
      	System.out.println ("Value " + testValue + " is found at position " + pos + " of the array" );   
      
      System.out.println ();
   }
}
