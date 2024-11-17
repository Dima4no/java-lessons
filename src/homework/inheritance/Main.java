package homework.inheritance;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Buddy", 5, "shepherd");
        Cat cat = new Cat("Max", 3, "grey");

        System.out.println("Dog's name is " + dog.getName() + "\n" +
                           "Dog's age is " + dog.getAge() + "\n" +
                           "Dog's breed is " + dog.getBreed());
        dog.makeSound();

        System.out.println("Cat's name is " + cat.getName() + "\n" +
                           "Cat's age is " + cat.getAge() + "\n" +
                           "Cat's color is " + cat.getColor());
        cat.makeSound();
    }
}
