package Stunde8;

public class Main {
    public static void main(String[] args) {
        Zeitkonto konto = new Zeitkonto(40);
        Angestellter Peter = new Angestellter((float)11.50, 2, konto, 120, 40*60);

        Peter.konto.arbeitsZeitÄndern(35*60, true);
        Zeitkonto.minToH(Peter.konto.istZeit);
        Zeitkonto.minToH(Peter.konto.sollZeit);
        System.out.println(Peter.konto.zeitAbfrage());



        System.out.println(Peter.getMonatslohn(true));
        System.out.println(Peter.getMonatslohn(false));
    }
}
