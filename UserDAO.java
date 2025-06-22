import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User("admin", "admin123", "admin"));
        users.add(new User("user", "user123", "user"));
    }

    public static User login(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return u;
            }
        }
        return null;
    }

    public static boolean register(String username, String password, String role) {
        for (User u : users) {
            if (u.username.equals(username)) return false; // trùng
        }
        users.add(new User(username, password, role));
        return true;
    }

    public static String resetPassword(String username) {
        for (User u : users) {
            if (u.username.equals(username)) return u.password;
        }
        return null;
    }
}
