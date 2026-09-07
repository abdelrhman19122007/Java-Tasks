public class Patient extends Person implements MedicalRecord {
    private String diagnosis;

    public Patient(String name, int id, int age, String diagnosis) {
        super(name, id, age);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() { return diagnosis; }

    @Override
    public void displayInfo() {
        System.out.println("Patient ID: " + getId() + " | Name: " + getName() + " | Age: " + getAge() + " | Diagnosis: " + diagnosis);
    }

    @Override
    public void getRecordDetails() {
        System.out.println("Patient Health Record: " + getName() + " - Condition: " + diagnosis);
    }
}