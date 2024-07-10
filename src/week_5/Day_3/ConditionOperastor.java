package week_5.Day_3;

public class ConditionOperastor {
    public static void main(String[] args) {

        boolean isRaning = false;
        if (isRaning == true) {
            System.out.println("Take you Umberall");
        } else {
            System.out.println("No need take your umberall");
        }

        int x = -5;
        if (x > 0) {
            System.out.println("x is positive");
        } else if (x == 0) {
            System.out.println("x is zero");
        } else {
            System.out.println("x is negative");
        }
        String a="jan";
        String b="Jan";

        if (a.equals(b)){
            System.out.println("Yes");
        }
        else {
            System.out.println("NO");
        }
    }
}
