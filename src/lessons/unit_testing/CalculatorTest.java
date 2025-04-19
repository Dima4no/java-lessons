package lessons.unit_testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Runs once in the beginning, but not for each test");
    }

    @Before
    public void beforeEach() {
        calculator = new Calculator();
        System.out.println("Runs before each test");
    }

    @Test
    public void testAdd_PositiveNumbers_Successful() {
        System.out.println("test1");
        double result = calculator.add(2, 3);
        double expected = 5;
        assertEquals(expected, result, 0);
    }

    @Test
    public void testDivide_Successful() {
        System.out.println("test2");
        double result = calculator.divide(6, 2);
        double expected = 3;
        assertEquals(expected, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivide_DivideByZero_ThrowsException() {
        System.out.println("test3");
        calculator.divide(6, 0);
    }

    @Test
    public void testIsEven_Successful() {
        System.out.println("test4");
        assertTrue(calculator.isEven(4));
    }

    @Test
    public void testPrintSomething_Successful() {
        System.out.println("test5");
        assertNotNull(calculator.printSomething());
    }
}
