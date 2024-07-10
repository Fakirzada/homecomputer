package All_Assignment.MedicalRecodManagment;

public class MedicalRecod {

    private String patinetName;
    private String vaccinationRecord;


    public MedicalRecod(String patinetName, String vaccinationRecord){
       this.patinetName=patinetName;
        this.vaccinationRecord=vaccinationRecord;
    }

    public String getPatinetName(){return patinetName;}
    public String getVaccinationRecord() {return vaccinationRecord;}

    public void setPatinetName(String patinetName) {this.patinetName = patinetName;}
    public void setVaccinationRecord(String vaccinationRecord) {this.vaccinationRecord = vaccinationRecord;}
}
