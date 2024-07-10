package week_11.test;

public class ReversedStringBuilder {
    public static void main(String[] args) {
        String original="Hello Word";
        String reversed=reverseusingLoop(original);
        System.out.println("Original: "+original);
        System.out.println("Reversed: "+reversed);

    }

    public static String reverseusingLoop(String str){
        char[] chars=str.toCharArray();
        StringBuilder reversed=new StringBuilder();
        for (int i=chars.length-1;i>=0;i--){
            reversed.append(chars[i]);

        }
        return reversed.toString();
    }
}
