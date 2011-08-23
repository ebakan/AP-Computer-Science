package grid;
import java.text.DecimalFormat;
public class Grid {
  
  private double[][] grid;
  private DecimalFormat dec = new DecimalFormat("0.00");
  
  public Grid (int rows, int columns){
    grid=new double[rows][columns];
  }
  
  public void editVal(double val, int row, int column) {
    grid[row][column]=val;
  }
  
  public int getRows () {
    return grid.length;
  }
  
  public int getColumns () {
    return grid[0].length;
  }
  
  public double getVal (int row, int column) {
    return grid[row][column];
  }
  
  public double sumRow (int row) {
    double sum = 0;
    for (double i : grid[row]) sum+=i;
    return sum;
  }
  
  public double sumColumn (int column) {
    double sum = 0;
    for (int i=0;i<grid.length;i++) sum+=grid[i][column];
    return sum;
  }
  
  public double sumGrid () {
    double sum = 0;
    for (double[] i : grid) for (double j : i) sum+=j;
    return sum;
  }
  
  public void display () {
    System.out.print('\t');
    for (int i=0;i<grid[0].length;i++) {
      System.out.print(i);
      if (i!=grid[0].length-1) System.out.print('\t');
      else System.out.print('\n');
    }
    for (int i=0;i<grid.length;i++) {
      System.out.print(i);
      for (int j=0;j<grid[i].length;j++) {
        System.out.print('\t');
        System.out.print(dec.format(grid[i][j]));
      }
      if (i!=grid[0].length-1) System.out.print('\n');
    }
    System.out.print('\n');
  }
}