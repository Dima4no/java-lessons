package homework.interfaces;

public class Main {
    public static void main(String[] args) {

        TodoList todoList = new TodoList(5);

        todoList.addTask(new WorkTask("To write a report!"));
        todoList.addTask(new PersonalTask("Call to a doctor!"));
        todoList.addTask(new ShoppingTask("apples", 5));
        todoList.addTask(new ShoppingTask("milk", 2));


        System.out.println("List of tasks:");
        todoList.printTasks();


        todoList.completeTask(1);
        todoList.completeTask(2);


        System.out.println("\nUpdated list of tasks:");
        todoList.printTasks();
    }
}
