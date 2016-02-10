package ca.maciorowski.maciorowski.railapp;

/**
 * Created by 高橋　信史 on 2016/02/07.
 */
public class User {
    private String email;
    private String password;

    public User() {
    }

    public User(String email, String pass) {
        this.email = email;
        this.password = pass;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}