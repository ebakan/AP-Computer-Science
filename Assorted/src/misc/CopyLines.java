package misc;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class CopyLines {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = 
                new BufferedReader(new FileReader("Accounts.txt"));
            outputStream = 
                new PrintWriter(new FileWriter("newAccounts.txt"));

            String l;
            int lineCount = 1;
            while ((l = inputStream.readLine()) != null) {
                 System.out.println ("\nLine: " + lineCount + ": " + l);                 
                  String thisLine = l;
                  lineCount++;
                  
                  int tab1, tab2;
                  
                  String name;
                  String password;
                  double balance;
                 
                        tab1 = thisLine.indexOf('\t');
                        name = thisLine.substring (0, tab1); 
                        
                        thisLine = thisLine.substring (tab1 + 1 );
                        tab2 = thisLine.indexOf('\t');
                        password = thisLine.substring (0, tab2);
                        
                        thisLine = thisLine.substring(tab2 + 1);
                        balance = Double.parseDouble(thisLine);
                        
                        System.out.println ("Name: " + name);
                        System.out.println ("Password: " + password);
                        System.out.println ("Balance: " + balance);
                  
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
