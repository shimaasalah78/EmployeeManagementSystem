import model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("    Welcome to Employee Management System        ");
        System.out.println("==================================================");

        MonthlyEmployee manager = new MonthlyEmployee(
                100, "Eng. Mohamed Ehab", Gender.MALE, "2020-01-01", 12000.0, 2000.0
        );

        Department department = new Department(1, "Software Engineering", manager);

        HourlyEmployee hourlyEmp = new HourlyEmployee(
                101, "Youssef Ahmed", Gender.MALE, "2022-03-15", 40.0, 42
        );

        MonthlyEmployee monthlyEmp = new MonthlyEmployee(
                102, "Nour Ibrahim", Gender.FEMALE, "2023-05-10", 9000.0, 1000.0
        );

        CommissionEmployee commissionEmp = new CommissionEmployee(
                103, "Khaled Mahmoud", Gender.MALE, "2024-01-20", 60000.0, 0.08
        );

        department.addEmployee(hourlyEmp);
        department.addEmployee(monthlyEmp);
        department.addEmployee(commissionEmp);

        department.displayAllEmployees();

        System.out.println("\n--- Search Test in Main ---");
        Employee found = department.searchEmployee(102);
        if (found != null) {
            System.out.println("Found Employee: " + found.getName() + " | Salary: $" + String.format("%.2f", found.calculateSalary()));
        }
    }
}