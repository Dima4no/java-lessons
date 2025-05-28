package lessons.linked_list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.List;
import org.junit.Test;

public class MyCustomLinkedListTest {

    @Test
    public void testAdd_successfulyAdded() {
        MyCustomLinkedList<String> list = new MyCustomLinkedList<>();
        list.add("a");
        list.add("b");

        assertEquals("a", list.get(0));
        assertEquals("b", list.get(1));
    }

    @Test
    public void testAdd_IndexIsInOrder() {
        MyCustomLinkedList<String> list = new MyCustomLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1, "test");

        assertEquals("test", list.get(1));
    }

    @Test
    public void testContains_successfulyFound() {
        MyCustomLinkedList<String> list = new MyCustomLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        assertTrue(list.contains("b"));
    }

    @Test
    public void testContains_notFound() {
        MyCustomLinkedList<String> list = new MyCustomLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        assertFalse(list.contains("v"));
    }

    @Test
    public void testClear_listCleared() {
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
    public void testSet_elementReplaced() {
        MyCustomLinkedList<String> list = new MyCustomLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        list.set(0, "e");

        assertEquals("e", list.get(0));
    }

    @Test
    public void testAddAll_successfullyAdd() {
        MyCustomLinkedList<Integer> list = new MyCustomLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(7);

        Collection<Integer> collection = List.of(4, 5);
        list.addAll(3, collection);
        assertEquals(7, list.size(), 0);
        assertEquals(4, list.get(3), 0);
        assertEquals(5, list.get(4), 0);
    }

    @Test
    public void testGet_validIndex_returnsCorrectElement() {
        MyCustomLinkedList<Integer> list = new MyCustomLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(Integer.valueOf(3), list.get(2));
    }
}
