package week;
import java.time.LocalDate;

class ReminderSystem 
{
    private int id;
    private String title;
    private String description;
    private char type;
    private LocalDate date;

    // Constructors, getters, and setters
    public ReminderSystem() 
    {
        
    }

    public ReminderSystem(int id, String title, String description, char type, LocalDate date) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.type = type;
        this.date = date;
    }

    public int getId() 
    {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getDescription() 
    {
        return description;
    }

    public void setDescription(String description) 
    {
        this.description = description;
    }

    public char getType() 
    {
        return type;
    }

    public void setType(char type) 
    {
        this.type = type;
    }

    public LocalDate getDate() 
    {
        return date;
    }

    public void setDate(LocalDate date) 
    {
        this.date = date;
    }

    // Method sendingReminder
    public void sendReminder(Student student) 
    {
        System.out.println("Reminder sent to student: " + student.getName());
    }
}

