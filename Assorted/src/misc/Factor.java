package misc;
/*Factoring project
 * by 212014
 * DOM 11/2/09 */

import java.util.Scanner;
import java.util.ArrayList;

//Gives the prime factors of a given number
public class Factor {
  public static ArrayList<Integer> factor (ArrayList<Integer> list, int num) {
    if (num==1) return list;
    for(int i=2;i<=num;i++) {
      if (num%i==0) {
        list.add(i);
        num/=i;
        break;
      }
    }
    return factor(list,num);
  }
  
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Number to be factored:");
    int num = input.nextInt();
    String output = "";
    ArrayList<Integer> al = new ArrayList<Integer>();
    al=factor(al,num);
    
    if (al.size()==1) {
      output+="1x"+num;
    }
    else {
      for (int i=0;i<al.size();i++) output+=al.get(i)+"x";
      output=output.substring(0,output.length()-1);
    }
    System.out.println(num+"="+output);
  }
}