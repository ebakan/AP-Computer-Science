package coinPurse;



public class Runs
{
  public static void main (String[] args)
  {
    final int FLIPS = 1000; // number of coin flips 
    
    int currentHeads = 0;
    int currentTails = 0;
    int maxHeads = 0;
    int maxTails = 0;
    int headCount = 0;
    int tailCount = 0;
    
    // Create a coin object
    Coin coin = new Coin();
    
    // Flip the coin FLIPS times
    
    for (int i = 0; i < FLIPS; i++) {
      // Flip the coin & print the result
      coin.flip();
      System.out.println(coin);
      
      // Update the run information 
      if (coin.isHeads()) {
        currentTails=0;
        headCount++;
        currentHeads++;
        if (currentHeads>maxHeads) maxHeads=currentHeads;
      } else {
        currentHeads=0;
        tailCount++;
        currentTails++;
        if (currentTails>maxTails) maxTails=currentTails;
      }
    }
    
    // Print the results
    System.out.println();
    System.out.println("Total number of heads was "+headCount);
    System.out.println("Total number of tails was "+tailCount);
    System.out.println("Max run of heads was "+maxHeads);
    System.out.println("Max run of tails was "+maxTails);
    
  }
  
}
