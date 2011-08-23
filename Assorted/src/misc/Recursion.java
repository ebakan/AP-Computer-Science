package misc;
public class Recursion {
  public static int power (int b, int e) {
    if (e==1) return b;
    return b*power(b,e-1);
  }
  public static int gcd (int num, int denom) {
    if (num%denom==0) return denom;
    return gcd(denom,num%denom);
  }
}