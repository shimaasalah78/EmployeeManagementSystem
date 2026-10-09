package model;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee() {
        super();
    }

    public CommissionEmployee(int id, String name, Gender gender, double grossSales, double commissionRate) {
        super(id, name, gender);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public CommissionEmployee(int id, String name, Gender gender, String hireDate, double grossSales, double commissionRate) {
        super(id, name, gender, hireDate);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public CommissionEmployee(int id, String name, String address, Gender gender, double grossSales, double commissionRate) {
        super(id, name, address, gender);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public CommissionEmployee(int id, String name, String address, String phone, Gender gender, String hireDate, double grossSales, double commissionRate) {
        super(id, name, address, phone, gender, hireDate);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public CommissionEmployee(int id, String name, String address, String phone, Gender gender, String hireDate, Department department, double grossSales, double commissionRate) {
        super(id, name, address, phone, gender, hireDate, department);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    @Override
    public double calculateSalary() {
        return grossSales * commissionRate;
    }

    @Override
    public double earnings() {
        return calculateSalary();
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = Math.max(0.0, grossSales);
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = Math.max(0.0, commissionRate);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Type: Commission Employee" +
                ", Gross Sales: " + grossSales +
                ", Commission Rate: " + commissionRate +
                ", Earnings: $" + String.format("%.2f", calculateSalary());
    }
}