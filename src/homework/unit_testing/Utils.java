package homework.unit_testing;

import java.util.List;
import java.util.ArrayList;

public class Utils {

    public int multiply(int a, int b) {
        return a * b;
    }

    public String greet(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, stranger!";
        }
        return "Hello, " + name + "!";
    }

    public boolean containsVowel(String word) {
        if (word == null) return false;
        return word.toLowerCase().matches(".*[aeiou].*");
    }

    public List<Integer> getEvenNumbersUpTo(int max) {
        List<Integer> evens = new ArrayList<>();
        for (int i = 0; i <= max; i++) {
            if (i % 2 == 0) {
                evens.add(i);
            }
        }
        return evens;
    }

    public void throwIfNegative(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative number not allowed");
        }
    }
}
