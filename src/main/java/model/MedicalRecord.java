package main.java.model;
import java.util.Date;

public class MedicalRecord {
    private int id;
    private Date date;
    private String description;

    public MedicalRecord(Date date, String description) {
        this.date = date;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
