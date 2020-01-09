package ioc;

public class User {

    private String username;

    public User(String username) {
        this.username = username;
    }

    public User() {
    }

    public void add() {
        System.out.println("add..........");
    }
}
