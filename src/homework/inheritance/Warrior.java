package homework.inheritance;

public class Warrior extends Character{

    private int strength;

    public Warrior(String name, int health, int strength) {
        super(name, health);
        this.strength = strength;
    }

    public int getStrength() {return strength;}
    public void setStrength(int strength) {this.strength = strength;}

    public void attack(Character target) {
        System.out.println("Warrior " + getName() + " strikes " + target.getName() +
                " with strength " + strength);
        target.setHealth(target.getHealth() - strength);
    }

    public void boostStrength(int amount) {
        setStrength(getStrength() + amount);
        System.out.println("Warrior " + getName() + " boosts strength by " + amount + "!");
    }
}
