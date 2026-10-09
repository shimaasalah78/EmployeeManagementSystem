package model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private int deptId;
    private String deptName;
    private Employee manager;
    private List<Employee> employees;

    public Department() {
        this.employees = new ArrayList<>();
    }

    public Department(int deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public Department(int deptId, String deptName, Employee manager) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.manager = manager;
        this.employees = new ArrayList<>();
        if (manager != null) {
            addEmployee(manager);
        }
    }

    public void addEmployee(Employee employee) {
        if (employee != null && !employees.contains(employee)) {
            employees.add(employee);
            employee.setDepartment(this);
        }
    }

    public boolean removeEmployee(Employee employee) {
        if (employee == null) {
            return false;
        }
        boolean removed = employees.remove(employee);
        if (removed && employee.getDepartment() == this) {
            employee.setDepartment(null);
        }
        return removed;
    }

    public boolean removeEmployee(int id) {
        Employee emp = searchEmployee(id);
        if (emp != null) {
            return removeEmployee(emp);
        }
        return false;
    }

    // Search by ID (Returns Employee or null)
    public Employee searchEmployee(int id) {
        for (Employee emp : employees) {
            if (emp != null && emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    // Search by Name
    public Employee searchEmployee(String name) {
        if (name == null) {
            return null;
        }
        for (Employee emp : employees) {
            if (emp != null && name.equalsIgnoreCase(emp.getName())) {
                return emp;
            }
        }
        return null;
    }

    public int getEmployeeCount() {
        return employees.size();
    }

    public double calculateTotalPayroll() {
        double total = 0.0;
        for (Employee emp : employees) {
            if (emp != null) {
                total += emp.calculateSalary();
            }
        }
        return total;
    }

    public void displayAllEmployees() {
        System.out.println("==================================================");
        System.out.println("Department: " + deptName + " (ID: " + deptId + ")");
        if (manager != null) {
            System.out.println("Manager: " + manager.getName() + " (ID: " + manager.getId() + ")");
        } else {
            System.out.println("Manager: None assigned");
        }
        System.out.println("Total Employees: " + employees.size());
        System.out.println("--------------------------------------------------");
        if (employees.isEmpty()) {
            System.out.println("No employees in this department.");
        } else {
            for (Employee emp : employees) {
                if (emp != null) {
                    System.out.println(emp);
                }
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

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
        if (manager != null) {
            addEmployee(manager);
        }
    }

    // Defensive copy to prevent external modification
    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    // Null-safe setter
    public void setEmployees(List<Employee> employeeList) {
        this.employees.clear();
        if (employeeList != null) {
            for (Employee emp : employeeList) {
                if (emp != null && !this.employees.contains(emp)) {
                    this.employees.add(emp);
                    emp.setDepartment(this);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", manager=" + (manager != null ? manager.getName() : "None") +
                ", totalEmployees=" + employees.size() +
                ", totalPayroll=$" + String.format("%.2f", calculateTotalPayroll()) +
                '}';
    }
}