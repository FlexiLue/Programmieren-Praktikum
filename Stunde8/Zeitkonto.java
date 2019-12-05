package Stunde8;

public class Zeitkonto {
    int sollZeit;
    int istZeit;
    int wochenArbeitsstunden;

    public Zeitkonto(int sollZeit){
        this.sollZeit = sollZeit;
    }


    public static void minToH(int zeit){
        int Stunden = zeit/60;
        int Minuten = zeit%60;
        System.out.println(Stunden + " Stunden und " + Minuten + " Minuten");
    }

    public int zeitAbfrage(){
        int zeitDifferenz = istZeit - sollZeit;
        return  zeitDifferenz;
    }

    public void arbeitsZeitÄndern(int zeit, boolean istKonto){
        if(istKonto){
            istZeit = zeit;
        }else{
            sollZeit = zeit;
        }
    }

}
