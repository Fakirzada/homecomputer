package week_11.RevweseWords;

public class ResverdLoop {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseUsingLoop(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseUsingLoop(String str) {
        char[] chars = str.toCharArray();
       // String[] words=str.split(" ");

        StringBuilder reversed = new StringBuilder();

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }

        return reversed.toString();
    }
}
