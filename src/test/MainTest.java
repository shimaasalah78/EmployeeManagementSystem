package test;

import model.CommissionEmployee;
import model.Department;
import model.Employee;
import model.Gender;
import model.HourlyEmployee;
import model.MonthlyEmployee;

public class MainTest {
    public static void main(String[] args) {
        System.out.println(">>> Testing Employee Management System <<<\n");

        Department csDept = new Department(101, "Computer Science & IT");

        HourlyEmployee hourlyEmp = new HourlyEmployee(
                1, "Ahmed Ali", "Cairo, Egypt", "01012345678", Gender.MALE, 50.0, 45
        );

        MonthlyEmployee monthlyEmp = new MonthlyEmployee(
                2, "Sara Mohamed", "Giza, Egypt", "01123456789", Gender.FEMALE, 8000.0, 1500.0
        );

        CommissionEmployee commissionEmp = new CommissionEmployee(
                3, "Omar Hassan", "Alexandria, Egypt", "01234567890", Gender.MALE, 50000.0, 0.10
        );

        csDept.addEmployee(hourlyEmp);
        csDept.addEmployee(monthlyEmp);
        csDept.addEmployee(commissionEmp);

        csDept.displayAllEmployees();

        System.out.println("\n--- Polymorphic Earnings Demonstration ---");
        Employee[] employees = { hourlyEmp, monthlyEmp, commissionEmp };
        for (Employee emp : employees) {
            System.out.printf("%s (%s) earns: $%.2f%n",
                    emp.getName(),
                    emp.getClass().getSimpleName(),
                    emp.earnings()
            );
        }
    }
}