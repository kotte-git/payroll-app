package com.payroll;

public class App {
    public static void main(String[] args) {
        // Inputs
        double basicSalary = 50000.0;
        
        // Allowances
        double hra = basicSalary * 0.15; // 15% House Rent Allowance
        double da = basicSalary * 0.10;  // 10% Dearness Allowance
        
        // Deductions
        double pf = basicSalary * 0.12;  // 12% Provident Fund
        double tax = (basicSalary + hra + da) * 0.05; // 5% Income Tax
        
        // Calculation
        double netSalary = (basicSalary + hra + da) - (pf + tax);
        
        System.out.println("--- Employee Payroll Report ---");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra + " | DA: " + da);
        System.out.println("PF: " + pf + " | Tax: " + tax);
        System.out.println("-------------------------------");
        System.out.println("Net Salary: " + netSalary);
    }
}

