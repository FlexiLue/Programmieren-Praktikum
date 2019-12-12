package Stunde7;

import java.util.Scanner;

public class Lagerverwaltung {
    Lager lager = new Lager();

    public void update() {
        Scanner s = new Scanner(System.in);
        while (true) {
            String str = s.nextLine();
            if (evaluateInput(str) == 1) {
                break;
            }
            if (evaluateInput(str) == 2) {
                System.out.println("Hallo");
            }
            if (evaluateInput(str) == 3) {
                String Eingabe[] = str.split(" ");
                if (Eingabe.length == 3) {
                    String Produkt = Eingabe[1];
                    int Anzahl = Integer.parseInt(Eingabe[2]);
                    lager.produktHinzufügen(Produkt, Anzahl);
                    System.out.println("Es wurden " + Anzahl + " " + Produkt + " dem Lager hinzugefügt.");
                } else {
                    System.out.println("Die Syntax ist wie folgt: /hinzufügen [Produktname] [Anzahl]");
                }
            }
            if (evaluateInput(str) == 4) {
                String Eingabe[] = str.split(" ");
                if (Eingabe.length == 2) {
                    String Produkt = Eingabe[1];
                    try {
                        lager.lagerbestandAusgabe(Produkt);
                    }
                    catch (Exception e){
                        System.out.println("Das Lager ist leer. Du musst es zunächst befüllen");
                    }
                } else {
                    System.out.println("Die Syntax ist wie folgt: /ausgabe [Produktname]");
                }
            }
            if (evaluateInput(str) == 5) {
                String Eingabe[] = str.split(" ");
                if (Eingabe.length == 3) {
                    String produkt = Eingabe[1];
                    int anzahl = Integer.parseInt(Eingabe[2]);
                    lager.getProdukt(produkt, anzahl);
                    System.out.println("Es wurden " + anzahl + " " + produkt + " herausgenommen.");
                } else {
                    System.out.println("Die Synstax ist wie folgt: /nehmen [Produktname] [Anzahl]");
                }
            }
            if (evaluateInput(str) == 6) {
                String Eingabe[] = str.split(" ");
                if (Eingabe.length == 4) {
                    //lagertauschEinzel(Eingabe[1], Eingabe[2], Eingabe[3]);
                } else {
                    System.out.println("Die Syntax ist wie folgt: /produkttausch [Lager 1] [Lager 2] [Produktname]");
                }
            }
            if (evaluateInput(str) == 7) {
                try {
                    lager.lagerbestandAusgabeAll();
                }
                catch (Exception e){
                    System.out.println("Das Lager ist leer. Bitte befülle es zunächst.");
                }
            }
        }
    }


    private static int evaluateInput(String str) {
        if (str.contains("/exit")) {
            return 1;
        }
        if (str.contains("/hallo")) {
            return 2;
        }
        if (str.contains("/hinzufügen")) {
            return 3;
        }
        if (str.contains("/ausgabe")) {
            return 4;
        }
        if (str.contains("/nehmen")) {
            return 5;
        }
        /*if(str.contains("")){
            return 6;
        }*/
        if (str.contains("/lagergesamt")) {
            return 7;
        } else {
            return 0;
        }
    }

    public static void lagertauschAll(Lager altesLager, Lager neuesLager) {
        ;
        for (int i = 0; i < altesLager.sortiment.size(); i++) {
            neuesLager.sortiment.add(altesLager.sortiment.get(i));
            neuesLager.lagerbestand.add(altesLager.lagerbestand.get(i));
        }
        altesLager.lagerbestand.removeAllElements();
        altesLager.sortiment.removeAllElements();
    }

    public static void lagertauschEinzel(Lager altesLager, Lager neuesLager, String produkt) {
        for (int i = 0; i < altesLager.sortiment.size(); i++) {
            if (!altesLager.sortiment.isEmpty()) {
                if (altesLager.sortiment.get(i).name.equals(produkt)) {
                    neuesLager.sortiment.add(altesLager.sortiment.get(i));
                    neuesLager.lagerbestand.add(altesLager.lagerbestand.get(i));
                    altesLager.sortiment.remove(i);
                    altesLager.lagerbestand.remove(i);
                }
            }
        }
    }
}
