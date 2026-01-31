package com.Abstraction.Interface.Practice.EmployeeProblem;

import com.TechBuddyProblems.NewYearAssgnmt.EmployeeAssignment.Employee;

public class Manager {

    public static void main(String[] args) {

        System.out.println("\n---------------------FULL TIME EMPLOYEE DETAILS----------------------------");
        EmployeeService es1 = new FullTimeEmployee();
        es1.calculateSalary();
        es1.getBenefits();

        System.out.println("\n---------------------PART TIME EMPLOYEE DETAILS----------------------------");
        EmployeeService es2 = new PartTimeEmployee();
        es2.calculateSalary();
        es2.getBenefits();

        System.out.println("\n---------------------CONTRACT EMPLOYEE DETAILS----------------------------");
        EmployeeService es3 = new PartTimeEmployee();
        es3.calculateSalary();
        es3.getBenefits();
    }
}
