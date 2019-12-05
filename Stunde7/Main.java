package Stunde7;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Lagerverwaltung fuwa1 = new Lagerverwaltung();
        Lagerverwaltung fuwa2 = new Lagerverwaltung();

        fuwa1.update();

        fuwa1.lagertauschEinzel(fuwa1.lager, fuwa2.lager, "Nuss");
        fuwa2.lager.lagerbestandAusgabe("Nuss");
        fuwa1.lager.lagerbestandAusgabe("Melonen");

    }
}
