package misc;
public class TowersOfHanoi {
  private int towers;
  public TowersOfHanoi (int towers) {
    this.towers=towers;
  }
  
  public void solve () {
    moveTower(towers, 1, 3, 2);
  }
  public void moveTower (int num, int start, int stop, int temp) {
    if (num==1) moveDisc(start, stop);
    else {
      moveTower(num-1, start, temp, stop);
      moveDisc(start, stop);
      moveTower(num-1, temp, stop, start);
    }
    
  }
  public void moveDisc (int start, int stop) {
    System.out.println(String.format("Moving one disc from %d to %d", start, stop));
  }
}