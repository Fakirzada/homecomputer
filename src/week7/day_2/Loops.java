package week7.day_2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        int num1;

        for ( int i =0 ; i<10;i++)
        {
            System.out.println(i);
        }


        String[] name= {"Saeed","Ali","Khan"};
        for(String print: name){
            System.out.println(print);
        }


        var mysan = new Scanner(System.in);

        String[]value= new String[3];
        System.out.println("Enter the Arrays values");
        value[0]=mysan.next();
        value[1]=mysan.next();
        value[2]=mysan.next();

        for (String stringPrint : value){

            System.out.println(stringPrint);
        }

    }
}
