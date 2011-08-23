package craps;
import java.util.Scanner;

public class Casino {
  public static void main(String[] args) {
    double bank = 0;
    Scanner strInput = new Scanner(System.in);
    Scanner numInput = new Scanner(System.in);
    Craps crap = new Craps();
    Chatter chat = new Chatter();
    double tempInput = 0;
    
    System.out.println(chat.welcome());
    System.out.println(chat.bank());
    while (tempInput<=0) {
      tempInput = numInput.nextDouble();
      if (tempInput<0) System.out.println(chat.bankInputNegative());
      else if (tempInput==0) System.out.println(chat.bankInputZero());
    }
    bank=tempInput;
    System.out.println(chat.welcome());
    
    char answer = 'y';
    while (answer=='y') {
      tempInput=0;
      System.out.println(chat.wager());
      while (tempInput<=0 || tempInput>bank) {
        tempInput = numInput.nextDouble();
        if (tempInput<0) System.out.println(chat.wagerInputNegative());
        else if (tempInput==0) System.out.println(chat.wagerInputZero());
        else if (tempInput>bank) System.out.println(chat.wagerInputTooBig());
      }
      double wager=tempInput;
      
      int game = crap.play();
      if (game>0) {
        System.out.println(chat.win());
        bank+=wager;
        System.out.println(chat.balance());
      } else {
        System.out.println(chat.lose());
        bank-=wager;
      }
      if (bank==0) {
        System.out.println(chat.broke());
        break;
      } else {
        System.out.println(chat.askPlayAgain());
        do {
          answer = strInput.next().charAt(0);
          if (answer!='y' && answer!='n') System.out.println(chat.askPlayAgainWrong());
          if (answer=='n') System.out.println(chat.exit());
        } while (answer!='y' && answer!='n');
      }
    }
  }
}