import java.util.*;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;
    List<Patient> patients = new ArrayList<>();

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Doctor " + name + " consulted with patient " + patient.name);
    }
}

class Hospital {
    String name;
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    Hospital(String name) {
        this.name = name;
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }
}

public class HospitalCommunicationDemo {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");
        Doctor d1 = new Doctor("Dr. Lee");
        Patient p1 = new Patient("Anna");

        hospital.addDoctor(d1);
        hospital.addPatient(p1);

        d1.consult(p1);
    }
}
