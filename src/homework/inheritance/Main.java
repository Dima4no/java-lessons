package homework.inheritance;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Buddy", 5, "shepherd");
        Cat cat = new Cat("Max", 3, "grey");

        System.out.println(dog.toString());

        System.out.println(cat.toString());
    }
}
