package week_5.day_2;
import java. util. Scanner;
import java. util. *;
//import week_5.day_1.Scanner;

public class increment {
    public static void main(String[] args) {


        Scanner myscanner = new Scanner(System.in);
        int phonumber;
        String firstname;
        String lastname;
        double salary;
        char name;


        System.out.println("Emnter PhoneNumber");
        phonumber=myscanner.nextInt();
        System.out.println("enter name");
        firstname=myscanner.next();
        System.out.println("Enter lsatName");
        lastname=myscanner.next();
        System.out.println("Enter Saraly");
        salary=myscanner.nextDouble();
        System.out.println("Enter Name Intill");
        name=myscanner.next().charAt(0);

        System.out.println(name);


        System.out.println(phonumber+firstname+lastname+salary);

        int numeron =120;
        numeron++;
        System.out.println(numeron);
        numeron++;
        System.out.println(numeron++);
        System.out.println(numeron);






    }
}
