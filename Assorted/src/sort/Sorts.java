package sort;
//Sorts by 212014
//DOM 3/6/10

//demonstrates selection sort and insertion sort
public class Sorts
{
  //-----------------------------------------------------------------
  // Sorts the specified array of integers using the selection
  // sort algorithm.
  //-----------------------------------------------------------------
  public static void selectionSort (int[] numbers)
  {
    int min, temp, compares=0, swaps=0;
    
    for (int index = 0; index < numbers.length-1; index++)
      // index keeps track of the spot we are currently filling
    {
      
      System.out.println(String.format("***Iteration %d", index));
      System.out.print("Number:\t\t");
      for (int i: numbers) System.out.print(i+"\t");
      System.out.println();
      System.out.print("Position:\t\t");
      for (int i=0;i<numbers.length;i++) System.out.print(i+"\t");
      System.out.println();
      System.out.println(String.format("Seeking to fill position %d", index));
      System.out.println(String.format("Seeking to fill low value among elements %d and %d", index, numbers.length-1));
      System.out.println(String.format("Number of compares necessary to find low: %d", numbers.length-1-index));      
      
      min = index;
      for (int scan = index+1; scan < numbers.length; scan++){
        compares++;;
        if (numbers[scan] < numbers[min])
          min = scan;
      }
      
      System.out.println(String.format("Low value found in element %d", min));
      
      swaps++;
      // Swap the values
      temp = numbers[min];
      numbers[min] = numbers[index];
      numbers[index] = temp;
      
      System.out.println(String.format("Swapping position %d with position %d", index, min));
      System.out.println();
    }
    System.out.println(String.format("Total swaps: %d", swaps));
    System.out.println(String.format("Total compares: %d", compares));
    System.out.println();
  }
  
  //-----------------------------------------------------------------
  // Sorts the specified array of integers using the insertion
  // sort algorithm.
  //-----------------------------------------------------------------
  public static void insertionSort (int[] numbers)
  {
    int swaps=0, compares=0;
    for (int index = 1; index < numbers.length; index++)
      // index refers to the element that is "trying to find its place"
    {
      
      int key = numbers[index];
      int position = index;
      
      System.out.print("Number:\t\t");
      for (int i: numbers) System.out.print(i+"\t");
      System.out.println();
      System.out.print("Position:\t\t");
      for (int i=0;i<numbers.length;i++) System.out.print(i+"\t");
      System.out.println();
      System.out.println();
      
      System.out.println(String.format("Value %d in position %d seeks its place", key, index));
      
      
      
      // shift larger values to the right
      while (position > 0 && numbers[position-1]>key)
      {
        compares++;
        System.out.println(String.format("--> COMPARE: is less than %d in position %d", numbers[position-1], position-1));
        swaps++;
        numbers[position] = numbers[position-1];
        System.out.println(String.format("--> SWAP: with %d", numbers[position-1]));
        position--;
        
      }
      System.out.println(String.format("--> COMPARE: is greater than %d in position %d", numbers[position], position));
      System.out.println(String.format("--> SWAP: with %d", numbers[position]));
      System.out.println(String.format("--> %d stops at position %d", key, position));
      
      if (position>0) compares++;
      
      numbers[position]=key;
      
      System.out.println();
    }
    System.out.println(String.format("Total swaps: %d", swaps));
    System.out.println(String.format("Total compares: %d", compares));
  }
}