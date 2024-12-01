# TestUtility

`TestUtility` — это утилитарный класс для тестирования методов в Java. Он предоставляет универсальный метод, который сравнивает ожидаемый и фактический результаты и выводит результат теста (успешно или провалено).

## Возможности

- Поддержка любых типов данных (`int`, `boolean`, `String`, объектов и т. д.) благодаря использованию дженериков.
- Понятный вывод результатов теста.
- Универсальность — можно использовать для тестирования методов в разных проектах и классах.

## Как использовать

1. Импортируйте класс `TestUtility`.
2. Используйте метод `testMethod` для сравнения ожидаемого и фактического результатов.
3. Передайте следующие параметры в метод `testMethod`:
    - `methodName`: Имя теста (описание тестируемого метода или сценария).
    - `expectedResult`: Ожидаемый результат выполнения метода.
    - `actualResult`: Фактический результат выполнения метода.

```java
package lessons.codingbat_array1;

public class TestCodingBatArrayOne {

    public static void main(String[] args) {
        CodingBatProblemsArrayOne problems = new CodingBatProblemsArrayOne();

        // Тест для maxTriple
        int[] input1 = {1, 2, 3, 1};
        TestUtility.testMethod("maxTriple", 3, problems.maxTriple(input1));

        // Тест для unlucky1
        int[] input2 = {1, 3, 4, 5};
        TestUtility.testMethod("unlucky1", true, problems.unlucky1(input2));

        int[] input3 = {1, 2, 3};
        TestUtility.testMethod("unlucky1", false, problems.unlucky1(input3));
    }
}
