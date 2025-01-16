package homework.interfaces;

public class Main {

    public static void main(String[] args) {

        TodoList todoList = new TodoList(2);

        todoList.addTask(new WorkTask("Write a report!"));
        todoList.addTask(new PersonalTask("Call the doctor!"));
        todoList.addTask(new ShoppingTask("apples", 5));
        todoList.addTask(new ShoppingTask("milk", 2));

        System.out.println("List of tasks: ");
        todoList.printTasks();

        try {
            todoList.completeTask(-1);
            todoList.completeTask(2);
        } catch (IncorrectIndexException exception) {
            System.out.println(exception.getMessage());
        }

        System.out.println("\nUpdated list of tasks:");
        todoList.printTasks();

    }
}
