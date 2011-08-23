package distanceFinder;
/* Distance Finder
 * by 212014 P2
 * DOM 12/2/09 */

//takes a velocity variable in its constructor and has method range
//which accepts an angle to calculate the distance of a projectile
//launched at that velocity and range
public class DistanceFinder {
  //vars
  double velocity;
  
  //constructor
  public DistanceFinder(double vel) throws VelocityOutOfRangeException{
    //throws error if velocity is out of range
    if (vel<0 || vel>50) {
      throw new VelocityOutOfRangeException("velocity not within 0-50 inclusive");
    }
    velocity=vel;
  }
  
  //calculates range
  public double range(double angle) {
    angle=((angle%360)+360)%360;
    System.out.println(angle);
    return (2*Math.pow(velocity,2)*Math.sin(angle*Math.PI/180)*Math.cos(angle*Math.PI/180))/9.8;
  }
}