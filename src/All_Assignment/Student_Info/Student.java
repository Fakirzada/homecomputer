package All_Assignment.Student_Info;

public class Student extends Person {

    private String stunetID;

    public Student(String name, String age, String stunetID) {
        super(name, age);
        this.stunetID = stunetID;
    }

    private String getStunetID(){return stunetID;}
    private void setStunetID(String stunetID){this.stunetID=stunetID;}

    public void printSudentInfor(){
        System.out.println("Student ID: "+getStunetID());
        System.out.println("Student Name: "+getName());
        System.out.println("Student Age: "+getAge());

    }
}


