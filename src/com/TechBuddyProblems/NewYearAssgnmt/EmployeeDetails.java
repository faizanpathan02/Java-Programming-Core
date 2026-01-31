package com.TechBuddyProblems.NewYearAssgnmt;

public class EmployeeDetails extends Person{


    @Override
    public void getLastName() {

        System.out.println("The employee is Software Engineer");

    }

    public void getEmployeeID(){

        System.out.println("Employee ID of Employee");
    }

    public static void main(String[] args) {

        EmployeeDetails e = new EmployeeDetails();
        e.getLastName();
        e.getEmployeeID();
    }
}
