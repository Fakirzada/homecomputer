package week_6.Day_2;

public class Ifcondi {
    public static void main(String[] args) {
        if (true&& false&& 10<5&&true|| true&&true){
            System.out.println("A");
            if (true&&false||  false&&true){
                System.out.println("B");
            }
            else {
                System.out.println("C");
            }
            {
                if (true || false){
                    System.out.println("Z");
                }
            }
            System.out.println("H");
        }
        else {

            System.out.println("Java is easy");
        }


        boolean a = true;
        boolean b = false;

        // Using the && operator to perform the AND operation
        boolean result = a && b;

        System.out.println("Result of a && b: " + result); // This will print "false"

        // not opepator

        String firstname="Jan";
        String lastNamer="Don";
        System.out.println(!(firstname.equals(lastNamer)));

        // for paswspwrd

        String newPasword="Saeed";
        String reEnterPassword="saeed";

        if( newPasword.equals(reEnterPassword) ){

            System.out.println("Change Successfuly");
        }
        else {
            System.out.println("New Passwor Not Much it");
        }
    }
}
