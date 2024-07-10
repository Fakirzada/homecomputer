package week_6.Day_3;
import java. util. Scanner;
import java. util. *;
public class SecurtyLogin {
    public static void main(String[] args) {

        int pass=1234;
        Scanner mysacn= new Scanner(System.in);
        System.out.println("Enter SecreateCode");
        int secretCode =mysacn.nextInt();
        if ( pass==secretCode)
        {
            System.out.println("Access granrted");
        }
        else System.out.println("Access denied");

    }
}
