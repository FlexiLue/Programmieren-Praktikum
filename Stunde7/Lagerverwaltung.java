package Stunde7;

import java.util.Scanner;

public class Lagerverwaltung {
    Lager lager  = new Lager();

    public static void update(){
        Scanner s = new Scanner(System.in);
        while(true){
            String str = s.nextLine();
            if(evaluateInput(str) == 1){
                break;
            }
            if(evaluateInput(str) == 2){
                System.out.println("Hallo");
            }
        }
    }


    private static int evaluateInput(String str){
        if(str.equals("/exit")){
            return 1;
        }
        if(str.equals("/hallo")){
            return 2;
        }else{
            return 0;
        }
    }

    public static void lagertauschAll(Lager altesLager, Lager neuesLager){
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
                if(altesLager.produkte.get(i).equals(produkt)){
                    neuesLager.produkte.add(altesLager.produkte.get(altesLager.getProduktIndexFromString(produkt)));
                    neuesLager.lagerbestand.add(altesLager.lagerbestand.get(i));
                    altesLager.produkte.remove(i);
                    altesLager.lagerbestand.remove(i);
                }
            }
        }
    }




}
