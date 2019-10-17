package Aufgabe24_10;

public class Main {
    public static void main(String [] args){
            int [] werte = {1,2,3,-77,255,60};
            int maximum = 0;
            int minimum = 0;

            minimum = werte[0];
            maximum = werte[0];


            for(int i = 0; i < werte.length; i++){
                if(werte[i] > maximum){
                    maximum = werte[i];
                }else if(werte[i] < minimum){
                    minimum = werte[i];
                }
            }
            System.out.println("maximum: " + maximum + " minimum: " + minimum);
    }
}
