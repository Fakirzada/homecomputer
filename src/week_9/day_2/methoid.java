package week_9.day_2;

public class methoid {


    // A method that returns a greeting message
    public String getGreeting(String name) {
        return "Hello, " + name + "!";
    }

    // A method that adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // The main method to run the examples
    public static void main(String[] args) {
        methoid myClass = new methoid();

        // Call the getGreeting method
        String greeting = myClass.getGreeting("Alice");
        System.out.println(greeting);  // Output: Hello, Alice!

        // Call the add method
        int sum = myClass.add(5, 3);
        System.out.println(sum);  // Output: 8
    }
}
