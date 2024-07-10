package All_Assignment.Vehicle;

public class RunApp {
    public static void main(String[] args) {
        var carObject=new car("Tyoto","Corolla",4);
        var carobj1=new car("BMW","x4",4);
        carObject.printVhiceInfo();

        for (int i=1; i<=30;i++){System.out.print("*");}
        System.out.println();
        carobj1.printVhiceInfo();
    }
}
