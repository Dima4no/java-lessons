package homework.inheritance.game;

public class Main {

    public static void main(String[] args) {
        Warrior aragorn = new Warrior("Aragorn", 100, 20);
        Archer legolas = new Archer("Legolas", 80, 10);

        System.out.println(aragorn);
        System.out.println(legolas);

        aragorn.attack(legolas);
        System.out.println(legolas);

        legolas.attack(aragorn);
        System.out.println(aragorn);

        legolas.reload(5);
        legolas.attack(aragorn);
        System.out.println(aragorn);
    }
}
