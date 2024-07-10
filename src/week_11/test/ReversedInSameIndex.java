package week_11.test;

import java.util.Arrays;

public class ReversedInSameIndex {
    public static void main(String[] args) {
        String original = "Hello Word";
        String reversed = reverseusingLoop(original);

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        /// cange date type

        int[] number={1,2,4,5,6};
        System.out.println(Arrays.toString(number));

        var strbilder=new StringBuilder("Saeed");
        System.out.println(strbilder);
        strbilder.append("Ali");
        System.out.println(strbilder);
        strbilder.reverse();
        System.out.println(strbilder);
        System.out.println(strbilder.delete(0,10));
        System.out.println(strbilder);


    }
    public static String reverseusingLoop(String str) {

        String[] words = str.split(" ");
        //StringBuilder reversed = new StringBuilder();
            String reversed="";
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reversed+=word.charAt(i);
            }
              reversed+=" ";
        }
        return reversed;
    }
}