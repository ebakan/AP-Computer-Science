package crapsAnalysis;
//CrapsAnalysis by 212014 on 1/27/10
//plays through a certain number of games of craps and displays the results
import java.text.DecimalFormat;

import craps.Craps;
public class CrapsAnalysis {
  public static void main(String[] args) {
    Craps crapper = new Craps();
    DecimalFormat dec = new DecimalFormat("0.00");
    final int NUMGAMES = 100;
    int[] wins = new int[20];
    int[] losses = new int[20];
    String[] headers = new String[20];
    int winsrolls = 0;
    int lossrolls = 0;
    int winstotal = 0;
    int lossestotal = 0;
    double percentgameswon = 0;
    double avgrolls = 0;
    double avgrollswin = 0;
    double avgrollsloss = 0;
    int game = 0;
    
    for (int i=0;i<20;i++) {
      headers[i]= ""+(i+1);
    }
    headers[19]+='+';
    
    for (int i=0;i<NUMGAMES;i++) {
      game = crapper.play();
      if (game<0) {
        game*=-1;
        System.out.println("House wins in "+game);
        lossrolls+=game;
        lossestotal++;
        if (game>=20) losses[19]++;
        else losses[game-1]++;
      } else {
        System.out.println("Player wins in "+game);
        winsrolls+=game;
        winstotal++;
        if (game>=20) wins[19]++;
        else wins[game-1]++;
      }
    }
    percentgameswon = (double) winstotal/(winstotal+lossestotal)*100;
    avgrolls = (double) (winsrolls + lossrolls) / (winstotal+lossestotal);
    avgrollswin = (double) winsrolls / winstotal;
    avgrollsloss = (double) lossrolls / lossestotal;
    
    System.out.println("Percent games won by player: "+dec.format(percentgameswon)+"%");
    System.out.println("Percent games won by house: "+dec.format(100-percentgameswon)+"%");
    System.out.println("Average rolls per game: "+dec.format(avgrolls));
    System.out.println("Average rolls per win: "+dec.format(avgrollswin));
    System.out.println("Average rolls per loss: "+dec.format(avgrollsloss));
    
    System.out.println("Rolls\tWins\tLosses");
    for (int i=0;i<20;i++) {
      System.out.println(String.format("%s\t%d\t%d",headers[i],wins[i],losses[i]));
    }
  }
}