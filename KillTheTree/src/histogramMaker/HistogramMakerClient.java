package histogramMaker;
/* Histogram Maker Client
 * by 212014 P2
 * DOM 12/2/09 */

import java.util.Scanner;

//demonstrates the HistogramMaker class
public class HistogramMakerClient {
  
  public static void main(String[] args) throws ScaleOutOfRangeException {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Character:");
    char symbol = input.next().charAt(0);
    System.out.println("Scale:");
    int scale = input.nextInt();
    
    HistogramMaker histogramer = new HistogramMaker(symbol,scale);
    
    System.out.println("Number:");
    histogramer.makeLine(input.nextDouble());
  }
}