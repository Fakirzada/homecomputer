package week7.DAY4;


import java. util. Scanner;
public class Example {
    public static void main(String[] args) {

             /*
    Print Array Elements
    You are given an array of integers: int[] numbers = {3, 7, 2, 8, 5};.
    Write a program using a for loop that prints the elements in the array.
    Keep a running total and add each array element to this total during each iteration of the loop.

    // NOTE: USE SCANNER TO GET THE INPUT OF THE USER
    // BASED ON THE INPUT OF THE USER, DECIDE BETWEEN PRINTING ODD OR EVEN NUMBERS

    // FOR EXAMPLE

    1. Print Even Numbers
    2. Print Odd Numbers
    Please select one of the options: X
    // if Y --> Invalid Entry, Please try again.

    if user enters 1, --> Print even numbers
    else, print odd numbers
*/
        Scanner mysacn= new Scanner(System.in);
        int[] numbers = {3, 7, 2, 8, 5};

        System.out.println("Enter you number");

        int countodd=0;
        int countEven=0;
        System.out.println("Enter ODD NUMBER");
        countodd=mysacn.nextInt();
        System.out.println("Enter EVEN NUMBER");
        countodd=mysacn.nextInt();

        int inputuser= 2;


    }
}
