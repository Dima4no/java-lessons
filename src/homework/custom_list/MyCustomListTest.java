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
        myCustomList.add("apple");
        myCustomList.add("banana");
        myCustomList.add("coconut");
        assertEquals(3, myCustomList.size());
    }

    @Test
    public void testIsEmpty_WithEmptyArray() {
        myCustomList = new MyCustomList<>(1);
        assertTrue(myCustomList.isEmpty());
    }

    @Test
    public void testIsEmpty_WithOneElement() {
        myCustomList = new MyCustomList<>(1);
        myCustomList.add("apple");
        assertFalse(myCustomList.isEmpty());
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
        assertEquals(4, myCustomList.size());
    }

    @Test
    public void testContainsAll() {
        String[] fruits = new String[] {"apple", "banana", "coconut"};
        MyCustomList<String> myCustomList = new MyCustomList<>(fruits);
        List<String> test = new ArrayList<>(List.of("banana", "coconut"));
        assertTrue(myCustomList.containsAll(test));
    }

    @Test
    public void testClear() {
        String[] fruits = new String[] {"apple", "banana", "coconut"};
        MyCustomList<String> myCustomList = new MyCustomList<>(fruits);
        myCustomList.clear();
        assertEquals(0, myCustomList.size());
    }
}
