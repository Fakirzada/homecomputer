package week7.day_2;

import java.util.Scanner;

public class D2arrays {
    public static void main(String[] args) {


            String[][] name=new String[1][2];

            var mydacn= new Scanner(System.in);
        System.out.println("Enter arry vlues ");

        name[0][0]=mydacn.next();
        name[0][1]=mydacn.next();

        System.out.println(name[0][0]);
        System.out.println(name[0][1]);


        for (String [] print :name){
           System.out.println(print);
       }
    }
}
