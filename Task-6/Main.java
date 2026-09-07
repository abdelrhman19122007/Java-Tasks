public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Doctor doc1 = new Doctor("Ahmed", 201, 45, "Cardiology");
        Patient pat1 = new Patient("Abdelrahman", 301, 18, "Routine Checkup");

        hospital.addDoctor(doc1);
        hospital.addPatient(pat1);

        hospital.displayHospitalData();

        System.out.println("\n--- MEDICAL RECORDS ---");
        doc1.getRecordDetails();
        pat1.getRecordDetails();
    }
}