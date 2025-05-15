package lessons.linked_list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
    public T get(int i) {
        // TODO: implement this
        return null;
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
        return false;
    }


    @Override
    public boolean containsAll(Collection<?> collection) {
        // TODO: implement this
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {
        // TODO: implement this
    }

    @Override
    public T set(int index, T data) {
        // TODO: implement this
        return null;
    }

    @Override
    public int indexOf(Object objectToRetrieve) {
        // TODO: implement this
        return 0;
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
