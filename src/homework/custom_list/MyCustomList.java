package homework.custom_list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyCustomList<E> implements List<E> {

    private E[] elements;
    private int initialCapacity;
    private int currentSize;
    private int currentIndex;

    public MyCustomList(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        this.elements = (E[]) new Object[initialCapacity];
        this.currentSize = 0;
        this.currentIndex = 0;
    }

    public MyCustomList(E[] objects) {
        if (elements == null) {
            throw new NullPointerException("Array can not be null!");
        }
        this.initialCapacity = objects.length;
        this.elements = objects;
        this.currentSize = objects.length;
        this.currentIndex = 0;
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public boolean isEmpty() {
        return elements.length == 0;
    }

    @Override
    public boolean contains(Object o) {
        validateElementNotNull(o);
        for (int i = 0; i <= currentSize; i++) {
            if (elements[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new CustomListIterator<>(elements);
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(E e) {
        validateElementNotNull(e);
        if (currentIndex < elements.length) {
            elements[currentIndex] = e;
            currentIndex++;
        } else {
            E[] newElements = (E[]) new Object[elements.length * 2];
            // System.arraycopy(что копировать, с какого индкеса, куда копировать, на какой индекс, сколько копировать)
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
            elements[currentIndex] = e;
            currentIndex++;
        }
        return true;
    }

    // TODO: Implement this
    @Override
    public boolean remove(Object o) {
        // 1. Если удаляемый элемент находится на 0ом индексе - А В С - все элементы сдвигаются влево, остается 2 элемента - B C
        // 2. Если удаляемый элемент находится на последнем индексе - A B C - все элементы остаются на своих местах, удаляем последний элемент, делаем null
        // 3. Если удаляемый элемент находится в середине - A B C D - все элементы сдвигаются влево, остается A B D
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

    // TODO: Implement this
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

    // TODO: Implement this
    @Override
    public E set(int i, E e) {
        return null;
    }

    // TODO: Implement this
    @Override
    public void add(int i, E e) {
        // 1. Если индекс равен 0 и он занят, сдвигаем все вправо, если не занят, добавляем элемент на 0 индекс
        // 2. Если в середину, и этот индекс также занят, тоже сдвигаем все вправо, если не занят, добавляем элемент на этот индекс
    }

    @Override
    public E remove(int i) {
        return null;
    }


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

    private static <E> void validateElementNotNull(E e) {
        if (e == null) {
            throw new NullPointerException("Element can not be null!");
        }
    }
}
