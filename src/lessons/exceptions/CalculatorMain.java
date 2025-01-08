package lessons.exceptions;

public class CalculatorMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try{
            calculator.divide(10, 0);
        }
        catch (ArithmeticException exception){
            System.out.println("Division by zero is not allowed!");
        }
    }

}
