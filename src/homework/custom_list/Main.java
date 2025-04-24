package homework.custom_list;

public class Main {

    public static void main(String[] args) {
        MyCustomList<String> myCustomList = new MyCustomList<>(3);
        myCustomList.add("A");
        myCustomList.add("B");
        myCustomList.add("C");

        System.out.println("Size: " + myCustomList.size());
        System.out.println("Is Empty: " + myCustomList.isEmpty());

       CustomListIterator<String> iterator = (CustomListIterator<String>) myCustomList.iterator();

       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }
    }

}
