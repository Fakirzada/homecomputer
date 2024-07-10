package week_9.day_1;

import java.util.Scanner;

public class Hrinfomation {

    int id;
    String firstname;
    String lastName;
    String gender;
    int dateOfBirth;
    String occupation;


    public  void InputUserInfo(){

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
    }

    public void infroprint(){
        var myob = new Hrinfomation();
        System.out.println(id);
        System.out.println(firstname);
        System.out.println(lastName);
        System.out.println(gender);
        System.out.println(dateOfBirth);
        System.out.println(occupation);

    }



}
