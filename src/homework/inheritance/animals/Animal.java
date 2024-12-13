package homework.inheritance.animals;

import lombok.Data;


public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public int getAge() {return age;}

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}

    public String makeSound() {return("Some sound");}

    @Override
    public String toString() {return("Animal's name is " + name + "\n"  + "Animal's age is " + age + "\n");}
}
