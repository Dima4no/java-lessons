package lessons.mvc_design_pattern;

public class Controller {

    private UserService userService;
    private View view;

    public Controller() {
        this.userService = new UserService();
        this.view = new View();
    }

    public void run() {
        while (true) {
            view.printMenu();
            int choice = view.getInteger("Enter your choice: ");

            if (choice == 4) {
                break;
            }

            if (choice == 1) {
                addUserAction();
            }
            if (choice == 2) {
                deleteUserAction();
            }

            if (choice == 3) {
                printUsersAction();
            }
        }
    }

    public void addUserAction() {
        String username = view.getText("Enter username: ");
        String password = view.getText("Enter password: ");

        User user = new User(username, password);
        userService.addUser(user);
    }

    public void printUsersAction() {
        for (User user : userService.getAllUsers()) {
            view.printMessage(user.toString());
        }
    }

    public void deleteUserAction() {
        String username = view.getText("Enter username: ");
        userService.removeUserByUsername(username);
    }

}
