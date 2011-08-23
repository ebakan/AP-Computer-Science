package misc;
import java.util.ArrayList;
public class ArrayListTester {
  public static void main (String[] args) {
    ArrayList<Integer> roster = new ArrayList<Integer>();
    roster.add(1);
    roster.add(2);
    roster.add(3);
    roster.get(1);
    for (int i=0;i<roster.size();i++) System.out.println(roster.get(i));
    System.out.println(roster.remove(1));
  }
}