package week7.day_2;

import java.util.Scanner;

public class D1array {
    public static void main(String[] args) {

        var mysacn=new Scanner(System.in);


        String[]bookTitle = new String[4];
        System.out.println("Enter book title");
        bookTitle[0]=mysacn.next();
        System.out.println("Enter book Edition");
        bookTitle[1]=mysacn.next();
        System.out.println("Enter book Year");
        bookTitle[2]=mysacn.next();
        System.out.println("Enter book Price");
        bookTitle[3]=mysacn.next();
        System.out.println(bookTitle[0]+"  "+bookTitle[1]+"  "+bookTitle[2]+" " +bookTitle[3]);

    }
}
