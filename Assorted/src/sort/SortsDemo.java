package sort;
/*

                SortsDemo.java
                Allows user to sort according to a set of different sorting algorithms

 */

  public class SortsDemo{

 
  public static void main(String args[]) {

               
    int [] nums = {3,1,2,4,0};
    // you will change these values for different tests
                                   
    System.out.println ("Selection Sort: ");
    Sorts.selectionSort(nums);
    
    int [] nums2 = {3,1,2,4,0};
    // you may find it easier to comment out 
    // so you only see one result at a time. . . 
                                
    System.out.println("Insertion Sort: " );
    Sorts.insertionSort(nums2);

        }

}
