package week7.DAY4;

public class TestLoo2 {
    public static void main(String[] args) {
        int [] numbers={1,3,6,7};
         int totalArray=0;

         //  for loop
        for (int inex = 0; inex<numbers.length;inex++){
            totalArray++;

            System.out.println(numbers[inex]);

        }
        System.out.println("*** First ***");
        ///  Enhanced for loop
        for ( int print:numbers)
        {
            System.out.println(print);

        }

        System.out.println("*** Second ***");
        System.out.println(totalArray);

    }
}
