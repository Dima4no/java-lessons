package homework.inheritance.animals;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {return breed;}

    public void setBreed(String breed) {this.breed = breed;}

    @Override
    public String makeSound() {return("Woof!");}

    public String toString() {return super.toString() + makeSound();}
}
