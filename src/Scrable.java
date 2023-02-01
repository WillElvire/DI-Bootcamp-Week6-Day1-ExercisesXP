import java.util.Arrays;

import Utils.ScannerAtos;

public class Scrable {
    
    private String word;
    private int  score = 0;

    Scrable(){
        this.askWordTotheUser();
    }

    public void playScrable() {
        System.out.println("Vous avez obtenu   \t " +  this.getScore() + " Comme score");   
    }

    public int getScore() {

        String[] listAUnpoint      = {"A", "E", "I", "O", "U", "L", "N", "R", "S", "T"};
        String[] listADeuxpoints   = {"D","G"};
        String[] listATroispoints  = {"B", "C", "M", "P"};
        String[] listAQuatrepoints = {"F", "H", "V", "W", "Y"};
        String[] listACinqPoints   = {"K"};
        String[] listAHuightpoints = {"J", "X"};
        String[] listADixpoints    = {"Q", "Z"};


        char[] charactereTable = this.getWord().toCharArray();

        for (char c : charactereTable) {
            
    
            if(Arrays.asList(listAUnpoint).contains( Character.toString(c))) {
               score = score +1;
            }

            if(Arrays.asList(listADeuxpoints).contains(Character.toString(c))) {
                score = score +2;
            }

            if(Arrays.asList(listATroispoints).contains(Character.toString(c))) {
                score = score +3;
            }

            if(Arrays.asList(listAQuatrepoints).contains(Character.toString(c))) {
                score = score +4;
            }

            if(Arrays.asList(listACinqPoints).contains(Character.toString(c))) {
                score = score +5;
            }

            if(Arrays.asList(listAHuightpoints).contains(Character.toString(c))) {
                score = score +8;
            }

            if(Arrays.asList(listADixpoints).contains(Character.toString(c))) {
                score = score +10;
            }

        }      
        return score; 
    }

    public void askWordTotheUser() {
        ScannerAtos sc  = new ScannerAtos();
        System.out.println("Veuillez renseigner votre mot");
        setWord(sc.scannerUneChaine().toUpperCase());
    }

    public String getWord() {
        return word;
    }



    public void setWord(String word) {
        this.word = word;
    }

    
}
