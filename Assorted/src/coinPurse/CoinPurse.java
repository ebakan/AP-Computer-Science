package coinPurse;
import java.util.ArrayList;

public class CoinPurse {
  
  private ArrayList<String> coins;
  
  public CoinPurse (ArrayList<String> coins) {
    this.coins=coins;
  }
  
  public void addCoin (String coin) {
    coins.add(coin);
  }
  
  public void reverse () {
    ArrayList<String> temp = new ArrayList<String>();
    for(int i=0;i<coins.size();i++) temp.add(coins.get(coins.size()-1-i));
    coins.clear();
    coins.addAll(temp);
  }
  
  public String toString() {
    return "Purse "+coins;
  }
}