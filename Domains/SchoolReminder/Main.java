package Domains.SchoolReminder;

import java.time.LocalDate;


public class Main 
{
    public static void main(String[] args) 
    {
        // Example usage without using default constructors

        // Creating an Administrator
        Administrator admin = new Administrator(1, 1, "Admin", "adminpass");

        // Creating a Student
        Student student = new Student(101, 101, "Bunnarath", "studentpass", "john_student", "+855-123-323", "Data science and AI");

        // Creating an Invoice
        Invoice invoice = new Invoice("INV001", LocalDate.now().plusDays(7), 500.00, false);

        // Creating a PaymentRecord
        PaymentRecord paymentRecord = new PaymentRecord("PAY001", LocalDate.now().plusDays(7), 500.00, false);

        // Creating a ReminderSystem
        ReminderSystem reminder = new ReminderSystem(1, "Payment Reminder", "You have 1 months from payment date! Thank You!", 'E', LocalDate.now().plusDays(5));

        // Example method calls
        admin.approvePayment(student, invoice);
        paymentRecord.markAsPaid();
        reminder.sendReminder(student);

        // displayUserInfo method
        System.out.println("\nDisplaying User Information:");
        admin.displayUserInfo();
        student.displayUserInfo();

        // overloaded displayUserInfo method
        System.out.println("\nDisplaying User Information (without details):");
        student.displayUserInfo(false);
    }
}
