package Data;

public class UserSession {
    private static int userRole;
    private static String username;

    public static void setUserRole(int role) {
        userRole = role;
    }

    public static int getUserRole() {
        return userRole;
    }

    public static void setUsername(String name) {
        username = name;
    }

    public static String getUsername() {
        return username;
    }

}
