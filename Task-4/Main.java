public class Main {
    public static void main(String[] args) {
        PayrollSystem payroll = new PayrollSystem();

        BankAccount acc1 = new BankAccount("EG123456", 1000.00);
        BankAccount acc2 = new BankAccount("EG654321", 500.00);

        Employee emp1 = new FullTimeEmployee("Abdelrahman", 101, acc1, 5000.00);
        Employee emp2 = new PartTimeEmployee("Mohamed", 102, acc2, 40, 25.00);

        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);

        payroll.processPayrolls();
    }
}