package week_8.day_2;

public class loop2D {
    public static void main(String[] args) {
        String[][] arrayName = {
                {"Ahmaf", "Jav", "khan"},
                {"KK", "KHOB"},
                {"kABUL","aFGHAN"}
        };

        for( int row=0;row<arrayName.length;row++){

            for (int col=0;col<arrayName.length;col++){

                System.out.println(arrayName[row][col]);
            }
            System.out.println();
        }


    }
}
