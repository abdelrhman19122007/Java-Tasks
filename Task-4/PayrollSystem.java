import java.util.ArrayList;

public class PayrollSystem {
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void processPayrolls() {
        System.out.println("\n========== PAYROLL & BANK DEPOSITS ==========");
        for (Employee emp : employeeList) {
            double salary = emp.calculateSalary();
            emp.getBankAccount().deposit(salary);
            emp.displayDetails();
            System.out.println("Updated Bank Balance: $" + emp.getBankAccount().getBalance());
            System.out.println("---------------------------------------------");
        }
    }
}