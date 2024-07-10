package week7.day_1;

import java.util.stream.Stream;

public class Arrays1 {
    public static void main(String[] args) {
        String[] list=new String[2];
        list[0]="Saeed";
        list[1]="Ali";
        System.out.println(list[1]);


        int [] number= new int[5];
        number[0]=10;
        number[1]=20;
        number[2]=60;
        number[3]=70;
        number[4]=80;
        System.out.println("Value 1: "+number[0]);
        System.out.println("Value 2: "+number[1]);
        System.out.println("Value 3: "+number[2]);
        System.out.println("Value 4: "+number[3]);
        System.out.println("Value 5: "+number[4]);

        String name="Saeed";
        System.out.println(name);

        // Static initi;azation

        String [] lastName = {"Fakie", "Smanady","KHAN","Ali"};
        System.out.println(lastName[0]+lastName[1]);

        for (String printAll : lastName){
            System.out.println(printAll);
        }

        int[]num1={1,2,5,6};
        System.out.println(num1[0]);
        System.out.println(num1[num1.length-2]);

        for ( int num2: num1){
            System.out.println(num2);
        }


    }
}
