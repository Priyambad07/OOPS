package EXP_6;
//2) A security system needs to protect its authentication mechanism to prevent tampering. Implement a final class named SecuritySystem that includes a method authenticateUser(String username, String password), which verifies user credentials. Then, attempt to create a subclass AdvancedSecurity that tries to extend SecuritySystem and override authenticateUser(). Observe the compilation error and explain why a final class cannot be inherited. In the main() method, create an instance of SecuritySystem and use the authenticateUser() method to validate login credentials. This will demonstrate how the final keyword enforces security by preventing unauthorized modifications to authentication logic.
// Final class to prevent inheritance and modification
final class SecuritySystem {
    private String[] usernames = {"admin", "user"};
    private String[] passwords = {"admin123", "password123"};

    // Method to authenticate users based on username and password
    public boolean authenticateUser(String username, String password) {
        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                System.out.println("Authentication successful!");
                return true;
            }
        }
        System.out.println("Authentication failed! Invalid credentials.");
        return false;
    }
}

/*
// This will cause a compilation error because SecuritySystem is final
class AdvancedSecurity extends SecuritySystem {
    // Attempting to override authenticateUser (which is not allowed)
    public boolean authenticateUser(String username, String password) {
        System.out.println("Tampered authentication logic.");
        return false;
    }
}
*/

public class Program2{
    public static void main(String[] args) {
        SecuritySystem security = new SecuritySystem();

        // Testing authentication with valid and invalid credentials
        security.authenticateUser("admin", "admin123"); // Should print "Authentication successful!"
        security.authenticateUser("user", "wrongpass"); // Should print "Authentication failed!"
    }
}
