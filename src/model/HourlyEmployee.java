package model;

public class HourlyEmployee extends Employee {
    private double hourRate;
    private int hoursWorked;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(int id, String name, Gender gender, double hourRate, int hoursWorked) {
        super(id, name, gender);
        this.hourRate = hourRate;
        this.hoursWorked = hoursWorked;
    }

    public HourlyEmployee(int id, String name, String address, Gender gender, double hourRate, int hoursWorked) {
        super(id, name, address, gender);
        this.hourRate = hourRate;
        this.hoursWorked = hoursWorked;
    }

    public HourlyEmployee(int id, String name, String address, String phone, Gender gender, double hourRate, int hoursWorked) {
        super(id, name, address, phone, gender);
        this.hourRate = hourRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double earnings() {
        if (hoursWorked <= 40) {
            return hoursWorked * hourRate;
        } else {
            return (40 * hourRate) + ((hoursWorked - 40) * hourRate * 1.5);
        }
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Type: Hourly Employee" +
                ", Hour Rate: " + hourRate +
                ", Hours Worked: " + hoursWorked +
                ", Earnings: $" + String.format("%.2f", earnings());
    }
}