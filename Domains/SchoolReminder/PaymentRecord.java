package Domains.SchoolReminder;
import java.time.LocalDate;

class PaymentRecord 
{
    private String paymentID;
    private LocalDate dueDate;
    private double amount;
    private boolean status;

    public PaymentRecord(String paymentID, LocalDate dueDate, double amount, boolean status) 
    {
        this.paymentID = paymentID;
        this.dueDate = dueDate;
        this.amount = amount;
        this.status = status;
    }

    public String getPaymentID() 
    {
        return paymentID;
    }

    public void setPaymentID(String paymentID) 
    {
        this.paymentID = paymentID;
    }

    public LocalDate getDueDate() 
    {
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

    public boolean isStatus() 
    {
        return status;
    }

    public void setStatus(boolean status) 
    {
        this.status = status;
    }

    // Example method
    public void markAsPaid() 
    {
        setStatus(true);
        System.out.println("Payment marked as paid.");
    }
}
