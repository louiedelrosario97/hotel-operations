package com.pluralsight;

public class Employee

{
    // Declared Variables
    private String employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double otHours;

    // Constructor
    public Employee(String employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters
    public String getEmployeeID() { return employeeID; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getPayRate() { return payRate; }
    public double getHoursWorked() { return hoursWorked; }
    public double getOtHours() { return otHours; }

    // Derived Getters
    public double getRegularHours()
    {
        if (hoursWorked <= 40) { return hoursWorked; }
        else { return 40; }
    }


    public double getOvertimeHours()
    {
        if (hoursWorked > 40) { return hoursWorked - 40; }
        else { return 0; }
    }

    public double getTotalPay()
    {
        { return (payRate * hoursWorked) + (payRate * otHours); }
    }

}

