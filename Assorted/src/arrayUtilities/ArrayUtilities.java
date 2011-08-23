//ArrayUtilities by 212014 P2
//DOM 1/11/10

package arrayUtilities;

import java.util.ArrayList;

//Class of various utilities to be used on integer arrays
public class ArrayUtilities {

	// shows all values in the array with a space in between
	public static void display(int[] array) {
		String out = "";
		for (int i = 0; i < array.length; i++) {
			out += array[i];
			if (i != array.length - 1)
				out += " ";
		}
		System.out.println(out);
	}

	// reverses the values within an array (DOES NOT DISPLAY THEM!)
	public static void reverse(int[] array) {
		int[] reversed = new int[array.length];
		for (int i = 0; i < array.length; i++)
			reversed[i] = array[array.length - i - 1];
		for (int i = 0; i < array.length; i++)
			array[i] = reversed[i];
	}

	// returns highest value in the array
	public static int getHigh(int[] array) {
		int high = array[0];
		for (int i : array)
			if (i > high)
				high = i;
		return high;
	}

	// returns first position in which key value is found in array
	// returns -1 if the key value is not found.
	public static int search(int[] array, int val) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == val)
				return i;
		return -1;
	}

	// finds a position in which the lowest value of the array is found
	private static int findLowPos(int[] array) {
		int low = array[0];
		for (int i : array)
			if (i < low)
				low = i;
		return low;
	}

	// returns the same values in the same order except that the lowest has been
	// removed
	public static int[] removeLowScore(int[] array) {
		int low = findLowPos(array);
		ArrayList<Integer> outList = new ArrayList<Integer>();
		for (int i : array)
			if (i != low)
				outList.add(i);
		outList.trimToSize();
		int[] outArray = new int[outList.size()];
		for (int i = 0; i < outArray.length; i++)
			outArray[i] = outList.get(i);
		return outArray;
	}
}