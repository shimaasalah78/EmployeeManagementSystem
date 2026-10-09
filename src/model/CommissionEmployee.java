package model;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee() {
        super();
    }

    public CommissionEmployee(int id, String name, Gender gender, double grossSales, double commissionRate) {
        super(id, name, gender);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public CommissionEmployee(int id, String name, String address, Gender gender, double grossSales, double commissionRate) {
        super(id, name, address, gender);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public CommissionEmployee(int id, String name, String address, String phone, Gender gender, double grossSales, double commissionRate) {
        super(id, name, address, phone, gender);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Type: Commission Employee" +
                ", Gross Sales: " + grossSales +
                ", Commission Rate: " + commissionRate +
                ", Earnings: $" + String.format("%.2f", earnings());
    }
}