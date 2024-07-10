package week_10.lab.Inheratin;

public class Animals {
    String sleap;
    String name;
    String age;

    public Animals(String sleap, String eat, String color) {
        this.sleap = sleap;
        this.name = eat;
        this.age = color;
    }

    public String getSleap() {return sleap;}
    public String getEat() {return name;}
    public String getColor() {return age;}

    public void setSleap(String sleap) {this.sleap = sleap;}
    public void setEat(String eat) {this.name = eat;}
    public void setColor(String color) {this.age = color;}

    public void AnimalSleap(){System.out.println("All Alimal Sleap");}
}
