package com.ReturnType.EmployeeMgSystem;

public class Department {

    public Employee addEmployee(){
        Employee digvijay = new Employee();
        digvijay.eId = 23;
        digvijay.ename = "DIGVIJAY";
        digvijay.salary = 30000;
        return digvijay;
    }

    public Allemployee addAllemployee(){
        Allemployee all = new Allemployee();

        all.nawazish.eId = 22;
        all.nawazish.ename = "NAWAZISH";
        all.nawazish.salary= 50000;

        all.digvijay.eId = 24;
        all.digvijay.ename = "DIGVIJAY";
        all.digvijay.salary = 30000;

        all.arman.eId = 25;
        all.arman.ename = "ARMAN";
        all.arman.salary = 25000;

        return all;
    }
}
