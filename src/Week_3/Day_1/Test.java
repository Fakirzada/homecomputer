package Week_3.Day_1;

import java.sql.SQLOutput;

public class Test

{

    public static void main(String[] args) {


        System.out.println("Welcome");

        String firstNmae="AAbbcwcrw";
        System.out.println(firstNmae.indexOf('w'));

        String tetxPhargraph="The contains method in Java is used to check if a certain element exists in a " +
                "collection such as a list, set, or string. Here's how you can use it: unchanged";

        System.out.println(tetxPhargraph.contains("method")); // True
        System.out.println(tetxPhargraph.contains("heelo"));// False
        System.out.println(tetxPhargraph.substring(10));
        System.out.println(tetxPhargraph.contains("change"));
        System.out.println(tetxPhargraph.contains("changed"));

        String nam= "Tony";
        String last="Tony";
        System.out.println(nam==last);

        String nam1 = new String("Tony");
        String last1=new String("Tony");
        System.out.println(nam1.equals(last1) ); //If you sued equals it mean compear the valuye of address other == compear the address of string
        System.out.println(nam1==last1);// Flas becuase it check the address of two objects it is means  they are not in the same address.


        byte num1=2;
        short num2=4;
        char num3='1';
        int num4=1;
        long num5= 12l;
        float num6= 13f;
        double num7= 55;

        int rerslut;
        rerslut=num1+num2+num3;

        int result= num1+num2+num3+num4;
        long reslu2=num1+num2+num3+num4+num5;
        double reslu3=num1+num2+num3+num4+num5+num6+num7;

        int result5= (int)num6+num4;
        System.out.println(result5);

        System.out.println(rerslut);


    }
}
