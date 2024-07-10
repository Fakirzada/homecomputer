package week7.DAY4;

public class LOOPS {
    public static void main(String[] args) {
        int [] numer=  {1,2,3,4};

        int numers= 123;

        String name ="Saeed";
        System.out.println(name.replaceAll("Saeed","Khana") + name.length());

        System.out.println(numer[0]);
        System.out.println(numers);




        String [][] input= new String[2][2];
        input[0][0]="saeed";
        input[1][0]="Ali";

       // for (int i; i<input;i++){

         //   System.out.println(index);
       // }


        int []number={1,3,6,7};

        for (int i=0; i<number.length;i++)
        {
            System.out.println(number[i]);
            int reult=0;
            reult=number[i]+reult;
            System.out.println(reult);


        }

    }
}
