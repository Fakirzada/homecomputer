package week7.lab;

public class ARRAYS {
    public static void main(String[] args) {
        String[] name = {"Saeed", "Ali", "Khan"};


        for (int index = 0; index < name.length; index++) {
            System.out.println(name[index]);
        }


        for ( String print : name){

            System.out.println(print);
        }


    }
}
