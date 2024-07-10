package week_13.Abstration;

public abstract class  Abstract {

    String name;
    int age;

    public Abstract(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
    public abstract  void makeSpound();

}
