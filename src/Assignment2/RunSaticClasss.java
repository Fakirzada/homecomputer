package Assignment2;

public class RunSaticClasss {
    public static void main(String[] args) throws InterruptedException {
        var objec1 = new StaticClass();
        objec1.name = "Saeed";
        objec1.name = "Ali";
        objec1.countEmply++;

        try {
            System.out.println(objec1.name);
            System.out.println(5 / 0);
        }
        catch ( ArithmeticException e){
            System.out.println("Erroe");
        }
        System.out.println(objec1.countEmply);



        try {
            System.out.println(5 / 0);
        }
        catch ( Exception e){
            e.printStackTrace();
            System.out.println("Erorr");
        }

         String name="Saeed";

        int index=0;
        while ( index<=name.length()){

            index++;
            System.out.println(name);


        }

  int coun=1;
        for ( int i=1; i<=10;i++){
            System.out.println( coun+". "+i);
            coun++;
            Thread.sleep(1000);
        }


        for ( int i=10; i>=1;i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

    }
}
