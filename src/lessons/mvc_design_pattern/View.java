package lessons.mvc_design_pattern;

import java.util.Scanner;

public class View {

    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    public void printMenu() {
        System.out.println("Нажмите 1, чтобы добавить пользователя");
        System.out.println("Нажмите 2, чтобы удалить пользователя");
        System.out.println("Нажмите 3, чтобы вывести список пользователей");
        System.out.println("Нажмите 4, чтобы выйти из программы");
    }

    public void printMessage(String message) {
        System.out.println("------------------------------------");
        System.out.println(message);
        System.out.println("------------------------------------");
    }

    public String getText(String message) {
        System.out.println(message);
        String text = scanner.nextLine();
        if (text.isEmpty()) {
            text = scanner.nextLine();
        }
        return text;
    }

    public int getInteger(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

}
