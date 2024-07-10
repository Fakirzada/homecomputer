package week_8.day_2;

public class loop33 {
    public static void main(String[] args) {


        String meaage="Wellcomn, to TEK School";

        String[] listmes=meaage.split(" ");
        String [] jav=meaage.split(",");

        for( String value:listmes){

            System.out.println(value);
        }

        for (String value1:jav){

            System.out.println(value1);
        }
    }
}
