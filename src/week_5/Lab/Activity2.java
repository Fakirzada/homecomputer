package week_5.Lab;
import java. util. Scanner;
import java. util. *;
public class Activity2 {
    public static void main(String[] args) {

        // swap two varibales without using third varibale.

        int a = 10;
        int b = 30;
        a= a +b;
        System.out.println(a); //40
        b=a-b;
        System.out.println(b);// 10
        a=b+a;
        System.out.println(a); //50


        //write a program t o check whether a number
        // is even or odd using conditional statemena
        Scanner myscan= new Scanner(System.in);
        System.out.println("Enter Your Number");
       double number = myscan.nextDouble();
         if ( number % 1.2 ==0) {
             System.out.println("The Number is even");
         }
         else {
             System.out.println("The numbver is odd");
         }

        if ( number % 2 ==0) {
            System.out.println("The Number is even");
        }
        else {
            System.out.println("The numbver is odd");
        }



    }
}
