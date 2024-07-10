package week7.DAY4;

public class Arrays5 {
    public static void main(String[] args) {


        String[][] name= new String[2][2];

        name[0][0]="saeed";
        name[0][1]="Ali";
        name[1][0]="khan";
        name[1][1]="jan";



        for (int index=0; index<name.length;index++){

            System.out.println(name[index]);
        }


    }
}
