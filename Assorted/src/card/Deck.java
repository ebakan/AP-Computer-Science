package card;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
  
  private Random rand = new Random();
  private ArrayList <Card> myCards = new ArrayList<Card>();
  
  public Deck () {
    for (int i=0;i<52;i++) myCards.add(new Card(i));
  }
  
  public void shuffle () {
    /*ArrayList<Card> cards = new ArrayList<Card>();
    for (int i=0;i<myCards.size();i++) cards.add(myCards.remove(rand.nextInt(myCards.size())));
    for (Card i : cards) myCards.add(i);*/
    Collections.shuffle(myCards, rand);
    
  }
  
  public int cardsLeft () {
    return myCards.size();
  }
  
  public String toString () {
    String out = "";
    for (Card i : myCards) out+=i.toString()+'\n';
    return out;
  }
  
  public ArrayList <Card> deal (int numCards) throws UnsupportedOperationException {
    if (numCards>myCards.size()) throw new UnsupportedOperationException(String.format("only %d cards left", myCards.size()));
    ArrayList<Card> cards = new ArrayList<Card>();
    for (int i=0;i<numCards;i++) cards.add(myCards.remove(0));
    return cards;
  }
  
  
  
}