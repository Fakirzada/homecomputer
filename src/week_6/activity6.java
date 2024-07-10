package week_6;

import java.util.Scanner;

public class activity6 {
    public static void main(String[] args) {
        var mysacn= new Scanner(System.in);

        boolean isTure= false;
         isTure=(!(true||false&&true&&true&&true^true&&false||false))? true:false;
         if (isTure){
             System.out.println("Java");
         }
         else {
             System.out.println("Is Easy");
         }
    }
}
