package week7.DAY4;

public class looptwat1 {
    public static void main(String[] args) {

        int[] numbers = {10, 0, 1, 2, 3, 4, 5, 6, 11, 20, 23, 87, 89};
         int coutOddNumer=0;
         int evenNuber=0;
        for (int index=0;index<numbers.length;index++) {

             //System.out.println(numbers[index]);

            if (numbers[index] % 2 == 0) {  // Check if the number is odd
                evenNuber++;
                System.out.println(numbers[index]);
            }
            else {
                coutOddNumer++;
            }
        }
        System.out.println("total Odd Number: "+coutOddNumer);
        System.out.println("Total even Number:"+evenNuber);
}}
