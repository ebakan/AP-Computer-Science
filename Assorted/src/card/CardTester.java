package card;
public class CardTester { 
  public static void main(String[] args) {
    for (int i=0;i<52;i++) {
    Card card = new Card(i);
    System.out.println(""+i+" "+card);
    }
  }
}