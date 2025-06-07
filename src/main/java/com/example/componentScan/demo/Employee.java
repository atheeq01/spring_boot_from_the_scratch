package com.example.componentScan.demo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
// can use @Component("employee01") then we are use in get bean -> "employee01"
public class Employee {

    private int employeeID;

    @Value("John")
    private String firstName;

    @Value("${java.home}")
    private String lastName;

    @Value("#{16*78}")
    private Double salary;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    //    private int employeeID;
//    @Value("Hello")
//    private String firstName;
//    @Value("${java.home}")
//    private String lastName;
//    @Value("#{4*89*96}")
//    private double salary;
//
//    public int getEmployeeID() {
//        return employeeID;
//    }
//
//    public void setEmployeeID(int employeeID) {
//        this.employeeID = employeeID;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "employeeID=" + employeeID +
//                ", firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
}
