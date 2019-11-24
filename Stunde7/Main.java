package Stunde7;

import java.util.Vector;

public class Main {
    public static void main(String [] args){

        Lagerverwaltung fuwa1 = new Lagerverwaltung();
        Lagerverwaltung fuwa2 = new Lagerverwaltung();

        fuwa1.update();

        lagertauschEinzel(fuwa1.lager, fuwa2.lager, "Nuss");
        fuwa2.lager.lagerbestandAusgabe("Nuss");
        fuwa1.lager.lagerbestandAusgabe("Melonen");

    }

    public static void lagertauschAll(Lager altesLager, Lager neuesLager){ ;
        for(int i = 0; i < altesLager.produkte.size(); i++){
            neuesLager.produkte.add(altesLager.produkte.get(i));
            neuesLager.lagerbestand.add(altesLager.lagerbestand.get(i));
        }
        altesLager.lagerbestand.removeAllElements();
        altesLager.produkte.removeAllElements();
    }

    public static void lagertauschEinzel(Lager altesLager, Lager neuesLager, String produkt){
        for(int i = 0; i < altesLager.produkte.size(); i++){
            if(!altesLager.produkte.isEmpty()){
                if(altesLager.produkte.get(i).name.equals(produkt)){
                    neuesLager.produkte.add(altesLager.produkte.get(i));
                    neuesLager.lagerbestand.add(altesLager.lagerbestand.get(i));
                    altesLager.produkte.remove(i);
                    altesLager.lagerbestand.remove(i);
                }
            }
        }
    }
}
