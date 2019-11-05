package Vorlesung_1;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        int [] a = {1,2,3,4,5,6};
        vertausche(a,2,3);

        System.out.println(Arrays.toString(a));
        System.out.println((Arrays.toString(reverse(a))));
    }

    public static void vertausche(int[] a, int g, int j){
        int zahlBeii = a [g];

        a[g] = a[j];
        a[j]= zahlBeii;
    }

    public static int [] reverse (int[] a){
        int [] rev = new int [a.length];

        for(int i = 0; i < a.length; i++){
            rev [i] = a [a.length - i - 1];
        }
        return rev;
    }
}