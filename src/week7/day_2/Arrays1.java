package week7.day_2;

import java.util.ArrayList;

public class Arrays1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<>();
        numbersList.add(10);
        numbersList.add(20);
        numbersList.add(30);

        int sum = 0;
        for (int number : numbersList) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}
