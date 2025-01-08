package lessons.exceptions;

public class ExceptionsDemo {

    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 2;
            System.out.println(x / y);

            String text = null;
            System.out.println(text.length());

        }
        // МОЖНО, НО НЕ РЕКОМЕНДОВАНО:
//        catch (Exception exception){
//            if(exception instanceof ArithmeticException){
//                System.out.println("Division by zero is not allowed!");
//            }
//            else if(exception instanceof NullPointerException){
//                System.out.println("You are trying to get the length of a null object!");
//            }
//        }
        // ЛУЧШЕ ТАК:
        catch (ArithmeticException exceptions) {
            System.out.println("Division by zero is not allowed!");
        }
        catch (NullPointerException exceptions) {
            System.out.println("You are trying to get the length of a null object!");
        }

        System.out.println("ONE");
        System.out.println("TWO");
    }

}
