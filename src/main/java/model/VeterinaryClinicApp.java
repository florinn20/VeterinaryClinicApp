package main.java.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VeterinaryClinicApp {
    private List<Appointment> appointments;
    private List<Owner> owners;
    private List<Veterinarian> veterinarians;

    public VeterinaryClinicApp() {
        this.appointments = new ArrayList<>();
        this.owners = new ArrayList<>();
        this.veterinarians = new ArrayList<>();
    }

    public static void main(String[] args) {
        VeterinaryClinicApp app = new VeterinaryClinicApp();
        app.run();
    }

    public void run() {
        // Implement the logic to start your application
        // For example, display a welcome message or prompt the user for input
        System.out.println("Welcome to the Veterinary Clinic App!");
        // Add more initialization or user interaction logic here
    }

    public Appointment scheduleAppointment(Date date, Dog dog, Owner owner, Veterinarian veterinarian) {
        Appointment appointment = new Appointment(date, dog, owner);
        appointment.setVeterinarian(veterinarian);
        appointments.add(appointment);
        return appointment;
    }

    public void cancelAppointment(Appointment appointment) {
        appointment.setStatus(AppointmentStatus.CANCELLED);
    }

    public void completeAppointment(Appointment appointment) {
        appointment.setStatus(AppointmentStatus.COMPLETED);
    }

    public Appointment findAppointmentById(int id) {
        for (Appointment appointment : appointments) {
            if (appointment.getId() == id) {
                return appointment;
            }
        }
        return null;
    }

    // Other find methods...

    public void addOwner(Owner owner) {
        owners.add(owner);
    }

    public void removeOwner(Owner owner) {
        owners.remove(owner);
    }

    public Owner findOwnerById(int id) {
        for (Owner owner : owners) {
            if (owner.getId() == id) {
                return owner;
            }
        }
        return null;
    }

    public void addVeterinarian(Veterinarian veterinarian) {
        veterinarians.add(veterinarian);
    }

    public void removeVeterinarian(Veterinarian veterinarian) {
        veterinarians.remove(veterinarian);
    }

    public Veterinarian findVeterinarianById(int id) {
        for (Veterinarian veterinarian : veterinarians) {
            if (veterinarian.getId() == id) {
                return veterinarian;
            }
        }
        return null;
    }
}
