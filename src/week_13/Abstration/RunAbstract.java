package week_13.Abstration;

public class RunAbstract extends Abstract {
    public static void main(String[] args) {
        var object=new RunAbstract("Dog",33);
        System.out.println(object.name);
        System.out.println(object.age);
        object.eat();
        object.makeSpound();

    }

    public RunAbstract(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Enat ");
    }

    @Override
    public void makeSpound() {
        System.out.println("baking");
    }
}
