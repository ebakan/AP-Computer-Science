package pet;


public class PetsDemo
{
  //-----------------------------------------------------------------
  //  Instantiates a dog and a snake object and prints information
  //  about them.
  //-----------------------------------------------------------------
  public static void main (String[] args)
  {
    Pet p1, p2;
    
    p1 = new Dog ("Scraps", 222);
    System.out.println (p1);
    
    p2 = new Snake ("Sparky", 22);
    System.out.println (p2);
    
    //Dog d1, d2;
    
    // Code Sample A
    // 
    //d1 = (Dog) new Pet ("Scraps");
    // The only question is which sort of error we will get . . .
    
    // Code Sample B
    //
    //d2 = (Dog) p1;
    // how about now? 
    
    
    
    
  }
}
