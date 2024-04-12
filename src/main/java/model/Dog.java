package main.java.model;
import java.util.List;

public class Dog {
    private int id;
    private String name;
    private String breed;
    private int age;
    private double weight;
    private Owner owner;
    private List<MedicalRecord> medicalHistory;
    private List<VaccinationRecord> vaccinations;
    private List<Appointment> appointments;

    public Dog(String name, String breed, int age, double weight, Owner owner) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.owner = owner;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<MedicalRecord> getMedicalHistory() {
        return medicalHistory;
    }

    public void addMedicalRecord(MedicalRecord record) {
        medicalHistory.add(record);
    }

    public void removeMedicalRecord(MedicalRecord record) {
        medicalHistory.remove(record);
    }

    public List<VaccinationRecord> getVaccinations() {
        return vaccinations;
    }

    public void addVaccinationRecord(VaccinationRecord record) {
        vaccinations.add(record);
    }

    public void removeVaccinationRecord(VaccinationRecord record) {
        vaccinations.remove(record);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public void removeAppointment(Appointment appointment) {
        appointments.remove(appointment);
    }
}
