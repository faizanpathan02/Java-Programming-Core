package com.TechBuddyProblems.NewYearAssgnmt.EmployeeAssignment;

public class Tester extends Employee {

    String name = "Arman";
    String address = "Nigdi";
    int salary = 30000;
    String jobTitle = "QA Tester";


    @Override
    public void calculateBonus() {
        System.out.println("Bonus of the Tester");
    }

    @Override
    public void generateReport() {
        System.out.println("Report of the Tester");
    }

    @Override
    public void manageProject() {
        System.out.println("\nTester tests the project");
    }

    public static void main(String[] args) {
        Employee arman = new Tester();

        System.out.println("\n----------------------TESTER DETAILS--------------------");
        arman.manageProject();
        arman.calculateBonus();
        arman.generateReport();

        System.out.println("\n----------------------MANAGER DETAILS--------------------");
        Employee faizan = new Manager();
        faizan.manageProject();
        faizan.calculateBonus();
        faizan.generateReport();

        System.out.println("\n----------------------DEVELOPER DETAILS--------------------");
        Employee digvijay = new Developer();
        digvijay.manageProject();
        digvijay.calculateBonus();
        digvijay.generateReport();
    }
}
