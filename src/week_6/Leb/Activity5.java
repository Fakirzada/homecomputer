package week_6.Leb;

import java.util.Scanner;

public class Activity5 {
    public static void main(String[] args) {
        var mysacn= new Scanner(System.in);
        System.out.println("Firt Apple");
        int inputAppWight=mysacn.nextInt();
        System.out.println("Scond Apple");
        int inputAppWight2=mysacn.nextInt();

        if(inputAppWight > inputAppWight2){
            System.out.println( "The apply one is biger");
        }
        else {
            System.out.println("the both apple in same weight");
        }
    }


}
