package homework.mvc_design_pattern;

import java.util.Scanner;

public class TaskView {

    private Scanner scanner;

    public TaskView() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("1. Add a new task");
        System.out.println("2. Remove a task");
        System.out.println("3. Mark a task as done");
        System.out.println("4. View all tasks");
        System.out.println("5. View pending tasks");
        System.out.println("6. View completed tasks");
        System.out.println("7. Exit");
    }

    public void displayMessage(String message) {
        System.out.println("------------------------------");
        System.out.println(message);
        System.out.println("------------------------------");
    }

    public void displayError(String message) {
        System.out.println(message);
    }

    public int readInt() {
        System.out.println("Enter your choice: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String readString() {
        System.out.println("Enter task description: ");
        String text = scanner.nextLine();
        if (text.isEmpty()) {
            text = scanner.nextLine();
        }
        return text;
    }
}
