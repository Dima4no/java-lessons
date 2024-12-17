# Упражнение: Онлайн-Магазин

## Цель Упражнения

Закрепить знания о массивах, объектах и методах в Java, создав классы для управления онлайн-магазином и информацией о товарах и их владельцах. Также важно протестировать каждый метод в классе `Main`.

---

## Описание Ситуации

Вам нужно создать три класса:
1. **Owner (Владелец)**: класс для представления информации о владельце товара.
2. **Product (Товар)**: класс, описывающий сущности товаров в магазине.
3. **OnlineShop (Онлайн-Магазин)**: класс, хранящий массив товаров и предоставляющий методы для их управления.

Дополнительно создайте класс `Main` для тестирования всех методов.

---

## Задачи

### 1. Создание класса `Owner`
Укажите следующие поля в классе `Owner`:
- **UUID id** (уникальный идентификатор, создаётся автоматически в конструкторе).
- **String name** (имя владельца).
- **String contactInfo** (контактная информация владельца).

#### Методы в классе `Owner`:
- Конструктор для задания `name` и `contactInfo`. Поле `id` создаётся автоматически.
- **toString()**: возвращает строковое представление владельца.

---

### 2. Создание класса `Product`
Укажите следующие поля в классе `Product`:
- **UUID id** (уникальный идентификатор, создаётся автоматически в конструкторе).
- **String name** (название товара).
- **Owner owner** (объект класса `Owner`, представляющий владельца товара).
- **double price** (цена товара).
- **boolean isAvailable** (доступность товара).

#### Методы в классе `Product`:
- Конструктор для задания `name`, `owner`, и `price`. Поле `id` создаётся автоматически. Значение `isAvailable` по умолчанию должно быть `true`.
- **toString()**: возвращает строковое представление товара, включая информацию о владельце.

---

### 3. Создание класса `OnlineShop`
#### Поля класса:
- **Product[] products**: массив товаров.
- **int initialCapacity**: первоначальная вместимость массива.

#### Методы класса:
1. **addProduct(Product product, int index)**:
    - Добавляет товар в массив на указанный индекс.
    - Если индекс некорректен или на этом месте уже есть товар, выводится сообщение об ошибке.
    - Если индекс равен длине массива, увеличьте его вместимость.

2. **addProduct(String name, Owner owner, double price, int index)**:
    - Создаёт объект `Product` с заданными параметрами и вызывает метод `addProduct`.

3. **growCapacity()**:
    - Увеличивает вместимость массива на 1.
    - Создайте новый массив с увеличенной длиной, скопируйте в него товары из старого массива и замените старый массив на новый.

4. **updateProduct(Product product, int index)**:
    - Обновляет товар на заданном индексе.
    - Если индекс некорректен или товара не существует, выводится сообщение об ошибке.

5. **removeProductById(UUID id)**:
    - Удаляет товар из массива по его `id`.
    - Если товар с указанным `id` не найден, выводится сообщение об ошибке.

6. **printProductList()**:
    - Выводит список всех товаров в магазине. Используйте метод `toString()` для представления товаров.

7. **getProductsByOwner(String ownerName)**:
    - Возвращает массив товаров, владельцем которых является указанный человек.
    - Если товары не найдены, возвращается пустой массив.

8. **getMostExpensiveProduct()**:
    - Возвращает товар с самой высокой ценой.
    - Если товаров нет, возвращает `null`.

9. **getLeastExpensiveProduct()**:
    - Возвращает товар с самой низкой ценой.
    - Если товаров нет, возвращает `null`.

---

### 4. Создание класса `Main`

Создайте класс `Main` с методом `main`, который:
- Создаёт объект `OnlineShop` с `initialCapacity = 3`.
- Создаёт несколько объектов `Owner`.
- Добавляет несколько товаров в магазин.
- Печатает список всех товаров.
- Обновляет информацию о товаре и снова печатает список.
- Удаляет товар по `id` и снова печатает список.
- Выводит список всех товаров по имени владельца.
- Выводит самый дорогой товар, используя метод `getMostExpensiveProduct`.
- Выводит самый дешёвый товар, используя метод `getLeastExpensiveProduct`.

---

## Примечания

1. Убедитесь, что в классе `Main` вы протестировали каждый метод класса `OnlineShop`.
2. Включите обработку исключений для методов, где это необходимо (например, некорректные индексы или отсутствие товара с заданным `id`).
3. Используйте метод `toString()` для удобного представления объектов `Product` и `Owner`.