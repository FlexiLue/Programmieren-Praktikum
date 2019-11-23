package Stunde7;

import java.util.Vector;

public class Lager {
    Vector<Produkt> produkte = new Vector();
    Vector<Integer> lagerbestand = new Vector();

    public void produktHinzufügen(String neuesProdukt, int anzahl){
        Produkt produkt = new Produkt();
        produkt.name = neuesProdukt;

        produkte.add(produkt);
        //Anzahl hinzufügen
        lagerbestand.add(anzahl);
    }
    public void getProdukt(String produkt, int anzahl){

        int produktIndex = getProduktIndexFromString(produkt);

        int momentaneAnzahl = lagerbestand.get(produktIndex);
        //Berechnung der neuen Anzahl
        int neueAnzahl = momentaneAnzahl - anzahl;
        //neue Anzahl einsetzen
        lagerbestand.set(produktIndex, neueAnzahl);
    }

    public String lagerbestandAusgabe(String produkt){
        if(!lagerbestand.isEmpty()) {
            int anzahl = lagerbestand.get(getProduktIndexFromString(produkt));
            return produkt + " " + anzahl;
        }
        return "Dieses Proukt befindet sich nicht im Lager";
    }

    public int getProduktIndexFromString(String produktName){
        int produktIndex = 0;
        for(int i = 0; i < produkte.size(); i++){
            if(produkte.get(i).name.equals(produktName)){
                produktIndex = produkte.indexOf(i);
            }
        }
        return produktIndex + 1;
    }
}
