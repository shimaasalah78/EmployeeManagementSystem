package model;

public class MonthlyEmployee extends Employee {
    private double salary; // Base salary
    private double bonus;  // Bonus

    public MonthlyEmployee() {
        super();
    }

    public MonthlyEmployee(int id, String name, Gender gender, double salary) {
        this(id, name, gender, salary, 0.0);
    }

    public MonthlyEmployee(int id, String name, Gender gender, double salary, double bonus) {
        super(id, name, gender);
        setBaseSalary(salary);
        setBonus(bonus);
    }

    public MonthlyEmployee(int id, String name, Gender gender, String hireDate, double salary, double bonus) {
        super(id, name, gender, hireDate);
        setBaseSalary(salary);
        setBonus(bonus);
    }

    public MonthlyEmployee(int id, String name, String address, Gender gender, double salary, double bonus) {
        super(id, name, address, gender);
        setBaseSalary(salary);
        setBonus(bonus);
    }

    public MonthlyEmployee(int id, String name, String address, String phone, Gender gender, String hireDate, double salary, double bonus) {
        super(id, name, address, phone, gender, hireDate);
        setBaseSalary(salary);
        setBonus(bonus);
    }

    public MonthlyEmployee(int id, String name, String address, String phone, Gender gender, String hireDate, Department department, double salary, double bonus) {
        super(id, name, address, phone, gender, hireDate, department);
        setBaseSalary(salary);
        setBonus(bonus);
    }

    @Override
    public double calculateSalary() {
        return salary + bonus;
    }

    @Override
    public double earnings() {
        return calculateSalary();
    }

    public double getBaseSalary() {
        return salary;
    }

    public double getSalaryAmount() {
        return salary;
    }

    public void setBaseSalary(double salary) {
        this.salary = Math.max(0.0, salary);
    }

    public void setSalaryAmount(double salary) {
        setBaseSalary(salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = Math.max(0.0, bonus);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Type: Monthly Employee" +
                ", Base Salary: " + salary +
                ", Bonus: " + bonus +
                ", Earnings: $" + String.format("%.2f", calculateSalary());
    }
}