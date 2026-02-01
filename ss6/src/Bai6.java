class User {
    private int id;
    private String username;
    private String password;
    private String email;

    User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    void setPassword(String password) {
        if (password != null && !password.isEmpty()) {
            this.password = password;
        }
    }

    void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        }
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Password: "+ password);
        System.out.println("Email: " + email);
        System.out.println();
    }
}

public class Bai6 {
    public static void main(String[] args) {
        User u1 = new User(1, "user1", "123456", "user1@gmail.com");
        User u2 = new User(2, "user2", "", "user2gmail.com");

        u1.display();
        u2.display();
    }
}
