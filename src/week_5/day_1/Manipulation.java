package week_5.day_1;

public class Manipulation {

    public static void main(String[] args) {
        String str = "Hello, World!";

        String upperCase = str.toUpperCase();
        System.out.println(upperCase);

        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);

        String replaced = str.replace("Hello", "Hi");
        System.out.println(replaced);

        int length = str.length();
        System.out.println(length);
    }

}
