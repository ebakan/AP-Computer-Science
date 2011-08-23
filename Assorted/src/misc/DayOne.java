package misc;
/*
DayOne.java
Casey McCullough
Last modified 8/26/07
Calculates the number of days the user has been alive.
*/

import java.util.Scanner; // we'll explain this later . . . 

public class DayOne {

    public static void main (String[] args){

        
        long years; // variable will store the user's age in years. Call it what you like.
        Scanner sc = new Scanner(System.in);
        years = 0; // this is called "initializing" the variable.  Is it necessary here? 

        System.out.println("\tThis is a test.");
        System.out.println("\tThis is my first Java program.");

        System.out.println("\tHow old are you? ");
        years = sc.nextLong(); // This would be used to get user input

        System.out.println("\tYou are " + 365 * 24 * years + " days old"); 

    } // End main

} // End DayOne class