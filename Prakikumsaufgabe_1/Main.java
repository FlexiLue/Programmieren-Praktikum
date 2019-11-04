package Prakikumsaufgabe_1;

public class Main {
    public static void main (String [] args){
        String [] werte = {"Dies", "", "ist", " ", "ein", " ", "Satz", "!"};
        String ausgabe = "Hallo";
        float [] tagesAusgaben = {1.49f,0.7f,2.80f,1.2f,12.34f};
        String test = "regallager";

        System.out.println(arrayToString(werte));
        einzelneAusgabe(ausgabe);
        System.out.println(summeArray(tagesAusgaben));
        System.out.println("Der Durchschnitt Beträgt: " + durchschnittArray(tagesAusgaben));
        System.out.println(pallindrom(test));
    }

    public static String arrayToString(String [] werte){
        StringBuilder wort = new StringBuilder();
        for(int i = 0; i < werte.length; i++){
            wort.append(werte[i]);
        }
        return String.valueOf(wort);
    }

    public static void einzelneAusgabe(String wort){
        for(int i = 0; i < wort.length(); i++){
            System.out.println(wort.charAt(i));
        }
    }

    public static float summeArray(float [] f){
        float wert = 0;
        for(int i = 0; i < f.length; i++){
            wert = wert + f[i];
        }
        return wert;
    }

    public static float durchschnittArray(float [] f){
        float wert = 0;
        for(int i = 0; i < f.length; i++){
            wert = wert + f[i];
        }
        wert = wert/f.length;
        return wert;
    }

    public static boolean pallindrom(String s){
        boolean aussage = true;
        System.out.println(s.length());
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) == s.charAt(s.length() - 1 - i)){
                aussage = true;
            }else{
                aussage = false;
                return aussage;
            }
        }

        return aussage;
    }

}
