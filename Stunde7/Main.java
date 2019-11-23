package Stunde7;

public class Main {
    public static void main(String [] args){
        //Lagerverwaltung.update();

        Lagerverwaltung fuwa1 = new Lagerverwaltung();
        Lagerverwaltung fuwa2 = new Lagerverwaltung();

        fuwa1.lager.produktHinzufügen("Nuss", 8);
        System.out.println("Lager fuwa 1: " + fuwa1.lager.lagerbestandAusgabe("Nuss"));
        System.out.println("Lager fuwa2: " + fuwa2.lager.lagerbestandAusgabe("Nuss"));

        fuwa1.lager.getProdukt("Nuss", 4);
        System.out.println("Lager fuwa1: " + fuwa1.lager.lagerbestandAusgabe("Nuss"));
        System.out.println("Lager fuwa2: " + fuwa2.lager.lagerbestandAusgabe("Nuss"));

        Lagerverwaltung.lagertauschAll(fuwa1.lager, fuwa2.lager);
        System.out.println("Lager fuwa1: " + fuwa1.lager.lagerbestandAusgabe("Nuss"));
        System.out.println("Lager fuwa2: " + fuwa2.lager.lagerbestandAusgabe("Nuss"));

        Lagerverwaltung.lagertauschEinzel(fuwa2.lager, fuwa1.lager, "Nuss");
        System.out.println("Lager fuwa1: " + fuwa1.lager.lagerbestandAusgabe("Nuss"));
        System.out.println("Lager fuwa2: " + fuwa2.lager.lagerbestandAusgabe("Nuss"));

    }
}
