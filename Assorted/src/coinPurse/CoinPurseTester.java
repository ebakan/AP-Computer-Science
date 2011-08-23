package coinPurse;
/**
 * @(#)CoinPurseTester.java
 *
 *
 * @author 
 * @version 1.00 2008/1/22
 */
import java.util.ArrayList;

public class CoinPurseTester {
        
    public static void main(String[] args) {
        
        ArrayList <String> coins = new ArrayList <String>();
        coins.add("Dime");
        coins.add("Nickel");
        coins.add ("Dime");
        coins.add("Penny");
        
        CoinPurse thePurse = new CoinPurse (coins);
        
        System.out.println (thePurse);
        
        thePurse.reverse();
        
        System.out.println (thePurse);
        
    }
}
