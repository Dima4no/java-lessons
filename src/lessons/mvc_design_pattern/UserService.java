package lessons.mvc_design_pattern;

import java.util.ArrayList;

public class UserService {

    private ArrayList<User> userDatabase;

    public UserService() {
        userDatabase = new ArrayList<>();
    }

    public void addUser(User user) {
        userDatabase.add(user);
    }

    public void removeUserByUsername(String username) {
        ArrayList<User> userDatabaseCopy = new ArrayList<>();
        for (User user : userDatabase) {
            if (!user.getUsername().equals(username)) {
                userDatabaseCopy.add(user);
            }
        }
        userDatabase = userDatabaseCopy;
    }

    public ArrayList<User> getAllUsers() {
        return userDatabase;
    }
}
