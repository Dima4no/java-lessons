package homework.custom_list;

import java.util.Iterator;

public class CustomListIterator<E> implements Iterator<E> {

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
        return elements[currentIndex++];
    }
}
