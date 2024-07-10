package Week_3.Lab;

import java.sql.SQLOutput;

public class Questions10 {
    public static void main(String[] args) {


        String srt= "Flood Door";
     srt=srt.replace('o','e');
        System.out.println(srt);

        System.out.println(srt.replaceAll("e","o"));


        System.out.println( srt.replaceAll("[A-Z]",""));
        System.out.println( srt.replaceAll("[a-z]",""));
    }
}
