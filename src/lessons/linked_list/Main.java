package lessons.linked_list;

public class Main {

    public static void main(String[] args) {
        MyCustomLinkedList<String> list = new MyCustomLinkedList<>();
        list.add("A");
        list.add("B");
        list.printAllNodes();
    }

}
