package week_8.lab;

public class activeity02 {

    public static void main(String[] args) {
        String message=" Weelocme To Tek School Java  Easy! 123 *&%^$$ SASS";

        String[] parts=message.split("(?)=[A-Z]=[a-z]=[0-100]");

        System.out.println(message.replaceAll("[^0-1]","1-9"));

        for( String part:parts){
            System.out.println(part);
        }

        //message.split("  ");
        //System.out.println(message);


    }
}
