package homework.interfaces;

public class TodoList {

    private TodoItem[] tasks;
    private int initialCapacity;

    public TodoList(int initialCapacity) {
        this.tasks = new TodoItem[initialCapacity];
    }

    public void addTask(TodoItem task) {
        int index = 0;
        if(index > tasks.length) {
            expandArray();
        }
        tasks[index] = task;
        index++;
    }

    public void completeTask(int index) {
        if(index >= 0 && index < tasks.length) {
            tasks[index].complete();
        } else {
            System.out.println("This index is incorrect!");
        }
    }

    public void printTasks() {
        for(int i = 0; i <= tasks.length; i++) {
            TodoItem task = tasks[i];
            if(task != null) {
                System.out.println(task.getDescription() + ": " + task.isCompleted());
            }
        }
    }

    public void expandArray() {
        TodoItem[] newTasks = new TodoItem[tasks.length + 1];
        for(int i = 0; i < tasks.length; i++) {
            newTasks[i] = tasks[i];
        }
        tasks = newTasks;
    }
}
