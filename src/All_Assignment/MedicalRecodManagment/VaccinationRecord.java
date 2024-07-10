package All_Assignment.MedicalRecodManagment;

public class VaccinationRecord extends MedicalRecod {

    private String vaciinationType;

    public VaccinationRecord(String patinetName, String vaccinationRecord, String vaciinationType) {
        super(patinetName, vaccinationRecord);
        this.vaciinationType = vaciinationType;
    }

    private String getVaciinationType() {return vaciinationType;}
    private void setVaciinationType(String vaciinationType) {this.vaciinationType = vaciinationType;}

    public void printPatient(){
        System.out.println("Patient Name: "+ getPatinetName());
        System.out.println("Vaccination Type: "+ getVaciinationType());
        System.out.println("Vaccination Records: "+getVaccinationRecord());

    }
}
