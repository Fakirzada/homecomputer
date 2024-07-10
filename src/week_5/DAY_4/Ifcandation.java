package week_5.DAY_4;
import java. util. Scanner;
import java. util. *;
//import week_5.day_1.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ifcandation {

    public static void main(String[] args) {
        int grade;
        Scanner mysacnner =new Scanner(System.in);
        System.out.println("Enter Grade");
        grade=mysacnner.nextInt();

        if(grade>=90){
            System.out.println("Your Grade is: A");
            }
        else if (grade>=80)
        {
            System.out.println("Your Grade is: B");
        } else if (grade>=70) {
            System.out.println(" Your Grade is: C");
        } else if (grade>=60) {
            System.out.println("Your Grade is: D");
        }
        else {
            System.out.println("Your Grade is: F");
        }


    }
}
