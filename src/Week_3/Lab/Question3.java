package Week_3.Lab;

public class Question3 {

    public static void main(String[] args) {


        String a="Hm hello the world";
        String b=a.replaceAll(" ", "");
        System.out.println(b.length());
        System.out.println(a.length());
        System.out.println((a.replace(" ","").length()));

        String mesa = "Hello, The World";
        String test=mesa.replaceAll("Hello, The World", "Hello, The World22");
        System.out.println(test);
        System.out.println(mesa.replaceFirst("H","G"));




    }
}
