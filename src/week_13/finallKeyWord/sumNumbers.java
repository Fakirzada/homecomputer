package week_13.finallKeyWord;

public class sumNumbers {

    public static void main(String[] args) {
int result=sumthreenumbers(1,23,3);
        System.out.println(result);
 double resultd=sumthreenumbers(10.3,12.4,12.4);
        System.out.println(resultd);



        String name="Saeed";
        System.out.println(name);
        System.out.println(name.replace('S','d'));
        name=name;
        System.out.println(name);
        System.out.println(name.replace("Saeed","khan"));



    }

    public static   int sumthreenumbers( int number1, int numer2, int numner3){
        return number1+numer2+numner3;
    }

    public static   double sumthreenumbers( double number1, double numer2, double numner3) {
        return number1 - numer2 + numner3;
    }
}
