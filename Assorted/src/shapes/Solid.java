package shapes;
// ******************************************************************
// Solid.java Author: Casey McCullough 2/25/04
// Common calculations one might do with a 3D-Solid
//
// ******************************************************************

public interface Solid
{
    public double volume ();
    // returns volume using appropriate equation
    public double surfaceArea();
    // returns surface area using appropriate equation
    public void displayDimensions();
    // displays all dimenstions on screen.
}
