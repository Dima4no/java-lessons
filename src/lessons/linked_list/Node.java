package lessons.linked_list;

/**
 * Node that represents a single entry in a linked list.
 *
 * @param <T> data that is passed to the list
 */
public class Node<T> {

    private T data;
    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        if (next == null) {
            return data.toString() + " -> null";
        } else {
            return data.toString() + " -> ";
        }
    }
}
