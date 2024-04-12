package main.java.model;
public class MedicalProcedure {
    private int id;
    private Appointment appointment;
    private String procedureName;
    private String description;

    public MedicalProcedure(Appointment appointment, String procedureName, String description) {
        this.appointment = appointment;
        this.procedureName = procedureName;
        this.description = description;
    }
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

    public String getProcedureName() {
        return procedureName;
    }

    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
