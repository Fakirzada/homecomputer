package week_6.Day_3;
import java. util. Scanner;
import java. util. *;
public class MatchPass {

    public static void main(String[] args) {

        String pass="JavaRocks";
        Scanner mysacn= new Scanner(System.in);
        System.out.println("Enter SecreateCode");
        String secretCode =mysacn.next();
        if ( pass.equals(secretCode))
        {
            System.out.println("Access granrted");
        }
        else System.out.println("Access denied");

    }
}
