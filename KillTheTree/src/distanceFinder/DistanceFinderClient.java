package distanceFinder;
/* Distance Finder Client
 * by 212014 P2
 * DOM 12/2/09 */

import java.util.Scanner;

//demonstrates the distanceFinder class
public class DistanceFinderClient {
  
  public static void main(String[] args) throws VelocityOutOfRangeException{
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Velocity:");
    DistanceFinder dfind = new DistanceFinder(input.nextDouble());
    System.out.println("Angle:");
    System.out.println(dfind.range(input.nextDouble()));
  }
}
    