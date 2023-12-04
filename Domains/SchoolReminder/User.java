package Domains.SchoolReminder;

abstract class User // User is the abstract class that derived from the student
{
    private int id;
    private String name;
    private String password;

    // Constructors, getters, and setters
    public User() {
    }

    public User(int id, String name, String password) 
    {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Abstract method to be overridden by subclasses
    public abstract void displayUserInfo();
}
