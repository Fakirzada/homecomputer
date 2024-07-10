package week_5.DAY_4;
import com.sun.jdi.PathSearchingVirtualMachine;

import java. util. Scanner;
import java. util. *;
public class OtheriFcONDITION {
    public static void main(String[] args) {

        char grade;
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter you Grade");
        int marks = myscanner.nextInt();
        if (marks <= 100 && marks >= 90) {
            grade = 'A';
            System.out.println(grade);
        } else if (marks <= 89 && marks >= 81) {
            grade = 'B';
            System.out.println(grade);
        } else if (marks <= 80 && marks >= 71) {
            grade = 'B';
            System.out.println(grade);
        } else if (marks>100) {
            System.out.println("Enter a Numer Between 100to 50");
        }
        else {
            grade='F';
            System.out.println(grade);
        }
    }
    }
