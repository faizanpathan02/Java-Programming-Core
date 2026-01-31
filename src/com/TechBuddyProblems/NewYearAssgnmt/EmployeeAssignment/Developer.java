package com.TechBuddyProblems.NewYearAssgnmt.EmployeeAssignment;

public class Developer extends Employee {

    String name = "Digvijay";
    String address = "Hinjewadi";
    int salary = 30000;
    String jobTitle = "Java Developer";


    @Override
    public void calculateBonus() {
        System.out.println("Bonus of Developer");
    }

    @Override
    public void generateReport() {
        System.out.println("Report of Developer");
    }

    @Override
    public void manageProject() {
        System.out.println("\nDeveloper is the one who develops the project");
    }
}
