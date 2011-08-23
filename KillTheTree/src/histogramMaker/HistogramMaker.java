package histogramMaker;
/* Histogram Maker
 * by 212014 P2
 * DOM 12/2/09 */

//accepts a marker and scale in its constructor and has method
//makeLine which accepts a double to print a histogram representation
//of that number
public class HistogramMaker {

	//vars
	private char marker;
	private int scale;

	//constructor
	public HistogramMaker(char mkr, int scl) throws ScaleOutOfRangeException{
		marker=mkr;
		//throws error if scale is out of range
		if (scl<1) {
			throw new ScaleOutOfRangeException("scale below 1");
		}
		scale=scl;
	}

	//default constructor
	public HistogramMaker() {
		marker='*';
		scale=5;
	}

	//modifier methods
	public void setMarker(char mkr) {
		marker=mkr;
	}

	public void setScale(int scl) throws ScaleOutOfRangeException{
		//throws error if scale is out of range
		if (scl<1) {
			throw new ScaleOutOfRangeException("scale below 1");
		}
		scale=scl;
	}

	//return methods
	public char getMarker() {
		return marker;
	}

	public int getScale() {
		return scale;
	}

	//prints out line
	public void makeLine(double num) {
		for (int i=0;i<Math.round(num/scale);i++) {
			System.out.print(marker);
		}
		System.out.println();
	}

}