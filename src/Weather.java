import java.util.Scanner;

import Utils.ScannerAtos;

public class Weather {

    Weather() {

    }

    public void startAskingQuestionToTheUser() {

        ScannerAtos sc  = new ScannerAtos();
        System.out.println("Veuillez entrer le décallage horaire entre votre domicile et votre destination." +
        "\n(Entrez une valeur négative si la destination est en retard sur le domicile)");
        int decallageHoraire  = sc.scannerUnEntier();

        int[] result = this.calculeDistance(decallageHoraire);

        System.out.println("Il sera " + result[0] + "H à la destination lorsqu'il sera 12h au domicile " +
        "et il sera " + result[1] + "H à la destination lorsqu'il sera 00H au domicile");

    }


    public int[] calculeDistance(int decallageHorraire) {

        int[] resultTable = new int[2];
        int heureDestinationNuit,heureDestinationJournee  = 0;
        heureDestinationNuit = decallageHorraire < 0 ? 24 + decallageHorraire : decallageHorraire;
        heureDestinationJournee = 12 + decallageHorraire;

        resultTable[0] = heureDestinationNuit;
        resultTable[1] = heureDestinationJournee;

        return resultTable;
    }




}
