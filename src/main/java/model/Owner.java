package main.java.model;
import java.util.List;

public class Owner {
    private int id;
    private String firstName;
    private String lastName;
    private Contact contactInfo;
    private List<Dog> dogs;

    public Owner(String firstName, String lastName, Contact contactInfo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Contact contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public void removeDog(Dog dog) {
        dogs.remove(dog);
    }

    public List<Dog> getDogs() {
        return dogs;
    }
}
