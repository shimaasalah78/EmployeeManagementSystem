# Employee Management System

## Student Information
- **Name:** Shimaa Salah Mohamed abdelhameed
- **Section:** S4
- **Student ID:** 2300276

---

## Project Description
The **Employee Management System** is an Object-Oriented Java project that models an organization's department and employee payroll hierarchy, demonstrating core OOP principles:

- **Abstraction:**
    - `Employee` is an abstract base class containing common attributes (`id`, `name`, `gender`, `hireDate`, `department`, `address`, `phone`) and the required abstract method `calculateSalary()`.

- **Inheritance:**
    - `HourlyEmployee`: Extends `Employee` to compute earnings based on hours worked and hourly rate (with overtime).
    - `MonthlyEmployee`: Extends `Employee` to compute earnings based on base monthly salary and bonus.
    - `CommissionEmployee`: Extends `Employee` to compute earnings based on gross sales and commission rate.

- **Polymorphism:**
    - Polymorphic salary calculation through `calculateSalary()`.
    - Seamless handling of different employee types inside `Department` collections.

- **Encapsulation & Defensive Programming:**
    - Private attributes with appropriate getters and setters.
    - Null-safety checks and validation to prevent `NullPointerException`.
    - Defensive copying in `getEmployees()` and `setEmployees()` to safeguard internal collections from unauthorized external modification.

- **Association & Aggregation:**
    - `Department` manages an aggregation of `Employee` objects and tracks its `manager` (`Employee`).
    - Bidirectional relationship between `Department` and `Employee`.
    - Built-in employee search (`searchEmployee`) by ID and name.

- **Enumeration:**
    - `Gender` enum representing employee gender (`MALE`, `FEMALE`).

