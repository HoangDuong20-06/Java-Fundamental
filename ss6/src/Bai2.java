class Account {
    String username;
    String password;
    String email;

    Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    void changePassword(String newPassword) {
        password = newPassword;
    }

    void display() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println();
    }
}

public class Bai2 {
    public static void main(String[] args) {
        Account acc = new Account("admin", "123456", "admin@gmail.com");
        acc.changePassword("abcdef");
        acc.display();
    }
}
