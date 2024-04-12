package main.java.model;
import java.util.Date;

public class VaccinationRecord {
    private int id;
    private String vaccine;
    private Date dateAdministered;
    private Date expirationDate;

    public VaccinationRecord(String vaccine, Date dateAdministered, Date expirationDate) {
        this.vaccine = vaccine;
        this.dateAdministered = dateAdministered;
        this.expirationDate = expirationDate;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVaccine() {
        return vaccine;
    }

    public void setVaccine(String vaccine) {
        this.vaccine = vaccine;
    }

    public Date getDateAdministered() {
        return dateAdministered;
    }

    public void setDateAdministered(Date dateAdministered) {
        this.dateAdministered = dateAdministered;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}

