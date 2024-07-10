package week7.lab;

import java.util.Scanner;

public class activeity02 {

    public static void main(String[] args) {

        var mysacn = new Scanner(System.in);

        String [] nameTeam ={"Air ball","Breking","Boudires","Busy","Court"};

        int usechoce=0;

        // print a menu for useser choice

        System.out.println("Select bellow option");
        System.out.println("1. first , 2 scond.........5 ramnked ");

        usechoce=mysacn.nextInt();

        switch (usechoce){

            case 1:
                System.out.println("Top Rnaked team Name is: " + nameTeam[0]);
                break;
            case 2:
                System.out.println("Scond Rnaked team Name is: " + nameTeam[1]);
                break;
            case 3:
                System.out.println("Thrid Rnaked team Name is: " + nameTeam[2]);
                break;
            case 4:
                System.out.println("Fourt Rnaked team Name is: " + nameTeam[3]);
                break;
            case 5:
                System.out.println("Fity Rnaked team Name is: " + nameTeam[4]);
            default:
                System.out.println("Worng enter");
        }



    }
}