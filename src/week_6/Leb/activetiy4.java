package week_6.Leb;

import java.util.Scanner;

public class activetiy4 {
    public static void main(String[] args) {
        Scanner mysacn= new Scanner(System.in);
        System.out.println("Enter Vistor Age");
        int vistorAge=mysacn.nextInt();

        if (vistorAge<=10){

            System.out.println("Allow to ride");
        }
        else {

            System.out.println("Vistor uner age 10 not allow to park");
        }




    }

}
