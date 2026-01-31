package com.Scanner;
import java.util.Scanner;

public class Employee {


        int employeeId;
        String employeeName;
        String designation;
        double salary;
        boolean isCurrentEmployee;
        float bonus;
        int age;
        long mobileNo;

        void inputDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Employee ID: ");
            employeeId = sc.nextInt();

            sc.nextLine(); // consume newline

            System.out.print("Enter Employee Name: ");
            employeeName = sc.nextLine();

            System.out.print("Enter Designation: ");
            designation = sc.nextLine();

            System.out.print("Enter Salary: ");
            salary = sc.nextDouble();

            System.out.print("Is Current Employee (true/false): ");
            isCurrentEmployee = sc.nextBoolean();

            System.out.print("Enter Bonus: ");
            bonus = sc.nextFloat();

            System.out.print("Enter Age: ");
            age = sc.nextInt();

            System.out.print("Enter Mobile Number: ");
            mobileNo = sc.nextLong();
        }

        void displayDetails() {
            System.out.println("\nEmployee Details");
            System.out.println("ID: " + employeeId);
            System.out.println("Name: " + employeeName);
            System.out.println("Designation: " + designation);
            System.out.println("Salary: " + salary);
            System.out.println("Current Employee: " + isCurrentEmployee);
            System.out.println("Bonus: " + bonus);
            System.out.println("Age: " + age);
            System.out.println("Mobile No: " + mobileNo);
        }


        public static void main(String[] args) {
            Employee emp = new Employee();
            emp.inputDetails();
            emp.displayDetails();
    }

}





