package week_6.Day_3;
import java. util. Scanner;
import java. util. *;
public class Testing {
    public static void main(String[] args) {
         Scanner mySacn= new Scanner(System.in);
        String isMemebr=mySacn.next();
        int member=2;

        switch (member){

            case 1:
                isMemebr ="yes";

                int num=10;
                int num1= 20;
                int resum= num1+num;
                System.out.println(resum);

                break;
            case 2:
               isMemebr="no";
                System.out.println("noooooo");
                break;
        }


    }
}
