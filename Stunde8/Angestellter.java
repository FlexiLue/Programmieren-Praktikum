package Stunde8;

public class Angestellter extends Person{
    float studenlohn;
    int steuerklasse;
    Zeitkonto konto;
    float ueberstundenbonus;

    public Angestellter(float studenlohn, int steuerklasse, Zeitkonto konto, float ueberstundenbonus, int sollZeit){
        this.studenlohn = studenlohn;
        this.steuerklasse = steuerklasse;
        this.konto = new Zeitkonto(sollZeit);
        this.ueberstundenbonus = ueberstundenbonus;
    }

    public float getMonatslohn(boolean brutto){
        float nettoLohn = 0;
        float bruttoLohn = 0;
        if(konto.zeitAbfrage() < 0){
            bruttoLohn = (float) konto.istZeit * (studenlohn/60);
        }
        if(konto.zeitAbfrage() > 0){
            bruttoLohn = (float) konto.sollZeit * (studenlohn/60) + ueberstundenbonus;
        }
        if(konto.zeitAbfrage() == 0){
            bruttoLohn = (float) konto.sollZeit * (studenlohn/60);
        }
        if(!brutto){
            nettoLohn = bruttoLohn - bruttoLohn/100*getAbzuege();
            return nettoLohn;
        }else{
            return bruttoLohn;
        }
    }

    public int getAbzuege(){
        switch (steuerklasse){
            case 0:
                return 0;
            case 1:
                return 12;
            case 2:
                return 18;
            case 3:
                return 23;
            case 4:
                return 29;
            case 5:
                return 38;
            case 6:
                return 45;
            default:
                return -1;
        }
    }

}
