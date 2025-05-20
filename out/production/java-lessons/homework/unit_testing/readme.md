# Java Unit Testing Practice

In this exercise you will practice writing **unit tests** in Java using **JUnit 4 or 5 (up to you)**.

You are given a utility class called `Utils.java`, which contains several methods with different return types. Your task is to write tests for each method to make sure it works correctly.

---

## 📁 Files Overview

### `Utils.java`

This class includes:

| Method | Description |
|--------|-------------|
| `multiply(int a, int b)` | Returns the product of two integers. |
| `greet(String name)` | Returns a greeting message based on the input name. |
| `containsVowel(String word)` | Checks if a word contains at least one vowel. |
| `getEvenNumbersUpTo(int max)` | Returns a list of even numbers from 0 up to `max`. |
| `throwIfNegative(int number)` | Throws an exception if the input number is negative. |

---

## 🧪 Your Task

Create a class called `UtilsTest.java` and write unit tests for **each method** in the `Utils` class.

Here’s what to test for each method:

### `multiply(int a, int b)`
- ✅ Multiplying two positive numbers
- ✅ Multiplying by zero
- ✅ Multiplying a positive and a negative number

### `greet(String name)`
- ✅ Normal name like `"Maria"`
- ✅ Empty string or whitespace
- ✅ Null input

### `containsVowel(String word)`
- ✅ Word with vowels (e.g. `"apple"`)
- ✅ Word without vowels (e.g. `"rhythm"`)
- ✅ Null input

### `getEvenNumbersUpTo(int max)`
- ✅ max = 0 → `[0]`
- ✅ max = 5 → `[0, 2, 4]`
- ✅ max = -1 → `[]`

### `throwIfNegative(int number)`
- ✅ Positive number → should not throw
- ✅ Zero → should not throw
- ✅ Negative number → should throw `IllegalArgumentException`

---