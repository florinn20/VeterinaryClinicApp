package main.java.model;
import java.util.Date;

public class Appointment {
    private int id;
    private Date date;
    private Dog dog;
    private Owner owner;
    private AppointmentStatus status;
    private String notes;
    private Veterinarian veterinarian;

    public Appointment(Date date, Dog dog, Owner owner) {
        this.date = date;
        this.dog = dog;
        this.owner = owner;
        this.status = AppointmentStatus.SCHEDULED;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public AppointmentStatus getStatus() {
        return status;
    }

    public void setStatus(AppointmentStatus status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
    }
}
