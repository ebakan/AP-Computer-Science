package grid;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

public class GridClient {
  public static void main (String[] args) {
    Grid grid = new Grid(10,10);
    Random rand = new Random();
    Scanner inputStr = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    DecimalFormat dec = new DecimalFormat("0.00");
    for (int i=0;i<grid.getRows();i++) for (int j=0;j<grid.getColumns();j++) grid.editVal(rand.nextDouble()*100,i,j);
    System.out.println("A 10x10 grid has been filled with random values.");
    System.out.println();
    grid.display();
    System.out.println();
    
    char answer = 'a';
    while (answer=='a' || answer=='b' || answer=='c') {
      System.out.println("Please select an option:\nA) Get sum of row\nB) Get sum of column\nC) Get sum of grid\nElse: exit");
      answer = Character.toLowerCase(inputStr.nextLine().charAt(0));
      if (answer=='a') {
        int row = -1;
        while (row<0 || row>9) {
          System.out.println("Which row? (0-9)");
          row = inputInt.nextInt();
          if (row<0 || row>9) System.out.println("Not a valid choice. Please try again.");
        }
        System.out.println(String.format("The sum of row %d is %s\n", row, dec.format(grid.sumRow(row))));
      } else if (answer=='b') {
        int column = -1;
        while (column<0 || column>9) {
          System.out.println("Which column? (0-9)");
          column = inputInt.nextInt();
          if (column<0 || column>9) System.out.println("Not a valid choice. Please try again.");
        }
        System.out.println(String.format("The sum of column %d is %s\n", column, dec.format(grid.sumColumn(column))));
      } else if (answer=='c'){
        System.out.println(String.format("The sum of the entire grid is %s\n", dec.format(grid.sumGrid())));
      } else {
        System.out.println("Goodbye.");
      }
    }
  }
}