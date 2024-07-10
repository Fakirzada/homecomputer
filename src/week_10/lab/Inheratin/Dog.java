package week_10.lab.Inheratin;

public class Dog extends Animals{

    public Dog(String sleap, String name, String age) {
        super(sleap, name, age);
    }

    public void   barking(){

        System.out.println(name);
        System.out.println(age);
        System.out.println(sleap);
        System.out.println("Dog Barking");

    }
}
