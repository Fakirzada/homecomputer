package All_Assignment.Vehicle;

public class car extends Vehicle {
    private int numberOfDoors;
    public car(String company, String model, int numberOfDoors) {
        super(company, model);
        this.numberOfDoors = numberOfDoors;
    }
    public int getNumberOfDoors() {return numberOfDoors;}
    public void setNumberOfDoors(int numberOfDoors) {this.numberOfDoors = numberOfDoors;}

    public void printVhiceInfo(){
        System.out.println("Company: "+getCompany());
        System.out.println("Model: "+getModel());
        System.out.println("Number OF Doors: "+getNumberOfDoors());
    }
}
