package com.TechBuddyProblems.NewYearAssgnmt;

public class HRManager extends Employee{

    @Override
    public void work() {
        System.out.println("HR Manager work");
    }

    public void addEmployee(){
        System.out.println("HR Manager adds the employee");
    }

    public static void main(String[] args) {

        HRManager employee = new HRManager();
        employee.work();
        employee.addEmployee();


    }
}
