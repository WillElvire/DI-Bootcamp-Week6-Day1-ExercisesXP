package Utils;

import java.util.Scanner;

public class ScannerAtos {
    
    private Scanner sc ;

    public ScannerAtos() {
      sc = new Scanner(System.in);
    }

    public String scannerUneChaine() {
        return sc.nextLine();
    }

    public int scannerUnEntier() {
      return sc.nextInt();
   }
    


}
