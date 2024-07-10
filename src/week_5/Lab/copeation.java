package week_5.Lab;
import java. util. Scanner;
import java. util. *;
//import week_5.day_1.Scanner;

public class copeation {
    public static void main(String[] args) {


        Scanner mysc;
        mysc=new Scanner(System.in);

        Scanner myscanner= new Scanner(System.in);
        System.out.println("Enter you Name and LastName");
        String firstname=myscanner.next();
        String lastname=myscanner.next();
        if (firstname.equals(lastname))
        {
            System.out.println("The Name and laastName Is Same");
        }
        else {
            System.out.println("The Name and laastName Is no Same");
        }
    }
}
