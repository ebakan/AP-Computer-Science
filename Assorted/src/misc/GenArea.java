package misc;
import java.util.Scanner;

public class GenArea {
  
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the radius of the circle? ");
        float radius=sc.nextFloat();

        System.out.println("The circle has an area of " + Math.PI*Math.pow(radius,2) + " units."); 

    }

}