package week_13.finallKeyWord;

public class BMW extends AClass {


    public BMW(String name, int door,String model) {
        super(name, door,model);
    }


    public static void main(String[] args) {
        var bmw=new BMW("CAR", 4,"xtl");
        System.out.println(bmw.getName());
        System.out.println(bmw.getDoor());
        System.out.println(bmw.getModel());
    }
}
