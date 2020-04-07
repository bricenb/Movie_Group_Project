/**
 * This is an abstract class that sets up a User.
 * every User must have a name, password, and age
 */
public class User {
    public String name;
    public String password;
    public int age;

    public User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }
}
