package com.Day4;
// Step 1: Define the Payable interface
interface Payable {
    void generatePayslip();
}

// Step 2: Implement Contractor class
class Contractor implements Payable {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public Contractor(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementation of generatePayslip()
    public void generatePayslip() {
        double pay = hourlyRate * hoursWorked;
        System.out.println("Contractor Payslip");
        System.out.println("------------------");
        System.out.println("Name: " + name);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Pay: " + pay);
        System.out.println();
    }
}

// Step 3: Implement FullTimeEmployee class
class FullTimeEmployee implements Payable {
    private String name;
    private double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    // Implementation of generatePayslip()
    public void generatePayslip() {
        System.out.println("Full-Time Employee Payslip");
        System.out.println("--------------------------");
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println();
    }
}

// Step 4: Demonstrate interface polymorphism
public class PayableDemo {
    public static void main(String[] args) {
        // Create objects
        Payable contractor = new Contractor("Ragu", 600, 50);
        Payable fullTime = new FullTimeEmployee("Sannu", 60000);

        // Polymorphism: both objects share the same interface type
        contractor.generatePayslip();
        fullTime.generatePayslip();
    }
}

