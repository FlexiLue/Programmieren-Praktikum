package MIBAufgabe;

public class Main {
    public static void main(String [] args){
        String wort = "Hallo";

        for(int i = 0; i < wort.length(); i++){
            String zwischenWort = "";
            for(int x = 0; x < wort.length(); x++){
                if(i <= x){
                    zwischenWort = zwischenWort + wort.charAt(i);
                }else{
                    zwischenWort = zwischenWort + wort.charAt(x);
                }
            }
            System.out.println(zwischenWort);
        }
    }
}
