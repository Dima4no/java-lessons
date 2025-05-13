# Homework: Inheritance in Java (Topic: Game Characters)

## 🎯 Objective

Learn how to:
- Use **inheritance** to create a class hierarchy.
- **Override** methods in subclasses.
- Use `super` to call base class logic from subclasses.
- Simulate interaction between objects via method calls.

---

## 📚 Task Description

### 1. Base Class: `Character`

Create a class `Character`, which will be the base class for all game characters.

#### Fields:
- `name` (`String`) — the character's name.
- `health` (`int`) — the character's health.

#### Methods:
- **Constructor** to initialize `name` and `health`.
- **`attack(Character target)`**
    - Print:  
      `"Character [name] attacks [target.name]!"`
    - Reduce target's health by `10`.
- **`isAlive()`**
    - Return `true` if `health > 0`, otherwise `false`.
- **`heal(int amount)`**
    - Increase health by `amount`.
    - Print:  
      `"Character [name] heals for [amount] points!"`
- **`toString()`**
    - Return:  
      `"Character: [name], Health: [health]"`

---

### 2. Class `Warrior` (inherits from `Character`)

Create a class `Warrior` to represent a melee fighter.

#### Additional Field:
- `strength` (`int`) — strength of the warrior's attack.

#### Methods:
- **Constructor** accepts `name`, `health`, and `strength`, and calls the base class constructor using `super`.
- **Override `attack(Character target)`**
    - Call `super.attack(target)` **first** to keep the base message.
    - Then print:  
      `"Warrior [name] strikes [target.name] with strength [strength]!"`
    - Subtract `strength` from target's health (in addition to the base 10).
- **`boostStrength(int amount)`**
    - Increase strength by `amount`.
    - Print:  
      `"Warrior [name] boosts strength by [amount]!"`

---

### 3. Class `Archer` (inherits from `Character`)

Create a class `Archer` to represent a ranged attacker.

#### Additional Field:
- `arrows` (`int`) — number of arrows available.

#### Methods:
- **Constructor** accepts `name`, `health`, and `arrows`, and calls the base class constructor using `super`.
- **Override `attack(Character target)`**
    - If `arrows > 0`:
        - Call `super.attack(target)` to reuse the base attack behavior.
        - Print:  
          `"Archer [name] shoots an arrow at [target.name], dealing 15 damage! [arrows] arrows left."`
        - Subtract 15 more from target's health.
        - Decrease `arrows` by 1.
    - If `arrows == 0`, print:  
      `"Archer [name] has no arrows left!"`
- **`reload(int amount)`**
    - Add `amount` to arrows.
    - Print:  
      `"Archer [name] reloads [amount] arrows. Total arrows: [arrows]."`

---

### 4. Class `Main` (for testing)

Create a `Main` class to test your implementation.

#### Sample Code:
```java
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
