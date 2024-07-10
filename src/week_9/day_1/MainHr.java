package week_9.day_1;

import java.util.Scanner;

public class MainHr {

    public static void main(String[] args) {
        var myobj=new Hrinfomation();
        var userinput= new Scanner(System.in);
        System.out.println("Enter id");
        myobj.id=userinput.nextInt();
        System.out.println("enter name");
        myobj.firstname=userinput.next();
        System.out.println("enter Lastname");
        myobj.lastName=userinput.next();
        System.out.println("enter Gender");
        myobj.gender=userinput.next();
        System.out.println("enter DOB");
        myobj.dateOfBirth=userinput.nextInt();
        System.out.println("enter Occupation");
        myobj.occupation=userinput.next();

        //myobj.InputUserInfo();

        myobj.infroprint();

    }
}
