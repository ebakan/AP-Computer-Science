package craps;
import java.util.ArrayList;

public class Chatter {
  
  private ArrayList<String> welcome = new ArrayList<String>();
  private ArrayList<String> bank = new ArrayList<String>();
  private ArrayList<String> bankInputNegative = new ArrayList<String>();
  private ArrayList<String> bankInputZero = new ArrayList<String>();
  private ArrayList<String> wager = new ArrayList<String>();
  private ArrayList<String> wagerInputNegative = new ArrayList<String>();
  private ArrayList<String> wagerInputZero = new ArrayList<String>();
  private ArrayList<String> wagerInputTooBig = new ArrayList<String>();
  private ArrayList<String> win = new ArrayList<String>();
  private ArrayList<String> lose = new ArrayList<String>();
  private ArrayList<String> balance = new ArrayList<String>();
  private ArrayList<String> broke = new ArrayList<String>();
  private ArrayList<String> askPlayAgain = new ArrayList<String>();
  private ArrayList<String> askPlayAgainWrong = new ArrayList<String>();
  private ArrayList<String> exit = new ArrayList<String>();
  
  public Chatter () {
    init_welcome();
    init_bank();
    init_bankInputNegative();
    init_bankInputZero();
    init_wager();
    init_wagerInputNegative();
    init_wagerInputZero();
    init_wagerInputTooBig();
    init_win();
    init_lose();
    init_balance();
    init_broke();
    init_askPlayAgain();
    init_askPlayAgainWrong();
    init_exit();
  }


  private void init_welcome() {
  }

  private void init_bank() {
  }

  private void init_bankInputNegative() {
  }

  private void init_bankInputZero() {
  }

  private void init_wager() {
  }

  private void init_wagerInputNegative() {
  }

  private void init_wagerInputZero() {
  }

  private void init_wagerInputTooBig() {
  }

  private void init_win() {
  }

  private void init_lose() {
  }

  private void init_balance() {
  }

  private void init_broke() {
  }

  private void init_askPlayAgain() {
  }

  private void init_askPlayAgainWrong() {
  }

  private void init_exit() {
  }

  public String welcome() {
	  return welcome.get((int)Math.random()*welcome.size());
  }

  public String bank() {
	  return bank.get((int)Math.random()*bank.size());
  }

  public String bankInputNegative() {
	  return bankInputNegative.get((int)Math.random()*bankInputNegative.size());
  }

  public String bankInputZero() {
	  return bankInputZero.get((int)Math.random()*bankInputZero.size());
  }

  public String wager() {
	  return wager.get((int)Math.random()*wager.size());
  }

  public String wagerInputNegative() {
	  return wagerInputNegative.get((int)Math.random()*wagerInputNegative.size());
  }

  public String wagerInputZero() {
	  return wagerInputZero.get((int)Math.random()*wagerInputZero.size());
  }

  public String wagerInputTooBig() {
	  return wagerInputTooBig.get((int)Math.random()*wagerInputTooBig.size());
  }

  public String win() {
	  return win.get((int)Math.random()*win.size());
  }

  public String lose() {
	  return lose.get((int)Math.random()*lose.size());
  }

  public String balance() {
	  return balance.get((int)Math.random()*balance.size());
  }

  public String broke() {
	  return broke.get((int)Math.random()*broke.size());
  }

  public String askPlayAgain() {
	  return askPlayAgain.get((int)Math.random()*askPlayAgain.size());
  }

  public String askPlayAgainWrong() {
	  return askPlayAgainWrong.get((int)Math.random()*askPlayAgainWrong.size());
  }

  public String exit() {
	  return exit.get((int)Math.random()*exit.size());
  }

  public void add_welcome(String str) {
  }

  public void add_bank(String str) {
  }

  public void add_bankInputNegative(String str) {
  }

  public void add_bankInputZero(String str) {
  }

  public void add_wager(String str) {
  }

  public void add_wagerInputNegative(String str) {
  }

  public void add_wagerInputZero(String str) {
  }

  public void add_wagerInputTooBig(String str) {
  }

  public void add_win(String str) {
  }

  public void add_lose(String str) {
  }

  public void add_balance(String str) {
  }

  public void add_broke(String str) {
  }

  public void add_askPlayAgain(String str) {
  }

  public void add_askPlayAgainWrong(String str) {
  }

  public void add_exit(String str) {
  }

}
