package shapes;
/*
 ShapeShow.java
 Displays variety of classes that implement
 Solid interface
 
*/

import java.util.Arrays;


public class ShapeDemo {

 public static void main(String args[]) {
  
  Solid[] shapes = new Solid[5];
  
  Cube blueCube = new Cube (2.2);
  Sphere redSphere = new Sphere (3.0000000000001);
  Cylinder greenCylinder = new Cylinder (2.0, 1.0);
  Sphere purpleSphere = new Sphere (3.0);
  Cylinder orangeCylinder = new Cylinder (1.0, 2.0);
  
  shapes[0] = blueCube;
  shapes[1] = redSphere;
  shapes [2] = greenCylinder;
  shapes [3] = purpleSphere;
  shapes [4] = orangeCylinder;
  
  System.out.println ("UNSORTED SOLIDS: ");
  for (int i = 0; i < shapes.length; i++)
  {
   shapes[i].displayDimensions();
   System.out.println();
  }
  
  Arrays.sort(shapes);
 
  System.out.println ("SORTED SOLIDS: ");
  for (int i = 0; i < shapes.length; i++)
  {
   shapes[i].displayDimensions();
   System.out.println();
  }
 
 /* int result = redSphere.compareTo(purpleSphere);
  
  if (result > 0)
   System.out.println("The first Sphere is greater");
  else 
   if (result == 0)
    System.out.print("The Spheres are the same");
   else
    System.out.print ("The second Sphere is greater");
 */
  
 }
}
