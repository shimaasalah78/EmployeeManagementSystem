package model;

import java.util.Objects;

public abstract class Employee {
    private int id;
    private String name;
    private String address;
    private String phone;
    private Gender gender;
    private String hireDate;
    private Department department;

    public Employee() {
    }

    public Employee(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public Employee(int id, String name, Gender gender, String hireDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    public Employee(int id, String name, String address, Gender gender) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    public Employee(int id, String name, String address, String phone, Gender gender, String hireDate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.hireDate = hireDate;
    }

    public Employee(int id, String name, String address, String phone, Gender gender, String hireDate, Department department) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
        this.hireDate = hireDate;
        this.department = department;
    }

    // Abstract method to calculate salary
    public abstract double calculateSalary();

    // Delegate methods for backward compatibility
    public double earnings() {
        return calculateSalary();
    }

    public double getSalary() {
        return calculateSalary();
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

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Gender: " + gender +
                (hireDate != null && !hireDate.isEmpty() ? ", HireDate: " + hireDate : "") +
                (department != null ? ", Dept: " + department.getDeptName() : "") +
                (address != null && !address.isEmpty() ? ", Address: " + address : "") +
                (phone != null && !phone.isEmpty() ? ", Phone: " + phone : "");
    }
}