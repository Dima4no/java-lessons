package homework.custom_list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyCustomList<E> implements List<E> {

    private E[] elements;
    private int initialCapacity;
    private int currentSize;

    public MyCustomList(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        this.elements = (E[]) new Object[initialCapacity];
        this.currentSize = 0;
    }

    public MyCustomList(E[] objects) {
        this.initialCapacity = objects.length;
        this.elements = objects;
        this.currentSize = objects.length;
    }

    // TODO: Implement this
    @Override
    public int size() {
        checkArray(elements);
        return elements.length; }

    // TODO: Implement this
    @Override
    public boolean isEmpty() {
        checkArray(elements);
        return elements.length == 0;
    }

    // TODO: Implement this
    @Override
    public boolean contains(Object o) {
        checkElement(o);
        for (int i = 0; i <= currentSize; i++) {
            if ( elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    // TODO: Implement this
    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    // TODO: Implement this
    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends E> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    // TODO: Implement this
    @Override
    public void clear() {

    }

    // TODO: Implement this
    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public E set(int i, E e) {
        return null;
    }

    @Override
    public void add(int i, E e) {

    }

    @Override
    public E remove(int i) {
        return null;
    }

    // TODO: Implement this
    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int i) {
        return null;
    }

    @Override
    public List<E> subList(int i, int i1) {
        return List.of();
    }

    public static void checkArray(Object[] elements) {
        if (elements == null) {
            throw new NullPointerException("Array can not be null!");
        }
    }

    public static <E> void checkElement(E e) {
        if (e == null) {
            throw new NullPointerException("Element can not be null!");
        }
    }
}
