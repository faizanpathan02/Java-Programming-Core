package com.TechBuddyProblems.NewYearAssgnmt.EmployeeAssignment;

public class Manager extends Employee {

    String name = "Faizan";
    String address = "Pcmc";
    int salary = 50000;
    String jobTitle = "Manager";

    @Override
    public void calculateBonus() {
        System.out.println("Bonus of Manager");
    }

    @Override
    public void generateReport() {
        System.out.println("Report of Manager");
    }

    @Override
    public void manageProject() {
        System.out.println("\nManager is the one who manages project");
    }
}
