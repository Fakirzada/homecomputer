package All_Assignment.Vehicle;

public class Vehicle {

    private String Company;
    private String model;
    public Vehicle(String company, String model) {
        Company = company;
        this.model = model;
    }
    public String getCompany() {return Company;}
    public String getModel() {return model;}
    private void setCompany(String company) {Company = company;}
    private void setModel(String model) {this.model = model;}
}
