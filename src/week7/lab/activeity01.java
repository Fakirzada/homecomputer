package week7.lab;

import java.util.Scanner;

public class activeity01 {
    public static void main(String[] args) {

        var mysacn= new Scanner(System.in);
        System.out.println("Enter condiartion");

        boolean isVip= mysacn.nextBoolean();
        int gameHoursPlayed=mysacn.nextInt();
        if( isVip==true || gameHoursPlayed>100)
        {
            System.out.println("Access Granted ");
        }
        else {
            System.out.println("Accees not granted");

        }
    }
}
