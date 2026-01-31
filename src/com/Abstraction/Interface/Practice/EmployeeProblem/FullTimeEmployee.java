package com.Abstraction.Interface.Practice.EmployeeProblem;

public class FullTimeEmployee implements EmployeeService{

    @Override
    public void calculateSalary() {
        System.out.println("Salary of full time employee is : "+70000);
    }

    @Override
    public void getBenefits() {
        System.out.println("Benefits of full time employee are Salary + Bonus + Incentive");
    }
}
