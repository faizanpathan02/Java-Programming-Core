package com.Collection.Set.Employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeAdmin {
    public static void main(String[] args) {

        Employee e1 = new Employee(1,"Arman");
        Employee e2 = new Employee(1,"Arman");

        Set<Employee> setofemployee = new HashSet<Employee>();
        setofemployee.add(e1);
        setofemployee.add(e2);
        System.out.println(setofemployee.size());
    }
}
