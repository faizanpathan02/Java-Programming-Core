package com.ReturnType.StudentMgSystem;

public class University {

    public static void main(String[] args) {
        College cg = new College();
        Student std = cg.addStudent();
        System.out.println(std.rollNo);
        System.out.println(std.name);
        System.out.println(std.address);
        System.out.println(" ");

        Allstudent std1 = cg.addAllStudent();
        System.out.println(std1.Nawazish.rollNo);
        System.out.println(std1.Nawazish.name);
        System.out.println(std1.Nawazish.address);
        System.out.println(" ");

        System.out.println(std1.Digvijay.rollNo);
        System.out.println(std1.Digvijay.name);
        System.out.println(std1.Digvijay.address);
        System.out.println(" ");

        System.out.println(std1.Arman.rollNo);
        System.out.println(std1.Arman.name);
        System.out.println(std1.Arman.address);
    }


}
