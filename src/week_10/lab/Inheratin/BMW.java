package week_10.lab.Inheratin;

public class BMW extends Vehicle {

    public BMW(String modle, String compnay, String trim) {
        super(modle, compnay, trim);
    }

    public void honk(){

        System.out.println(compnay);
        System.out.println(modle);
        System.out.println(trim);
        System.out.println("Car Honk");

  }
}
