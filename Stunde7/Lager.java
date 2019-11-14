package Stunde7;

import java.util.Vector;

public class Lager {
    Vector produkt = new Vector();
    Vector lagerbestand = new Vector();

    public void produktHinzufügen(Produkt neuesProdukt, int anzahl){
        produkt.add(neuesProdukt);
        for(int i = 0; i < anzahl; i++) {
            lagerbestand.add(neuesProdukt);
        }
    }
    public void getProdukt(Produkt produkt, int anzahl){
        int counter = 0;
        for(int i = 0; i < lagerbestand.size(); i++){
            if(lagerbestand.elementAt(i).equals(produkt) && counter < anzahl){
                lagerbestand.remove(i);
                counter++;
            }
        }
    }

    public int lagerbestand(Produkt produkt){
        int counter = 0;
        for(int i = 0; i < lagerbestand.size(); i++){
            if(lagerbestand.elementAt(i).equals(produkt)){
                counter++;
            }
        }
        return counter;
    }
}
