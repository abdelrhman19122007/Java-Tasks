public class Doctor extends Person implements MedicalRecord {
    private String specialization;

    public Doctor(String name, int id, int age, String specialization) {
        super(name, id, age);
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }

    @Override
    public void displayInfo() {
        System.out.println("Doctor ID: " + getId() + " | Name: Dr. " + getName() + " | Specialization: " + specialization);
    }

    @Override
    public void getRecordDetails() {
        System.out.println("Medical Staff Record: Dr. " + getName() + " (" + specialization + ")");
    }
}