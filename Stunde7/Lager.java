package Stunde7;

import java.util.Vector;

public class Lager {
    Vector<Produkt> sortiment = new Vector();
    Vector<Integer> lagerbestand = new Vector();

    public void produktHinzufügen(String neuesProdukt, int anzahl){
        Produkt produkt = new Produkt(neuesProdukt);

        sortiment.add(produkt);
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

    public void lagerbestandAusgabe(String produkt){
        if(!lagerbestand.isEmpty()) {
            int anzahl = lagerbestand.get(getProduktIndexFromString(produkt));
            System.out.println("Es sind " + anzahl + " " + sortiment.get(getProduktIndexFromString(produkt)).name + " im Lager vorhanden.");
        }
        else{
            System.out.println("Das Lager ist leer");
        }
    }

    public void lagerbestandAusgabeAll(){
        if(!lagerbestand.isEmpty()) {
            for (int i = 0; i < lagerbestand.size(); i++) {
                String produkt = sortiment.get(i).name;
                int anzahl = lagerbestand.get(i);
                System.out.println("Produkt: " + produkt + " " + anzahl);
            }
        }else{
            System.out.println("Das Lager ist leer");
        }
    }

    public int getProduktIndexFromString(String produktName){
        int produktIndex = 0;
        for(int i = 0; i < sortiment.size(); i++){
            if(sortiment.get(i).name.equals(produktName)){
                produktIndex = sortiment.indexOf(sortiment.elementAt(i));
            }
        }
        return produktIndex;
    }
}
