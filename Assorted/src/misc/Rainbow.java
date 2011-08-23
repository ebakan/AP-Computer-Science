package misc;
/* Rainbow Project
 * by 212014
 * Period 2
 * Last edited 9/16/09
 * 
 * Takes the distance to the rainbows in kilometers and
 * outputs the height of two rainbows in meters, given
 * two angle measurements.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Rainbow {
  public static void main (String[] args) {
    
    //Creates instances of classes needed
    Scanner input = new Scanner(System.in);
    DecimalFormat dec = new DecimalFormat("0.0000");  
    
    //Declares variables
    
    //Declares and initializes angle measurements
    final double ANGLE_ONE_DEG = 42.3333;
    final double ANGLE_TWO_DEG = 52.25;
    
    //Converts degrees to radians
    final double ANGLE_ONE_RAD = ANGLE_ONE_DEG * (Math.PI / 180);
    final double ANGLE_TWO_RAD = ANGLE_TWO_DEG * (Math.PI / 180);
    
    //Initializes input/output variables
    double distance;
    double out1;
    double out2;
    
    //Get input
    System.out.println("What is the distance, in kilometers to the rainbow?");
    distance = 0;
    try {
      distance = input.nextDouble();
    }
    
    //Catch inavlid input
    catch(java.util.InputMismatchException e){
      System.out.println("BOOO! YOU TRIED TO BREAK MY PROGRAM! BYE BYE!");
      System.exit(0);
    }
    
    //Generate output values
    out1 = Math.tan(ANGLE_ONE_RAD) * distance * 1000;
    out2 = Math.tan(ANGLE_TWO_RAD) * distance * 1000;
    
    //Outputs output values rounded to 4 decimal places
    System.out.println("The distance to the first rainbow: " + dec.format(distance) + " kilometers.");
    System.out.println("The first rainbow is:  " + dec.format(out1) + " meters tall.");
    System.out.println("The second rainbow is: " + dec.format(out2) + " meters tall.");
  }
}