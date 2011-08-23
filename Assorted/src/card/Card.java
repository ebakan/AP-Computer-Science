package card;
public class Card {
  public static String []  theRanks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
  
  
  public static String [] theSuits = {"Hearts", "Clubs", "Diamonds", "Spades"};
  
  private int value;
  int suitNum;
  int rankNum;
  
  public Card (int val) {
    value = val;
    suitNum= val / 13;
    rankNum = val % 13;
  }
  
  public String toString () {
    String s = getRank() + " of " + getSuit();
    return s;
  }
  
  public int getRankNum() {
    return rankNum;
  }
  
  public int getSuitNum() {
    return suitNum;
  }
  
  public String getRank() {
    return theRanks [rankNum];
  }
  
  public String getSuit() {
    return theSuits [suitNum];
  }
  
  public int getValue() {
	  return value;
  }
  
  public int compareTo (Card c) {
    if (rankNum>c.getRankNum()) return 1;
    if (rankNum<c.getRankNum()) return -1;
    return 0;
  }  
  
}
