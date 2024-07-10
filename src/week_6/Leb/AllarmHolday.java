package week_6.Leb;
import java. util. Scanner;
import java. util. *;
public class AllarmHolday {
    public static void main(String[] args) {


        boolean weekend = false;
        boolean holday = false;
        boolean weekday= true;

        if (weekday==true){

            System.out.println("Alarm is ON");
        } else if (weekend==true || holday==true) {
            System.out.println("alarm is ON");
        }
        else {
            System.out.println("Alarm off");
        }


    }
}
