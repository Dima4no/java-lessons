package homework.custom_list;

import java.util.Arrays;
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
        if (objects == null) {
            throw new NullPointerException("Array can not be null!");
        }
        this.initialCapacity = objects.length;
        this.elements = objects;
        this.currentSize = objects.length;
        this.currentIndex = 0;
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean contains(Object o) {
        validateElementNotNull(o);
        for (Object element : elements) {
            if (element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new CustomIterator<>(elements);
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, currentSize);
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(E e) {
        validateElementNotNull(e);
        if (currentSize == elements.length) {
            growCapacity();
        }
        elements[currentSize++] = e;
        return true;
    }

    // TODO: Implement this
    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index == -1) {
            return false;
        }
        if (index >= 0 && index < currentSize - 1) {
            System.arraycopy(elements, index + 1, elements, index, currentSize - index - 1);
        }
        if (index == currentSize - 1) {
            elements[index] = null;
        }
        currentSize--;
        return true;
    }

    // TODO: Implement this
    @Override
    public boolean containsAll(Collection<?> collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null!");
        }
        for (Object item : collection) {
            if (!contains(item)) {
                return false;
            }
        }
        return true;
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
        boolean marker = false;
        Iterator<E> it = this.iterator();
        while (it.hasNext()) {
            E element = it.next();
            if (contains(element)) {
                remove(element);
                marker = true;
            }
        }
        return marker;
    }

    // TODO: Implement this
    // удаляет из листа все элементы, которые не присутствуют в переданной коллекции
    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    // TODO: Implement this
    @Override
    public void clear() {
        for (int i = 0; i < currentSize; i++) {
            elements[i] = null;
        }
        currentSize = 0;
    }

    // TODO: Implement this
    @Override
    public E get(int i) {
        if (i < 0 || i >= elements.length) {
            throw new IllegalArgumentException("Index can not be less than 0 or bigger length of elements.");
        }
        return elements[i];
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
        if (i < 0 || i > elements.length) {
            throw new IndexOutOfBoundsException();
        } else {
            E element = elements[i];
            if (i == 0) {
                System.arraycopy(elements, 1, elements, 0, elements.length);
            } else if (i == elements.length - 1) {
                elements[i] = null;
            } else {
                System.arraycopy(elements, i + 1, elements, i, elements.length);
            }
            currentSize--;
            return element;
        }
    }

    // TODO: проверить есть ли этот обьект с помощью contains метода и если да, вернуть индекс пройдясь по листу циклом
    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    // TODO: проверить есть ли этот обьект с помощью contains метода и если да, вернуть ПОСЛЕДНИЙ индекс пройдясь по листу циклом
    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return new CustomListIterator<>(elements);
    }

    @Override
    public ListIterator<E> listIterator(int i) {
        throw new UnsupportedOperationException("Not implemented");
    }

    // TODO: возвращает кусок листа с индекса i по индекс i1
    @Override
    public List<E> subList(int i, int i1) {
        return List.of();
    }

    private static <E> void validateElementNotNull(E e) {
        if (e == null) {
            throw new NullPointerException("Element can not be null!");
        }
    }

    private void growCapacity() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}
