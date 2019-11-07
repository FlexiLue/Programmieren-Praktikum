package Stunde6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        int test [] = {1,2,3,4,5,6};

        /*System.out.println(len("Hallo"));
        p("Hallo");
        time();
        date();
        System.out.println(Arrays.toString(invertArray(test)));
        vorkommen("Wieeebiiitteee");*/

        Scanner s = new Scanner(System.in);
        System.out.println("Bitte geben sie einen Befehle in.");
        while (true){
            String str = s.nextLine();

            if(str.equals("/len")){
                System.out.println("Bitte geben sie das Worte ein, dessen länge sie gerne wissen möchten.");
                str = s.nextLine();
                System.out.println(len(str));
            }
            if(str.equals("/p")){
                System.out.println("Bitte geben sie den Satz ein, welcher danach ausgegeben werden soll.");
                str = s.nextLine();
                p(str);
            }
            if(str.equals("/time")){
                time();
            }
            if(str.equals("/date")){
                date();
            }

            if(str.equals("/exit")){
                break;
            }
            if(str.equals("/invert")){
                System.out.println("Bitte geben sie das Wort ein, welches sie umgekehren wollen.");
                str = s.nextLine();
                System.out.println(invertString(str));
            }

        }
    }

    // Länge eines Strings ausgebe.
    public static int len(String a){
        return a.length();
    }

    public static void p (String a){
        System.out.println(a);
    }

    public static void time (){
        DateTimeFormatter dtf  = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    public static void date (){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }

    public static int [] invertArray (int[] a){
        int [] rev = new int [a.length];

        for(int i = 0; i < a.length; i++){
            rev [i] = a [a.length - i - 1];
        }
        return rev;
    }

    public static void vorkommen(String name){
        for(int i = 0; i < name.length(); i++) {
            char buchstabe = name.charAt(i);
            int anzahl = 0;
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(j) == buchstabe){
                    anzahl++;
                }
            }
            System.out.print(Character.toString(buchstabe) + anzahl + ", ");

        }
    }
    public static String invertString (String a){
        String inverted = "";

        for(int i = 0; i < a.length(); i++){
            inverted = inverted + a.charAt(a.length() -1 - i);
        }
        return inverted;
    }
}
