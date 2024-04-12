package main.java.model;
public class Invoice {
    private int id;
    private Appointment appointment;
    private double amount;
    private PaymentStatus paymentStatus;

    public Invoice(Appointment appointment, double amount) {
        this.appointment = appointment;
        this.amount = amount;
        this.paymentStatus = PaymentStatus.PENDING;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
