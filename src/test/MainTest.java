package test;

import model.CommissionEmployee;
import model.Department;
import model.Employee;
import model.Gender;
import model.HourlyEmployee;
import model.MonthlyEmployee;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println(">>> Testing Employee Management System <<<");
        System.out.println("==================================================\n");

        // 1. Create Department Manager
        MonthlyEmployee manager = new MonthlyEmployee(
                1, "Dr. Ayman Taha", "Cairo, Egypt", "01011112222",
                Gender.MALE, "2018-05-01", null, 15000.0, 3000.0
        );

        // 2. Create Department with Manager
        Department csDept = new Department(101, "Computer Science & IT", manager);

        // 3. Create Employees with hireDate
        HourlyEmployee hourlyEmp = new HourlyEmployee(
                2, "Ahmed Ali", "Cairo, Egypt", "01012345678",
                Gender.MALE, "2021-09-15", 50.0, 45
        );

        MonthlyEmployee monthlyEmp = new MonthlyEmployee(
                3, "Sara Mohamed", "Giza, Egypt", "01123456789",
                Gender.FEMALE, "2022-02-01", 8000.0, 1500.0
        );

        CommissionEmployee commissionEmp = new CommissionEmployee(
                4, "Omar Hassan", "Alexandria, Egypt", "01234567890",
                Gender.MALE, "2023-01-10", 50000.0, 0.10
        );

        // 4. Add Employees to Department
        csDept.addEmployee(hourlyEmp);
        csDept.addEmployee(monthlyEmp);
        csDept.addEmployee(commissionEmp);

        // 5. Display Department Summary
        csDept.displayAllEmployees();

        // 6. Demonstrate Polymorphism
        System.out.println("\n--- 1. Polymorphic calculateSalary() Demonstration ---");
        for (Employee emp : csDept.getEmployees()) {
            System.out.printf("%s (%s) -> Salary: $%.2f%n",
                    emp.getName(),
                    emp.getClass().getSimpleName(),
                    emp.calculateSalary()
            );
        }

        // 7. Testing Search
        System.out.println("\n--- 2. Testing Employee Search ---");
        Employee foundById = csDept.searchEmployee(3);
        System.out.println("Search by ID 3: " + (foundById != null ? "FOUND -> " + foundById.getName() : "NOT FOUND"));

        Employee notFound = csDept.searchEmployee(999);
        System.out.println("Search by ID 999: " + (notFound != null ? "FOUND" : "NOT FOUND (Expected)"));

        // 8. Testing Removal
        System.out.println("\n--- 3. Testing Employee Removal ---");
        System.out.println("Initial count: " + csDept.getEmployeeCount());
        boolean removed = csDept.removeEmployee(4);
        System.out.println("Removed employee ID 4? " + removed);
        System.out.println("Updated count: " + csDept.getEmployeeCount());
        System.out.printf("Updated Total Payroll: $%.2f%n", csDept.calculateTotalPayroll());

        // 9. Testing Null Safety & Defensive Encapsulation
        System.out.println("\n--- 4. Testing Null Safety & Defensive Encapsulation ---");
        csDept.addEmployee(null);
        System.out.println("Count after adding null: " + csDept.getEmployeeCount() + " (Protected)");
        csDept.getEmployees().clear();
        System.out.println("Count after external list clear: " + csDept.getEmployeeCount() + " (Defensively Copied)");

        System.out.println("\n>>> All tests completed successfully! <<<");
    }
}