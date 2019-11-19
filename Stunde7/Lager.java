package Stunde7;

import java.util.Vector;

public class Lager {
    Vector<String> produkte = new Vector();
    Vector<Integer> lagerbestand = new Vector();

    public void produktHinzufügen(String neuesProdukt, int anzahl){
        //Produkt hinzufügen
        produkte.add(neuesProdukt);
        //Anzahl hinzufügen
        lagerbestand.add(anzahl);
    }
    public void getProdukt(String produkt, int anzahl){
        int momentaneAnzahl = lagerbestand.get(produkte.indexOf(produkt));
        //Berechnung der neuen Anzahl
        int neueAnzahl = momentaneAnzahl - anzahl;
        //neue Anzahl einsetzen
        lagerbestand.set(produkte.indexOf(produkt), neueAnzahl);
    }

    public String lagerbestandAusgabe(String produkt){
        if(!lagerbestand.isEmpty()) {
            int anzahl = lagerbestand.get(produkte.indexOf(produkt));
            return produkt + " " + anzahl;
        }
        return "Dieses Proukt befindet sich nicht im Lager";
    }
}
