package lessons.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionsExplanation {

    public static int doSomething(int one, int two) throws NegativeArgumentException {
        if (one < 0 || two < 0) {
            throw new NegativeArgumentException("Negative numbers are not allowed");
        } else {
            return one + two;
        }
    }

    public static void otherMethod() {
        // EXCEPTION HANDLING
        try {
            doSomething(-1, 2);
        } catch (NegativeArgumentException exception) {
            System.out.println("Caught exception: " + exception.getMessage());
        } finally {
            System.out.println("This block always executes");
        }
    }

    public static void main(String[] args) {

        otherMethod();

        try {
            FileInputStream fileInputStream = new FileInputStream("nonexistent.txt");
            // Do something with the file
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            System.out.println("This block always executes");
        }
    }

}
