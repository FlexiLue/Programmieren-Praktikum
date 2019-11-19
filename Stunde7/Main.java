package Stunde7;

public class Main {
    public static void main(String [] args){
        //Lagerverwaltung.update();

        Lager lager1  = new Lager();
        Lager lager2 = new Lager();

        lager1.produktHinzufügen("Nuss", 8);
        System.out.println(lager1.lagerbestandAusgabe("Nuss"));

        lager1.getProdukt("Nuss", 4);
        System.out.println(lager1.lagerbestandAusgabe("Nuss"));

        Lagerverwaltung.lagertausch(lager1, lager2);
        System.out.println(lager1.lagerbestandAusgabe("Nuss"));
        System.out.println(lager2.lagerbestandAusgabe("Nuss"));
    }
}
