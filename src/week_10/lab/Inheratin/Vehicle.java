package week_10.lab.Inheratin;

public class Vehicle {
    String compnay;
    String modle;
    String trim;

    public Vehicle(String modle, String compnay, String trim) {
        this.modle = modle;
        this.compnay = compnay;
        this.trim = trim;
    }

    public String getCompnay() {return compnay;}

    public String getModle() {return modle;}

    public String getTrim() {return trim;}

    public void setCompnay(String compnay) {this.compnay = compnay;}

    public void setModle(String modle) {this.modle = modle;}

    public void setTrim(String trim) {this.trim = trim;}






    public void carStart(){
        System.out.println("All Car Can Start");
    }
    public void carStop(){
        System.out.println("All Car Can Stop");
    }
}
