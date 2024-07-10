package Assignment2;
import java. util. Scanner;


public class fistProgramm {

    public static void main(String[] args) {
        var object=new fistProgramm();
        object.printFirstWord();
    }

  public void printFirstWord(){
      Scanner myscanner=new Scanner(System.in);
      System.out.println("Enter Your World");
      String []word1= new String[]{myscanner.next()};

      for (int i = 0; i < word1.length; i++) {
          System.out.println("Index " + i + ": " + word1[i]);
      }

  }


}
