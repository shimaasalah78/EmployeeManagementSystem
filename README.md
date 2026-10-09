# Employee Management System

## Student Information

- **Full Name:** Shimaa Salah Mohamed Abdelhameed
- **Section:** S4
- **Student ID:** 2300276

## Project Description

The **Employee Management System** is a Java-based application designed to represent and manage an organization's employee structure, departmental relationships, and payroll calculations. The project applies core Object-Oriented Programming (OOP) principles to build a modular, maintainable, and extensible system that models real-world employee management scenarios.

The system uses an abstract `Employee` class as the foundation for different employee categories, allowing each type to implement its own salary calculation logic while sharing common employee information and behavior. This design demonstrates how abstraction, inheritance, and polymorphism can reduce code duplication and support flexible business logic.

### Key Features

- **Employee Management:** Represents employees with essential information, including identification, name, gender, hire date, contact details, and department association.
- **Multiple Employee Types:** Supports monthly, hourly, and commission-based employees, each with its own compensation model.
- **Salary Calculation:** Calculates employee earnings according to the employee type, including monthly salary and bonus, hourly wages and overtime, or sales commission.
- **Department Management:** Organizes employees into departments and supports assigning a manager to each department.
- **Employee Search:** Provides functionality to search for employees by their ID or name.
- **Data Validation:** Uses validation and null-safety checks to help prevent invalid data and unexpected runtime errors.
- **Collection Protection:** Applies defensive copying when accessing or updating employee collections to reduce unintended external modifications.

### Object-Oriented Programming Concepts

- **Abstraction:** The abstract `Employee` class defines shared employee properties and declares the `calculateSalary()` method that concrete employee classes must implement.
- **Inheritance:** `MonthlyEmployee`, `HourlyEmployee`, and `CommissionEmployee` extend the base `Employee` class, reusing common attributes and behavior.
- **Polymorphism:** Different employee objects can be handled through the common `Employee` type while executing their own salary calculation implementations.
- **Encapsulation:** Private fields and controlled access through getters and setters help maintain data integrity.
- **Association and Aggregation:** The `Department` class manages employee relationships and maintains a reference to its manager.
- **Enumeration:** The `Gender` enum provides a predefined set of gender values, improving consistency and type safety.
- **Defensive Programming:** Input validation, null checks, and defensive copying help make the application more reliable.

### Project Goals

The main goal of this project is to demonstrate how object-oriented design can be applied to a practical business problem. It emphasizes code reusability, separation of responsibilities, maintainability, and the ability to extend the system with additional employee types or management features in the future.

## Technologies Used

- **Programming Language:** Java
- **Development Environment:** IntelliJ IDEA
- **Core Concepts:** Object-Oriented Programming, Collections, Enums, and Data Validation

## Project Structure

```text
EmployeeManagementSystem/
├── src/
│   ├── Main.java
│   ├── model/
│   │   ├── Employee.java
│   │   ├── CommissionEmployee.java
│   │   ├── MonthlyEmployee.java
│   │   ├── HourlyEmployee.java
│   │   ├── Department.java
│   │   └── Gender.java
│   └── test/
│       └── MainTest.java
└── README.md
```

## How to Run the Project

1. Install the Java Development Kit (JDK).
2. Clone or download this repository.
3. Open the project in IntelliJ IDEA.
4. Configure the project SDK to use an installed JDK.
5. Locate `src/test/MainTest.java`.
6. Run the `main()` method to execute the demonstration using sample employee and department objects.

**Note:** Ensure that `MainTest.java` contains the demonstration `main()` method and that the project source files are configured correctly before running.

## Repository

[https://github.com/shimaasalah78/EmployeeManagementSystem](https://github.com/shimaasalah78/EmployeeManagementSystem)
