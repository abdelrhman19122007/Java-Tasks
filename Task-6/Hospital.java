import java.util.ArrayList;

public class Hospital {
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private ArrayList<Patient> patients = new ArrayList<>();

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayHospitalData() {
        System.out.println("\n========== HOSPITAL DIRECTORY ==========");
        System.out.println("--- DOCTORS ---");
        for (Doctor doc : doctors) {
            doc.displayInfo();
        }

        System.out.println("\n--- PATIENTS ---");
        for (Patient pat : patients) {
            pat.displayInfo();
        }
        System.out.println("=========================================");
    }
}