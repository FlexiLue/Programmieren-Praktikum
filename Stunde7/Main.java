package Stunde7;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        //Lagerverwaltung.update();

        Lager lager1  = new Lager();
        Lager lager2 = new Lager();
        Produkt nuss = new Produkt();
        nuss.name = "Nuss";

        lager1.produktHinzufügen(nuss, 8);
        System.out.println(lager1.lagerbestand);
        lager1.getProdukt(nuss, 4);
        System.out.println(lager1.lagerbestand);

        System.out.println(lager1.lagerbestand(nuss));

        Lagerverwaltung.lagertausch(lager1 , lager2);

        System.out.println(lager1.lagerbestand);
        System.out.println(lager2.lagerbestand);

         //System.out.println(l.produkt);
    }
}
