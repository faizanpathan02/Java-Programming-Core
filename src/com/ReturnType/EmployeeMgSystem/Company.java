package com.ReturnType.EmployeeMgSystem;

public class Company {
    public static void main(String[] args) {
        Department dept = new Department();
        Employee emp = dept.addEmployee();
        System.out.println(emp.eId);
        System.out.println(emp.ename);
        System.out.println(emp.salary);
        System.out.println(" ");

        Allemployee allemployee = dept.addAllemployee();
        System.out.println(allemployee.nawazish.eId);
        System.out.println(allemployee.nawazish.ename);
        System.out.println(allemployee.nawazish.salary);
        System.out.println(" ");

        System.out.println(allemployee.arman.eId);
        System.out.println(allemployee.arman.ename);
        System.out.println(allemployee.arman.salary);
    }
}
