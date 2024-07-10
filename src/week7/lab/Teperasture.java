package week7.lab;

import java.util.Scanner;

public class Teperasture {

    public static void main(String[] args) {

        var mysacn = new Scanner(System.in);

        System.out.println("Centigrade Value");

        int Centigrade = mysacn.nextInt();
         int rersult;
         rersult=Centigrade *9/5+32;

        System.out.println(Centigrade + "Fahrenheit:    "+rersult);

    }
}
