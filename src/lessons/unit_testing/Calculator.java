package lessons.unit_testing;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public String printSomething() {
        return "Hello World";
    }
}
