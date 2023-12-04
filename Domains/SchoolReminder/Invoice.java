package Domains.SchoolReminder;
import java.time.LocalDate;

class Invoice 
{
    private String invoiceID;
    private LocalDate dueDate;
    private double amount;
    private boolean paymentStatus;

    // Constructors, getters, and setters
    public Invoice() 
    {
        
    }

    public Invoice(String invoiceID, LocalDate dueDate, double amount, boolean paymentStatus) 
    {
        this.invoiceID = invoiceID;
        this.dueDate = dueDate;
        this.amount = amount;
        this.paymentStatus = paymentStatus;
    }

    public String getInvoiceID() 
    {
        return invoiceID;
    }

    public void setInvoiceID(String invoiceID) 
    {
        this.invoiceID = invoiceID;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) 
    {
        this.dueDate = dueDate;
    }

    public double getAmount() 
    {
        return amount;
    }

    public void setAmount(double amount) 
    {
        this.amount = amount;
    }

    public boolean isPaymentStatus() 
    {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) 
    {
        this.paymentStatus = paymentStatus;
    }

    // Example method
    public void generateInvoice(Student student) 
    {
        System.out.println("Invoice generated for student: " + student.getName());
    }
}
