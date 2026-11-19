package Entities;

public class User {

    private String Name;
    private String Username;
    private String Email;
    private String Password;

    public User() {
    }

    public User(String Name, String Username, String Email, String Password) {
        this.Name = Name;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
    }

    public void setUser(String Username) {
        this.Username = Username;
    }

    public String getUsername() {
        return Username;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail() {
        return Email;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }
}