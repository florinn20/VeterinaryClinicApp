package main.java.model;
public class Prescription {
    private int id;
    private Appointment appointment;
    private String medication;
    private String dosage;

    public Prescription(Appointment appointment, String medication, String dosage) {
        this.appointment = appointment;
        this.medication = medication;
        this.dosage = dosage;
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

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }
}
