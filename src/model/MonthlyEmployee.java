package model;

public class MonthlyEmployee extends Employee {
    private double salary;
    private double bonus;

    public MonthlyEmployee() {
        super();
    }

    public MonthlyEmployee(int id, String name, Gender gender, double salary) {
        this(id, name, gender, salary, 0.0);
    }

    public MonthlyEmployee(int id, String name, Gender gender, double salary, double bonus) {
        super(id, name, gender);
        this.salary = salary;
        this.bonus = bonus;
    }

    public MonthlyEmployee(int id, String name, String address, Gender gender, double salary, double bonus) {
        super(id, name, address, gender);
        this.salary = salary;
        this.bonus = bonus;
    }

    public MonthlyEmployee(int id, String name, String address, String phone, Gender gender, double salary, double bonus) {
        super(id, name, address, phone, gender);
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public double earnings() {
        return salary + bonus;
    }

    public double getSalaryAmount() {
        return salary;
    }

    public void setSalaryAmount(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Type: Monthly Employee" +
                ", Base Salary: " + salary +
                ", Bonus: " + bonus +
                ", Earnings: $" + String.format("%.2f", earnings());
    }
}