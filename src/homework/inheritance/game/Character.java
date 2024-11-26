package homework.inheritance.game;

public class Character {

    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {return name;}
    public int getHealth() {return health;}

    public void setName(String name) {this.name = name;}
    public void setHealth(int health) {this.health = health;}

    public void attack(Character target) {
        System.out.println("Character " + name + " attacks " + target.name  + "!");
        target.health -= 10;
    }

    public boolean isAlive() {
        if (health > 0) {return true;} else {return false;}
    }

    public void heal(int amount) {
        health += amount;
        System.out.println("Character: " + name + " heals for " + amount + " points!");
    }

    @Override
    public String toString() {
        return "Character: " + name + "\n" +
                "Health: " + health;
    }
}
