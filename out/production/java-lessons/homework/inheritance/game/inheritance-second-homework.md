
# Домашнее задание: Наследование в Java (тема: Персонажи в игре)

## Цель задания
Научиться использовать наследование для создания иерархии классов, добавлять методы и переопределять их. Реализовать взаимодействие объектов через вызов методов.

---

## Описание задания

### 1. Базовый класс: `Character`
Создайте класс `Character`, который будет базовым для всех персонажей.  

#### Поля:
- `name` (`String`) — имя персонажа.
- `health` (`int`) — здоровье персонажа.

#### Методы:
- **Конструктор** для инициализации `name` и `health`.
- **`attack(Character target)`**  
  - Выводит строку:  
    `"Character [name] attacks [target.name]!"`
  - Уменьшает здоровье цели: `target.health -= 10`.
- **`isAlive()`**  
  - Возвращает `true`, если здоровье больше 0, и `false` иначе.
- **`heal(int amount)`**  
  - Увеличивает здоровье на `amount`.
  - Выводит строку:  
    `"Character [name] heals for [amount] points!"`.
- **`toString()`**  
  - Возвращает строку:  
    `"Character: [name], Health: [health]"`.

---

### 2. Класс `Warrior` (наследуется от `Character`)
Создайте класс `Warrior`, который представляет бойца.

#### Дополнительные поля:
- `strength` (`int`) — сила удара.

#### Методы:
- **Конструктор** принимает `name`, `health`, `strength` и передает `name` и `health` в базовый класс.
- **`attack(Character target)`**  
  - Выводит строку:  
    `"Warrior [name] strikes [target.name] with strength [strength]!"`.
  - Уменьшает здоровье цели: `target.health -= strength`.
- **`boostStrength(int amount)`**  
  - Увеличивает силу удара на `amount`.
  - Выводит строку:  
    `"Warrior [name] boosts strength by [amount]!"`.

---

### 3. Класс `Archer` (наследуется от `Character`)
Создайте класс `Archer`, который представляет лучника.

#### Дополнительные поля:
- `arrows` (`int`) — количество стрел.

#### Методы:
- **Конструктор** принимает `name`, `health`, `arrows` и передает `name` и `health` в базовый класс.
- **`attack(Character target)`**  
  - Проверяет, есть ли стрелы (`arrows > 0`).
  - Если стрелы есть:
    - Выводит строку:  
      `"Archer [name] shoots an arrow at [target.name], dealing 15 damage! [arrows] arrows left."`.
    - Уменьшает здоровье цели: `target.health -= 15`.
    - Уменьшает количество стрел: `arrows--`.
  - Если стрел нет:
    - Выводит строку: `"Archer [name] has no arrows left!"`.
- **`reload(int amount)`**  
  - Увеличивает количество стрел на `amount`.
  - Выводит строку:  
    `"Archer [name] reloads [amount] arrows. Total arrows: [arrows]."`.

---

### 4. Класс `Main`
Создайте класс `Main` для тестирования.

#### Пример работы:
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
```

---

## Ожидаемый вывод:
```plaintext
Character: Aragorn, Health: 100
Character: Legolas, Health: 80
Warrior Aragorn strikes Legolas with strength 20!
Character: Legolas, Health: 60
Archer Legolas shoots an arrow at Aragorn, dealing 15 damage! 9 arrows left.
Character: Aragorn, Health: 85
Archer Legolas reloads 5 arrows. Total arrows: 14.
Archer Legolas shoots an arrow at Aragorn, dealing 15 damage! 13 arrows left.
Character: Aragorn, Health: 70
```

---

## Дополнительное задание (по желанию):
1. Реализуйте метод `block()` для `Warrior`, который уменьшает урон от следующей атаки на 10 очков.
2. Добавьте метод `specialAttack()` для `Archer`, который тратит 3 стрелы и наносит 40 очков урона.
