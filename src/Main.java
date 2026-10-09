import model.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("    Welcome to Employee Management System        ");
        System.out.println("==================================================");

        Department department = new Department(1, "Software Engineering");

        HourlyEmployee hourlyEmp = new HourlyEmployee(
                101, "Youssef Ahmed", "Cairo", "01000000001", Gender.MALE, 40.0, 42
        );

        MonthlyEmployee monthlyEmp = new MonthlyEmployee(
                102, "Nour Ibrahim", "Giza", "01000000002", Gender.FEMALE, 9000.0, 1000.0
        );

        CommissionEmployee commissionEmp = new CommissionEmployee(
                103, "Khaled Mahmoud", "Alexandria", "01000000003", Gender.MALE, 60000.0, 0.08
        );

        department.addEmployee(hourlyEmp);
        department.addEmployee(monthlyEmp);
        department.addEmployee(commissionEmp);

        department.displayAllEmployees();
    }
}