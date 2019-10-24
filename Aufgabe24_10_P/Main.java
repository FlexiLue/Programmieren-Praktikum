package Aufgabe24_10_P;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        while(true){
            String str = s.nextLine();

            if(str.equals("/joke")) {
                System.out.println("Wie viele Softwareentwickler braucht man, um eine Glühbirne auszuwechseln? Keinen, das ist ein Hardware-Problem!");
            }
            if(str.equals("/greet")) {
                System.out.println("Hallo Nutzer :)");
            }
            if(str.equals("/help")) {
                System.out.println("Benutze: /joke, /greet oder beende das Programm mit /exit.)");
            }
            if(str.equals("/exit")) {
                break;
            }
            if(str.equals("/date")){
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDateTime now = LocalDateTime.now();
                System.out.println(dtf.format(now));
            }
            if(str.equals("/time")){
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                System.out.println(dtf.format(now));
            }
        }

    }
}
