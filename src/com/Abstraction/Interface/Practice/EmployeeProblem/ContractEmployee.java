package com.Abstraction.Interface.Practice.EmployeeProblem;

public class ContractEmployee implements EmployeeService{

    @Override
    public void calculateSalary() {
        System.out.println("Salary of Cantractual Employee is Rs.30000");
    }

    @Override
    public void getBenefits() {
        System.out.println("Contractual Employee does not have any benefits");
    }
}
