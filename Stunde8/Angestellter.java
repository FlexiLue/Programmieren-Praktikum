package Stunde8;

public class Angestellter extends Person{
    float studenlohn;
    int steuerklasse;
    Zeitkonto konto;
    float ueberstundenbonus;

    public Angestellter(float studenlohn, int steuerklasse, Zeitkonto konto, float ueberstundenbonus, int sollzeit){
        this.studenlohn = studenlohn;
        this.steuerklasse = steuerklasse;
        this.konto = new Zeitkonto(sollzeit);
        this.ueberstundenbonus = ueberstundenbonus;
    }



}
