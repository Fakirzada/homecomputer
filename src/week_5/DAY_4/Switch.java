package week_5.DAY_4;
import java. util. Scanner;
import java. util. *;
public class Switch {
    public static void main(String[] args) {
   int day=7;
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Day Numer");
        day=myscanner.nextInt();
   switch (day){
       case 1:
           System.out.println("Saturday" );
           break;
       case 2:
           System.out.println("Sunday");
           break;
       case 3:
           System.out.println("Monday");
           break;
       case 4:
           System.out.println("Tuesday");
           break;
       case 5:
           System.out.println("Wdnesday");
           break;
       case 6:
           System.out.println("Thursday");
           break;
       case 7:
           System.out.println("Firday");
           break;
       default:
           System.out.println("Invaild Number");
   }

        /*
        Saturday
        Sunday
        Monday
        Tuesday
        Wdnesday
        Thursday
        Firday

         */
    }
}
