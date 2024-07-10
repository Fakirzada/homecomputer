package week_5.DAY_4;

import javax.print.DocFlavor;

public class conditionoperator {
    public static void main(String[] args) {
        String color1= "bule";
        String color2= "Red";
        String fovert;
        fovert=(color1.equals(color2)?color2:color1);
        System.out.println("first: "+ fovert);
        /// other example

        String check1="Test1";
        String check2="Test2";
        String result;

        result=(check1.equals(check2)?check2:check1);

        if (color1.equals(check2))
        {
            fovert=check1;
        }
        else {
            fovert=check1;
        }

         int color=2;
        switch (color){
            case 1:
                fovert=check2;
                break;
            case 2:
                fovert=color2;
                break;
            default:
                System.out.println("worng");
        }
        System.out.println("Secobnd:  " +fovert);

    }
}
