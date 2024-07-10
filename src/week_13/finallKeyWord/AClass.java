package week_13.finallKeyWord;

public class AClass {


    private final String name;
    private final int door;
    private String model;


    public AClass(String name, int door,String model) {
        this.name = name;
        this.door = door;
        this.model=model;
    }

    public String getName() {return name;}

    public String getModel() {return model;}

    public int getDoor() {return door;}

    public void setModel(String model) {
        this.model = model;
    }
}
