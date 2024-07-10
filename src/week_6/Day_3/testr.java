package week_6.Day_3;
import java. util. Scanner;
import java. util. *;
public class testr {
    public static void main(String[] args) {

        String ismember="no";
        Scanner mysacn = new Scanner(System.in);
        System.out.println("Are you member Yes/No");
        ismember=mysacn.next();
        System.out.println("Enter your Orginal price ");
        double orgianlPrice=mysacn.nextDouble();
        double finalPrice;

        if (ismember.equals("yes")){

            finalPrice=orgianlPrice-(orgianlPrice*0.1);
            System.out.println("10 % memeber discount "+finalPrice);
        }
        else {
            System.out.println(" orginal price: "+orgianlPrice);
        }



    }
}
