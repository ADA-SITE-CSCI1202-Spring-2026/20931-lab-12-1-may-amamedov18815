import java.util.HashSet;

public class UsernameChecker {
    public static void main(String[] args) {
        HashSet<String> usernames = new HashSet<>();

        usernames.add("ali");
        usernames.add("leyla");
        usernames.add("murad");
        usernames.add("ali");
        usernames.add("nigar");
        usernames.add("leyla");

        System.out.println("Unique usernames:");
        usernames.forEach(username -> System.out.println(username));

        System.out.println("\nChecking username:");
        String newUsername = "ali";

        if (usernames.contains(newUsername)) {
            System.out.println("Username already taken");
        } else {
            usernames.add(newUsername);
            System.out.println("Username added");
        }
    }
}