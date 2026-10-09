package model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private int deptId;
    private String deptName;
    private List<Employee> employees;

    public Department() {
        this.employees = new ArrayList<>();
    }

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        if (employee != null) {
            employees.add(employee);
        }
    }

    public boolean removeEmployee(Employee employee) {
        return employees.remove(employee);
    }

    public boolean removeEmployee(int id) {
        return employees.removeIf(emp -> emp.getId() == id);
    }

    public int getEmployeeCount() {
        return employees.size();
    }

    public double calculateTotalPayroll() {
        double total = 0.0;
        for (Employee emp : employees) {
            total += emp.earnings();
        }
        return total;
    }

    public void displayAllEmployees() {
        System.out.println("==================================================");
        System.out.println("Department: " + deptName + " (ID: " + deptId + ")");
        System.out.println("Total Employees: " + employees.size());
        System.out.println("--------------------------------------------------");
        if (employees.isEmpty()) {
            System.out.println("No employees in this department.");
        } else {
            for (Employee emp : employees) {
                System.out.println(emp);
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.printf("Total Payroll: $%.2f%n", calculateTotalPayroll());
        System.out.println("==================================================");
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", totalEmployees=" + employees.size() +
                ", totalPayroll=$" + String.format("%.2f", calculateTotalPayroll()) +
                '}';
    }
}