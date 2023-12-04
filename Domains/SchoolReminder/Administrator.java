package Domains.SchoolReminder;
class Administrator extends User 
{
    private int admin_id;

    // Constructors, getters, and setters
    public Administrator() 
    {
    }

    public Administrator(int admin_id, int id, String name, String password) 
    {
        super(id, name, password);
        this.admin_id = admin_id;
    }

    public int getAdminId() 
    {
        return admin_id;
    }

    public void setAdminId(int admin_id) 
    {
        this.admin_id = admin_id;
    }

    @Override
    public void displayUserInfo() {
        System.out.println("Administrator ID: " + getAdminId());
        System.out.println("Name: " + getName());
    }

    // Example method (overriding)
    public void approvePayment(Student student, Invoice invoice) 
    {
        System.out.println("Payment approved for student: " + student.getName());
    }
}

