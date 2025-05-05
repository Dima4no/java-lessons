package homework.custom_list;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class CustomListIterator<E> implements ListIterator<E> {

    private E elements[];
    private int currentIndex;

    public CustomListIterator(E[] elements) {
        this.elements = elements;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < elements.length;
    }

    @Override
    public E next() {
        if(hasNext()){
            return elements[currentIndex++];
        }
        throw new NoSuchElementException("No such element!");
    }

    @Override
    public boolean hasPrevious() {
        return currentIndex > 0;
    }

    @Override
    public E previous() {
        if(hasPrevious()){
            return elements[currentIndex--];
        }
        throw new NoSuchElementException("No such element!");
    }

    @Override
    public int nextIndex() {
        return currentIndex;
    }

    @Override
    public int previousIndex() {
        return currentIndex - 1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove is not supported from this implementation!");
    }

    @Override
    public void set(E e) {
        throw new UnsupportedOperationException("Set is not supported from this implementation!");
    }

    @Override
    public void add(E e) {
        throw new UnsupportedOperationException("Add is not supported from this implementation!");
    }
}
