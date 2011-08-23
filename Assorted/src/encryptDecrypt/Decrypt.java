package encryptDecrypt;
/* Basic Decryption Project
 * by Eric Bakan
 * ID 212014 P2 */

import javax.swing.JOptionPane;

public class Decrypt {
  public static void main (String[] args) {
    
    //Input
    String input = JOptionPane.showInputDialog("Enter a 4-digit number to encrypt","0000");
    int num = Integer.parseInt(input);
    
    //Get Digits in an Array
    int[] numArray = new int[(Integer.toString(num)).length()];
    for (int i=0;i<numArray.length;i++) {
      numArray[i] = (num % (int) Math.pow(10,(numArray.length)-i)) / (int)  Math.pow(10,(numArray.length-1)-i);
    }
    
    //Process digits
    for (int i=0;i<numArray.length;i++) {
      numArray[i] = (numArray[i]+3)%10;
    }
    
    //Rearrange array
    int[] outArray = {numArray[2],numArray[3],numArray[0],numArray[1]};
    
    //Find output number
    int output = 0;
    for (int i=0;i<outArray.length;i++) {
      output+=outArray[i]*(int)Math.pow(10,(outArray.length-1)-i);
    }
    JOptionPane.showMessageDialog(null,String.format("Output: %d", output));
  }
}