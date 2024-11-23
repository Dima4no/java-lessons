package homework.inheritance;

public class Archer extends Character {

    private int arrows;

    public Archer(String name, int health, int arrows) {
        super(name, health);
        this.arrows = arrows;
    }

    public int getArrows() {return arrows;}
    public void setArrows(int arrows) {this.arrows = arrows;}

    public void attack(Character target) {
        if (arrows > 0) {
            System.out.println("Archer " + getName() + " shoots an arrow at " + target.getName() +
                    ", dealing 15 damage! " + (arrows - 1) + " arrows left.");
            target.setHealth(target.getHealth() - 15);
            arrows--;
        } else {
            System.out.println("Archer " + getName() + " has no arrows left!");
        }
    }

    public void reload(int amount) {
        arrows += amount;
        System.out.println("Archer " + getName() + " reloads " + amount + " arrows." + "Total arrows: " + arrows);
    }
}
