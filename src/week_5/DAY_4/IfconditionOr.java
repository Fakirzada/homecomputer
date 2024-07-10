package week_5.DAY_4;
import java. util. Scanner;
import java. util. *;
public class IfconditionOr {

    public static void main(String[] args) {

        Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter Your Number1");
        int num1=myscanner.nextInt();
        System.out.println("Enter Your Number2");
        int num2=myscanner.nextInt();

        if (num1==100 || num2==90  ){
            System.out.println("Your Gdare is Good");
        }
        else {
            System.out.println(" Your Grade is Bad");
        }

    }
}
