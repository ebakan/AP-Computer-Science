package card;
//FiveCardHand by 212014 P2
import java.util.ArrayList;


public class FiveCardHand {
  
  private ArrayList<Card> hand;
  
  public FiveCardHand (ArrayList<Card> hand) throws IllegalArgumentException{
    if (hand.size()!=5) throw new IllegalArgumentException("inputted hand length "+hand.size());
    this.hand=hand;
  }
  
  public String toString() {
    String out = "";
    for (Card i : hand) out+=i.toString()+'\n';
    return out;
  }
}