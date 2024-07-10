package Week_3.Lab;

public class Upercase {
    public static void main(String[] args) {
        String mess ="Hello Java World";
        System.out.println(mess.substring(2));
        System.out.println(mess.substring(6,11));
        String b=mess.substring(3,15);
        System.out.println(b);

        System.out.println(mess.indexOf("Java"));
        System.out.println(mess.indexOf("World"));
        System.out.println(mess.substring(11));
        System.out.println(mess.length());
        System.out.println(mess.replace(" ","").length());


    }
}
