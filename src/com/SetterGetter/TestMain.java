package com.SetterGetter;

public class TestMain {

    public static void main(String[] args) {
    Employee e = new Employee();

        e.setId(11);
        e.setName("Digvijay");
        e.setSalary(30000.0);

        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());

        Employee faizanemp = new Employee();
        faizanemp.setId(12);
        faizanemp.setName("Faizan");
        faizanemp.setSalary(20000.0);
        System.out.println(" ");
//        System.out.println(faizanemp.getId());
        System.out.println(" ");

        AllEmployee emp = new AllEmployee();
        emp.setFaizan(faizanemp);
        System.out.println(emp.getFaizan().getId());
        System.out.println(emp.getFaizan().getName());
        System.out.println(emp.getFaizan().getSalary());
        System.out.println(" ");



        Employee amanemp = new Employee();
        amanemp.setId(13);
        amanemp.setName("Aman");
        amanemp.setSalary(40000.0);
        emp.setAman(amanemp);
        System.out.println(emp.getAman().getId());
        System.out.println(emp.getAman().getName());
        System.out.println(emp.getAman().getSalary());


    }

}
