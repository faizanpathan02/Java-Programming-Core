package com.Abstraction.Interface.Practice.EmployeeProblem;

public class PartTimeEmployee implements EmployeeService {

    @Override
    public void calculateSalary() {
        System.out.println("Salary of Part time Employee is 50000");
    }

    @Override
    public void getBenefits() {
        System.out.println("Benefits of part time employee are Salary + Incentive");
    }
}
