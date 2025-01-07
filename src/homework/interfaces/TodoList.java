package homework.interfaces;

public class TodoList {

    private TodoItem[] tasks;
    private int capacity;

    public TodoList(int initialCapacity) {
        this.tasks = new TodoItem[initialCapacity];
        this.capacity = capacity;
    }

    public void addTask(TodoItem task) {
        if(capacity >= tasks.length) {
            expandArray();
        }
        tasks[capacity] = task;
        capacity++;
    }

    public void completeTask(int index) {
        if(index >= 0 && index < capacity) {
            tasks[index].complete();
        } else {
            System.out.println("This index is incorrect!");
        }
    }

    public void printTasks() {
        for(int i = 0; i < capacity; i++) {
            TodoItem task = tasks[i];
            if(task != null) {
                System.out.println(task.getDescription() + ", Current status:  " + task.isCompleted());
            }
        }
    }

    public void expandArray() {
        TodoItem[] newTasks = new TodoItem[tasks.length * 2];
        for(int i = 0; i < tasks.length; i++) {
            newTasks[i] = tasks[i];
        }
        tasks = newTasks;
    }
}
