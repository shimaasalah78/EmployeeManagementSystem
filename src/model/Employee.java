package model;

public abstract class Employee {
    private int id;
    private String name;
    private String address;
    private String phone;
    private Gender gender;

    public Employee() {
    }

    public Employee(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Employee(int id, String name, String address, Gender gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    public Employee(int id, String name, String address, String phone, Gender gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
    }

    // Abstract method to calculate earnings/salary
    public abstract double earnings();

    public double getSalary() {
        return earnings();
    }

    public double calculateSalary() {
        return earnings();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Gender: " + gender +
                (address != null && !address.isEmpty() ? ", Address: " + address : "") +
                (phone != null && !phone.isEmpty() ? ", Phone: " + phone : "");
    }
}