package swap;

class SwapTester {
	
	/**
	 * Method main
	 *
	 *
	 * @param args
	 *
	 */
	public static void main(String[] args) {
		
		int num1 = 1, num2 = 2;
		
		Integer intObj1 = new Integer (1);
		Integer intObj2 = new Integer (2);
		
		System.out.println ("num1 before swap: " + num1);
		System.out.println ("num2 before swap: " + num2);
		System.out.println ("intObj1 before swap: " + intObj1);
		System.out.println ("intObj2 before swap: " + intObj2);
		
		SwapTools.swap (num1, num2);
		SwapTools.swap (intObj1, intObj2);
		
		System.out.println ("\n***SWAPPING***");
		
		System.out.println ("num1 after swap: " + num1);
		System.out.println ("num2 after swap: " + num2);
		System.out.println ("intObj1 after swap: " + intObj1);
		System.out.println ("intObj2 after swap: " + intObj2);
		
		
	}	
}
