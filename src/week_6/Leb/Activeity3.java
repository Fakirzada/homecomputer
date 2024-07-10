package week_6.Leb;
import java. util. Scanner;
import java. util. *;
public class Activeity3 {
    public static void main(String[] args) {
        Scanner mysacn= new Scanner(System.in);
        System.out.println("Enter Age");
        int age=mysacn.nextInt();
        if (age>=0 && age <=12){

            System.out.println("Child");

        } else if (age>=13 && age<=19) {
            System.out.println("Teenager");
        } else if (age>=20) {
            System.out.println("Adult");
        }
       mysacn.close();


    }
}
