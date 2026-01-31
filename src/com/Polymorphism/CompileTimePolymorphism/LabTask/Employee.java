package com.Polymorphism.CompileTimePolymorphism.LabTask;

public class Employee {
    int eid;
    String name;
    double salary;
    long adhaarNumber;
    String panNumber;
    int age;
}

class Printer {

    public void print(int eid, String name, long adhaarNumber, String panNumber){

        System.out.println("ID :" +eid );
        System.out.println("Name :" +name );
        System.out.println("Adhaar Number :" +adhaarNumber );
        System.out.println("Pan Number :" +panNumber );
    }

    public void print(int eid, String name, double salary){
        System.out.println("ID :" +eid );
        System.out.println("Name :" +name );
        System.out.println("Salary :" +salary);
    }


    public static void main(String[] args) {
        Employee e = new Employee();
        e.eid = 1;
        e.name = "Faizan";
        e.age = 24;
        e.salary = 50000;
        e.adhaarNumber = 223243536546l;
        e.panNumber = "12345";

        Printer p = new Printer();
        p.print(e.eid,e.name, e.adhaarNumber,e.panNumber);
        p.print(e.eid, e.name, e.salary);
    }

}
