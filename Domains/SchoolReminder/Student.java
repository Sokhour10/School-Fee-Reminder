package Domains.SchoolReminder;

class Student extends User 
{
    private int studentID;
    private String username;
    private String phoneNumber;
    private String major;

    // Constructors, getters, and setters
    public Student() 
    {
        
    }

    public Student(int studentID, int id, String name, String password, String username, String phoneNumber, String major) 
    {
        super(id, name, password);
        this.studentID = studentID;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.major = major;
    }

    public int getStudentID() 
    {
        return studentID;
    }

    public void setStudentID(int studentID) 
    {
        this.studentID = studentID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getMajor() 
    {
        return major;
    }

    public void setMajor(String major) 
    {
        this.major = major;
    }
    
    @Override // Overide from user
    public void displayUserInfo() 
    {
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Name: " + getName());
        System.out.println("Username: " + getUsername());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Major: " + getMajor());
    }

    //Overloading
    public void displayUserInfo(boolean showDetails) 
    {
        if (showDetails) 
        {
            displayUserInfo();
        } else {
            System.out.println("Student ID: " + getStudentID());
            System.out.println("Name: " + getName());
        }
    }
}
