package week_6.Day_1;
import java. util. Scanner;
import java. util. *;
public class Ifcondation {

    public static void main(String[] args) {


        int switchtest=2;
        Scanner mysacn=new Scanner(System.in);
        System.out.println("Enter Your Switch numer");
      switchtest=mysacn.nextInt();
        switch (switchtest){

            case 1:
                switchtest=786;
                break;
            case 2:
                System.out.println("AHMAD");
                break;
            case 3:
                System.out.println("Saeed");
                break;
            default:
                System.out.println("Enter Wormng number");

        }
        //System.out.println(name);
        System.out.println(switchtest);
        System.out.println("");
    }
}
