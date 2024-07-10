package week_10.day_1;

public class RunCar {

    public static void main(String[] args) {
        var myBbject=new car();
        myBbject.camopnyname="Toyota";
        myBbject.trim="Coralla";
        myBbject.hook="good";

        myBbject.printMessage();
        System.out.println(myBbject.camopnyname);
        System.out.println(myBbject.trim);
        System.out.println(myBbject.hook);
        myBbject.startengien();

    }
}
