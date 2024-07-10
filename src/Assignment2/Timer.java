package Assignment2;

public class Timer {
    public static void main(String[] args) throws InterruptedException {


        for (int timer=5;timer>=1;timer--){

            System.out.println(timer);
            Thread.sleep(1000);
        }
    }
}
