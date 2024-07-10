package Week_3.Lab;

public class Question8 {
    public static void main(String[] args) {

        String str ="Learning java is fun";
       int result= str.length()/2-1;
       char mideel=str.charAt(result);
        System.out.println(mideel);
        System.out.println(result);
        System.out.println(str.length()/2-1);
        System.out.println(str.charAt(9));

        System.out.println(str.charAt(str.length()/2-1));  // this the best solution for this question



    }
}
