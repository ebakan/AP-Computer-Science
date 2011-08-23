//ArrayUtilitiesClient by 212014 P2
//DOM 1/11/10

package arrayUtilities;

import java.util.Random;
import java.util.Scanner;

//Demonstrates the ArrayUtilities class
public class ArrayUtilitiesClient {
  public static void main (String[] args) {
    
    //objects
    Random rand = new Random();
    Scanner input = new Scanner(System.in);
    
    //random int array
    int[] vals = new int[10];
    for (int i=0;i<vals.length;i++) vals[i]=rand.nextInt(10);
    
    //display
    System.out.print("Array before reversal: ");
    ArrayUtilities.display(vals);
    
    //reverse
    System.out.println("Array being reversed . . .");
    ArrayUtilities.reverse(vals);
    System.out.print("Array after reversal: ");
    ArrayUtilities.display(vals);
    
    //getHigh
    System.out.println(String.format("Highest value in the array: %d",ArrayUtilities.getHigh(vals)));    
    
    //search
    System.out.println("Please enter key value:");
    int key = input.nextInt();    
    int pos = ArrayUtilities.search(vals,key);
    if (pos==-1) System.out.println(String.format("Key %d not found.",key));
    else System.out.println(String.format("First instance of the value %d is found in position %d", key, pos));
    
    //removeLowScore
    System.out.println("Removing lowest value . . .");
    System.out.print("The new array, with low value removed: ");
    ArrayUtilities.display(ArrayUtilities.removeLowScore(vals));
    
  }
}