package homework.custom_list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyCustomListTest {

    private MyCustomList<String> myCustomList;

    @Test
    public void testSize_WithSizeFive() {
        myCustomList = new MyCustomList<>(5);
        assertEquals(5, myCustomList.size());
    }

    @Test
    public void testIsEmpty_WithEmptyArray() {
        myCustomList = new MyCustomList<>(0);
        assertTrue(myCustomList.isEmpty());
    }

    @Test
    public void testContains_WithExistsArgument() {
        String[] fruits = new String[] {"apple", "banana", "coconut"};
        MyCustomList<String> myCustomList = new MyCustomList<>(fruits);
        assertTrue(myCustomList.contains("banana"));
    }

    @Test
    public void testContains_WithDoesNotExistsArgument() {
        String[] fruits = new String[] {"apple", "banana", "coconut"};
        MyCustomList<String> myCustomList = new MyCustomList<>(fruits);
        assertFalse(myCustomList.contains("carrot"));
    }

    @Test
    public void testAdd_WithNewElement() {
        String[] fruits = new String[] {"apple", "banana", "coconut"};
        MyCustomList<String> myCustomList = new MyCustomList<>(fruits);
        assertTrue(myCustomList.add("durian"));
        assertEquals(6, myCustomList.size());
    }

    @Test
    public void testContainsAll() {
        String[] fruits = new String[] {"apple", "banana", "coconut"};
        MyCustomList<String> myCustomList = new MyCustomList<>(fruits);
        List<String> test = new ArrayList<>(List.of("banana", "coconut"));
        assertTrue(myCustomList.containsAll(test));
    }
}
