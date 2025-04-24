package homework.unit_testing;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UtilsTest {

    private Utils utils;

    @Before
    public void setUp() {
        utils = new Utils();
    }

    @Test
    public void testMultiply_TwoPositiveNumbers_Successful() {
        System.out.println("Test multiplying two positive numbers.");
        int result = utils.multiply(5,3);
        assertEquals("Multiplication of 5 * 3 should be 15.",15,result);
    }

    @Test
    public void testMultiply_ByZero_ReturnsZero() {
        System.out.println("Test multiplying by zero.");
        int result = utils.multiply(10, 0);
        assertEquals("Multiplication of 10 * 0 should be 0.", 0, result);
    }

    @Test
    public void testMultiply_PositiveAndNegative_ReturnsNegative() {
        System.out.println("Test multiplying positive and negative numbers.");
        int result = utils.multiply(3, -3);
        assertEquals("Multiplication of 3 * -3 should be -9", -9, result);
    }

    @Test
    public void testGreet_NormalName_Successful() {
        System.out.println("Test greeting with a normal name.");
        String result = utils.greet("Maria");
        assertEquals("Hello, Maria!", result);
    }

    @Test
    public void testGreet_EmptyString_Successful() {
        System.out.println("Test greeting with an empty string or null.");
        assertEquals("Hello, stranger!", utils.greet(""));
        assertEquals("Hello, stranger!", utils.greet(" "));
        assertEquals("Hello, stranger!", utils.greet("   "));
        assertEquals("Hello, stranger!", utils.greet(null));
    }

    @Test
    public void testContainsVowel_WithVowels_Successful() {
        System.out.println("Test a word with vowels.");
        assertTrue(utils.containsVowel("Apple"));
    }

    @Test
    public void testContainsVowels_WithoutVowels_Successful() {
        System.out.println("Test a word without vowels.");
        assertFalse(utils.containsVowel("rhythm"));
    }

    @Test
    public void testContainsVowels_WithNull_Success() {
        System.out.println("Test containsVowels method with null input.");
        assertFalse(utils.containsVowel(null));
    }

    @Test
    public void testGetEvenNumbersUpTo_WithZeroArgument_Successful() {
        System.out.println("Test getEvenNumberUpTo with zero argument.");
        List<Integer> expected = Arrays.asList(0);
        List<Integer> result = utils.getEvenNumbersUpTo(0);
        assertEquals(expected, result);
    }

    @Test
    public void testGetEvenNumbersUpTo_WithPositiveArgument_Successful() {
        System.out.println("Test getEvenNumberUpTo with positive argument.");
        List<Integer> expected = Arrays.asList(0, 2, 4);
        List<Integer> result = utils.getEvenNumbersUpTo(5);
        assertEquals(expected, result);
    }

    @Test
    public void testGetEvenNumbersUpTo_WithNegativeArgument_Successful() {
        System.out.println("Test getEvenNumberUpTo with negative argument.");
        List<Integer> expected = Arrays.asList();
        List<Integer> result = utils.getEvenNumbersUpTo(-1);
        assertEquals(expected, result);
    }

    @Test
    public void testThrowIfNegative_WithPositiveNumber_Successful() {
        System.out.println("Test throwIfNegative with positive number.");
        utils.throwIfNegative(5);
    }

    @Test
    public void testThrowIfNegative_WithZero_Successful() {
        System.out.println("Test throwIfNegative with zero.");
        utils.throwIfNegative(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testThrowIfNegative_WithNegative_Successful() {
        System.out.println("Test throwIfNegative with negative argument, should throw exception.");
        utils.throwIfNegative(-1);
    }
}
