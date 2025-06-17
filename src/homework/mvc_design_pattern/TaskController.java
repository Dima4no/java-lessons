package homework.mvc_design_pattern;

import java.util.List;
import java.util.UUID;

public class TaskController {

    private TaskService taskService;
    private TaskView taskView;

    public TaskController() {
        this.taskService = new TaskService();
        this.taskView = new TaskView();
    }

    public void handleAddTask(String description) {
        Task task = new Task(description);
        try {
            taskService.addTask(task);
        } catch (TaskAlreadyExistsException exception) {
            taskView.displayMessage(exception.getMessage());
        }
    }

    public void handleRemoveTask(UUID id) {
        boolean isRemoved = taskService.removeTask(id);
        if (isRemoved) {
            taskView.displayMessage("Task with id: " + id + " was successfully removed!");
        } else {
            taskView.displayMessage("Task with id: " + id + " was not found and was not removed!");
        }
    }

    // TODO: add UUID instead of int id
    public void handleMarkTaskAsDone(int id) {
        taskService.markTaskAsDone(id);
    }

    public void handleDisplayTasks() {
        List<Task> tasks = taskService.getAllTasks();
        taskView.displayTasks(tasks);
    }

    public void handleDisplayPendingTasks() {
        List<Task> pendingTasks = taskService.getPendingTasks();
        taskView.displayTasks(pendingTasks);
    }

    public void handleDisplayCompletedTasks() {
        List<Task> completedTasks = taskService.getCompletedTasks();
        taskView.displayTasks(completedTasks);
    }

    public void run() {
        while (true) {
            taskView.displayMenu();
            int choice = taskView.readInt("Enter your choice: ");

            if (choice == 7) {
                taskView.displayMessage("Exiting Task Manager...");
                break;
            }

            if (choice == 1) {
                handleAddTask(taskView.readString("Enter task description: "));
                taskView.displayMessage("Task added successfully!");
            }

            if (choice == 2) {
                handleRemoveTask(UUID.fromString(taskView.readString("Enter the ID of the task")));
            }

            if (choice == 3) {
                handleMarkTaskAsDone(taskView.readInt("Enter the ID of the task"));
                taskView.displayMessage("You have completed the task!");
            }

            if (choice == 4) {
                handleDisplayTasks();
            }

            if (choice == 5) {
                handleDisplayPendingTasks();
            }

            if (choice == 6) {
                handleDisplayCompletedTasks();
            }
        }
    }
}
