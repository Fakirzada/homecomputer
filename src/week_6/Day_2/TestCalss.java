package week_6.Day_2;

public class TestCalss {
    public static void main(String[] args) {

        String tex="The OR operation, often denoted by the symbol \"∨\" " +
                "or by the word ";
        String outsietext="In everyday language, you can " +
                "think of the OR operation";

        if ( tex.equals(outsietext)){

            System.out.println("Terxt Is Equal");
        }
        else {

            System.out.println(" Text is not Equal");
        }
        if (!(tex.equals(outsietext)))
        {
            System.out.println(" Text is not Equal");
        }
        else {
            System.out.println("Text is not Equal");
        }
    }
}
