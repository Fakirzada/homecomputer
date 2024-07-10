package week_6.Leb;
import java. util. Scanner;
import java. util. *;
public class uerAndPass {

    public static void main(String[] args) {
         String username="Spartan";
         String password="Spartan@123";

         Scanner mysacn = new Scanner(System.in);
        System.out.println("Enter UserName");
        String user=mysacn.next();
        System.out.println("Enter Password");
        String pass=mysacn.next();

        if ( user.equals(username)&& pass.equals(password))
        {
            System.out.println("Access Granted ");
        }
        else {

            System.out.println("Invaild User AND passwrod ");
        }
    }
}
