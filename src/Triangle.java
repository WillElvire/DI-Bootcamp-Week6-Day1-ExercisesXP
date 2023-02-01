import java.util.Scanner;

import Utils.ScannerAtos;

/*
 * @author : KOUA WILFRIED
 */
public class Triangle {
    
    private int defaultAnge = 180;

    Triangle() {

    }

    public void playTriangleGame() {

        String firstValue ;
        String secondValue;
        String thirdValue;
        
        
        System.out.println("Hello, World!");
        ScannerAtos sc = new ScannerAtos();
        System.out.println("Veuillez renseigner la premiere value :  ");
        firstValue = sc.scannerUneChaine();
        System.out.println("Veuillez renseigner la seconde value  : ");
        secondValue = sc.scannerUneChaine();
        System.out.println("Veuillez renseigner la derniere value  : ");
        thirdValue = sc.scannerUneChaine();

        int totalAngle       =  this.parseToInteger(firstValue)+  this.parseToInteger(secondValue) + this.parseToInteger(thirdValue);
        String validiyResult = this.verifyTriangleValidity(totalAngle);

        System.out.println(validiyResult);

    }

    public int parseToInteger(String numberToBeParsed) {

        return Integer.parseInt(numberToBeParsed);
    }

    public String verifyTriangleValidity(int angle) {
        return angle == this.defaultAnge ?   "C'est un triangle valide" : "Ce n'est pas un triangle valide";
    }
}
