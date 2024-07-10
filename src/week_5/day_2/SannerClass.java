package week_5.day_2;
import java. util. Scanner;
import java. util. *;
//import week_5.day_1.Scanner;

public class SannerClass {
    public static void main(String[] args) {
       // System.out.println("Hello");
        Scanner scanner = new Scanner(System.in);

        int id;
        String name;
        String lasteName;

        System.out.println("Enter ID");
        id=scanner.nextInt();
        System.out.println("Enter Name");
        name=scanner.next();
        System.out.println("Enter LateName");
        lasteName=scanner.next();
        System.out.println(id+" "+name+" "+lasteName);

    }
}
