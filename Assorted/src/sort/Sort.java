package sort;
public class Sort {
  
  private static void swap (int[] nums, int one, int two) {
    int temp = nums[one];
    nums[one]=nums[two];
    nums[two]=temp;
  }
  
  private static void quicksort (int[] nums, int left, int right) {
    if (right-left>0) {
      int pivot = right;
      for (int i=left;i<pivot;i++) {
        if (nums[i]>nums[pivot]) {
          swap(nums,pivot,pivot-1);          
          if (pivot!=i+1) swap(nums,i,pivot);
          pivot--;
          i--;
        }
      }
      quicksort(nums,left,pivot-1);
      quicksort(nums,pivot+1,right);
    }
  }
  
  public static void sort (int [] nums) {
    quicksort(nums,0,nums.length-1);
  }
  
  public static void display (int [] vals) {
    for (int i: vals) System.out.print(i+" ");
    System.out.println();
  }
  
  private static void swap (String[] words, int one, int two) {
    String temp = words[one];
    words[one]=words[two];
    words[two]=temp;
  }
  
  private static void quicksort (String[] words, int left, int right) {
    if (right-left>0) {
      int pivot = right;
      for (int i=left;i<pivot;i++) {
        if (words[i].compareTo(words[pivot])>0) {
          swap(words,pivot,pivot-1);          
          if (pivot!=i+1) swap(words,i,pivot);
          pivot--;
          i--;
        }
      }
      quicksort(words,left,pivot-1);
      quicksort(words,pivot+1,right);
    }
  }
  
  public static void sort (String [] words) {
    quicksort(words,0,words.length-1);
  }
  
  public static void display (String [] vals) {
    for (String i: vals) System.out.print(i+" ");
    System.out.println();
  }
  
}