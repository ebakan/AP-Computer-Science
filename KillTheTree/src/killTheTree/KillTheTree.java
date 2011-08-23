package killTheTree;
/* Kill The Tree
 * by 212014 P2
 * DOM 12/2/09 */

import histogramMaker.HistogramMaker;
import histogramMaker.ScaleOutOfRangeException;

import java.util.Scanner;
import java.text.DecimalFormat;

import distanceFinder.DistanceFinder;
import distanceFinder.VelocityOutOfRangeException;



//displays a histogram showing the range of a projectile launched
//at a given velocity over a variety of angles
public class KillTheTree {
  
  public static void main(String[] args) throws ScaleOutOfRangeException, VelocityOutOfRangeException{
    //objects
    Scanner input = new Scanner(System.in);
    DecimalFormat dec = new DecimalFormat("0.00");
    HistogramMaker histo = new HistogramMaker();
    DistanceFinder ranger;
    
    //get velocity
    System.out.println("Please enter the velocity of the water balloon: (m/s):");
    double velocity = input.nextDouble();
    
    //ensure acceptable velocity values as defined by instructions
    while (velocity<0 || velocity>50) {
      System.out.println("The velocity must be within 0-50 m/s inclusive.");
      System.out.println("Please enter the velocity of the water balloon: (m/s):");
      velocity = input.nextDouble();
    }
    
    //distanceFinder
    ranger = new DistanceFinder(velocity);
    
    //set up print header
    System.out.println("                               1         1         2         2 Range\n"+
                       "                     5         0         5         0         5 in\n"+
                       "Angle       _________0_________0_________0_________0_________0 Meters");
    
    //checking for max vals
    double maxval = 0;
    double maxdeg = 0;
    
    for (int i=0;i<=90;i+=5) {
      double val = ranger.range(i);
      //checking for max vals
      if (val>maxval) {
        maxdeg=i;
        maxval=val;
      }
      //print line
      System.out.print(i+"\t  ");
      histo.makeLine(val);
    }
    //max vals
    System.out.println("RESULTS: The best range was achieved using a trajectory of "+maxdeg+" degrees.");
    System.out.println("This yielded a potential range of "+dec.format(maxval)+" meters.");
  }
}
/*
public class KillTheTree {
  public static String stars (double n) {
    long starnum = Math.round(n/5);
    String out="";
    for (int i=0;i<starnum;i++) out+='*';
    return out;
  }
  
  public static int indexOfMax (double[] vals) {
    double max = 0;
    int index = 0;
    for (int i=0;i<vals.length;i++) {
      if (vals[i]>max) {
        max=vals[i];
        index=i;
      }
    }
    return index;
  }
  
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    DecimalFormat dec = new DecimalFormat("0.00");
    
    int[] degrees = new int[19];
    double[] vals = new double[19];
    String[] stars = new String[19];
    
    System.out.println("Please enter the velocity of the water balloon: (m/s):");
    double velocity = input.nextDouble();
    
    for (int i=0;i<=90;i+=5) degrees[i/5]=i;
    for (int i=0;i<19;i++) vals[i]=(2*Math.pow(velocity,2)*Math.sin(degrees[i]*Math.PI/180)*Math.cos(degrees[i]*Math.PI/180))/9.8;
    for (int i=0;i<19;i++) stars[i]=stars(vals[i]);
    
    System.out.println("                               1         1         2         2 Range\n"+
                       "                     5         0         5         0         5 in\n"+
                       "Angle       _________0_________0_________0_________0_________0 Meters");
    
    for (int i=0;i<19;i++) System.out.println(degrees[i]+"\t  "+stars[i]);
    int index = indexOfMax(vals);
    System.out.println("RESULTS: The best range was achieved using a trajectory of "+degrees[index]+" degrees.");
    System.out.println("This yielded a potential range of "+dec.format(vals[index])+" meters.");
    
  }
}*/