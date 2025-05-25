package lessons.linked_list;

import java.util.*;

/**
 * This class represents a singly linked list that implements a generic list interface.
 *
 * @param <T> data type passed to the list
 */
public class MyCustomLinkedList<T> implements List<T> {


    private Node<T> head;
    private int amountOfNodes;

    public MyCustomLinkedList() {
        this.head = null;
    }

    /*
     * --- ADD methods ---
     */
    @Override
    public boolean add(T data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node<>(data));
        }
        amountOfNodes++;
        return true;
    }

    @Override
    public void add(int index, T data) {
        int currentIndex = 0;
        Node<T> current = head;
        Node<T> newNode = new Node<>(data);
        while (currentIndex < index - 1) {
            current = current.getNext();
            currentIndex++;
        }
        newNode.setNext(current.getNext());
        current.setNext(newNode);
        amountOfNodes++;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> collection) {
        return false;
    }

    /*
     * --- GET methods ---
     */
    @Override
    public T get(int index) {
        // TODO: implement this
        if (amountOfNodes == 0) {
            throw new NoSuchElementException("SingleLinkedList is empty!");
        }

        if (index < 0 || index >= amountOfNodes) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + amountOfNodes);
        }

        Node<T> current = head;
        int currentIndex = 0;
        while (currentIndex < index) {
            current = current.getNext();
            currentIndex++;
        }
        return current.getData();
    }

    /*
     * --- REMOVE methods ---
     */
    @Override
    public boolean remove(Object objectToRemove) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return amountOfNodes;
    }

    @Override
    public boolean isEmpty() {
        return amountOfNodes == 0;
    }

    @Override
    public boolean contains(Object objectToCheck) {
        // TODO: implement this
        Node<T> current = head;
        while (current != null) {
            if (objectToCheck == null ? current.getData() == null : objectToCheck.equals(current.getData())) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }


    @Override
    public boolean containsAll(Collection<?> collection) {
        // TODO: implement this
        for (Object item : collection) {
            if (!contains(item)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {
        // TODO: implement this
        head = null;
        amountOfNodes = 0;
    }

    @Override
    public T set(int index, T data) {
        // TODO: implement this
        if (index < 0 || index >= amountOfNodes) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for size " + amountOfNodes);
        }

        Node<T> current = head;
        int currentIndex = 0;
        while (currentIndex < index) {
            current = current.getNext();
            currentIndex++;
        }
        T prev = current.getData();
        current.setData(data);
        return prev;
    }

    @Override
    public int indexOf(Object objectToRetrieve) {
        // TODO: implement this
        Node<T> current = head;
        int currentIndex = 0;

        while (currentIndex < amountOfNodes) {
            if (current.getData() == null ? objectToRetrieve == null
                    : objectToRetrieve.equals(current.getData())) {
                return currentIndex;
            }
            current = current.getNext();
            currentIndex++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object objectToRetrieve) {
        return 0;
    }

    @Override
    public List<T> subList(int indexFrom, int indexTo) {
        return List.of();
    }

    /*
     * --- ITERATOR methods ---
     */
    @Override
    public Iterator<T> iterator() {
        return null;
    }


    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] elements) {
        return null;
    }

    /*
        --- PRINT ALL NODES ---
     */
    public void printAllNodes() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current);
            current = current.getNext();
        }
    }
}
