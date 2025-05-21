package lessons.linked_list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingleLinkedListTest {

    @Test
    public void testAddAndGet() {
        MyCustomLinkedList<String> list = new MyCustomLinkedList<>();
        list.add("a");
        list.add("b");

        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testAddForIndex() {
        MyCustomLinkedList<String> list = new MyCustomLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1, "test");

        assertEquals("test", list.get(1));
    }

    @Test
    public void testContainsTrue() {
        MyCustomLinkedList<String> list = new MyCustomLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        assertTrue(list.contains("b"));
    }

    @Test
    public void testContainsFalse() {
        MyCustomLinkedList<String> list = new MyCustomLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        assertFalse(list.contains("v"));
    }

    @Test
    public void testClear() {
        MyCustomLinkedList<String> list = new MyCustomLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        list.clear();

        assertEquals(0, list.size());
        assertTrue(list.isEmpty());
        assertFalse(list.contains("b"));
    }

    @Test
    public void testSet() {
        MyCustomLinkedList<String> list = new MyCustomLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        list.set(0, "e");

        assertEquals("e", list.get(0));
    }
}
