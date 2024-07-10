package week_5.Lab;
import java. util. Scanner;
import java. util. *;
public class Condition {
    public static void main(String[] args) {
        // find Max number of three numbers
        int num1 = 10;
        int num2 = 50;
        int num3 = 10;
        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println(max);

        //using the if condition to find Max number
        if (num1>num2 && num1>num3){
            System.out.println("Num1 is grade then Num3 and Num2");
        } else if (num2>num1 && num2>num3) {
            System.out.println("Num2 is grade then Num3 and Num2");
        } else if (num3>num1 && num3>num2) {
            System.out.println("Num3 is grade then Num3 and Num2");
        }
        else {

            System.out.println("The number is Equal");
        }
    }

}

