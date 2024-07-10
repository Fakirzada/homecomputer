package week_5.DAY_4;
import java. util. Scanner;
import java. util. *;
public class boolen {
    public static void main(String[] args) {

        Scanner mscan= new Scanner(System.in);

        System.out.println("Enter temperture");
      int temperature = mscan.nextInt();
      if (temperature<= 10){
          System.out.println("Wear your coat");
      } else if (temperature >=10 && temperature<=20) {
          System.out.println("Alight lacket  will do ");
      }
      else if (temperature>=20) {
          System.out.println("it s warm, just a T-shirt is fine");

      }


    }
}
