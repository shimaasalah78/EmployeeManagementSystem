package model;

public class HourlyEmployee extends Employee {
    private double hourRate;
    private int hoursWorked;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(int id, String name, Gender gender, double hourRate, int hoursWorked) {
        super(id, name, gender);
        setHourRate(hourRate);
        setHoursWorked(hoursWorked);
    }

    public HourlyEmployee(int id, String name, Gender gender, String hireDate, double hourRate, int hoursWorked) {
        super(id, name, gender, hireDate);
        setHourRate(hourRate);
        setHoursWorked(hoursWorked);
    }

    public HourlyEmployee(int id, String name, String address, Gender gender, double hourRate, int hoursWorked) {
        super(id, name, address, gender);
        setHourRate(hourRate);
        setHoursWorked(hoursWorked);
    }

    public HourlyEmployee(int id, String name, String address, String phone, Gender gender, String hireDate, double hourRate, int hoursWorked) {
        super(id, name, address, phone, gender, hireDate);
        setHourRate(hourRate);
        setHoursWorked(hoursWorked);
    }

    public HourlyEmployee(int id, String name, String address, String phone, Gender gender, String hireDate, Department department, double hourRate, int hoursWorked) {
        super(id, name, address, phone, gender, hireDate, department);
        setHourRate(hourRate);
        setHoursWorked(hoursWorked);
    }

    @Override
    public double calculateSalary() {
        if (hoursWorked <= 40) {
            return hoursWorked * hourRate;
        } else {
            return (40 * hourRate) + ((hoursWorked - 40) * hourRate * 1.5);
        }
    }

    @Override
    public double earnings() {
        return calculateSalary();
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = Math.max(0.0, hourRate);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = Math.max(0, hoursWorked);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Type: Hourly Employee" +
                ", Hour Rate: " + hourRate +
                ", Hours Worked: " + hoursWorked +
                ", Earnings: $" + String.format("%.2f", calculateSalary());
    }
}