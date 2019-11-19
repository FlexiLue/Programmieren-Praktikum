package Stunde7;

import java.util.Scanner;

public class Lagerverwaltung {

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


    public static int evaluateInput(String str){
        if(str.equals("/exit")){
            return 1;
        }
        if(str.equals("/hallo")){
            return 2;
        }else{
            return 0;
        }
    }

    public static void lagertausch(Lager altesLager, Lager neuesLager){
        for(int i = 0; i < altesLager.produkte.size(); i++){
            neuesLager.produkte.add(altesLager.produkte.get(i));
            neuesLager.lagerbestand.add(altesLager.lagerbestand.get(i));
        }
        altesLager.lagerbestand.removeAllElements();
        altesLager.produkte.removeAllElements();
    }



}
